
import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import com.itheima.domain.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {

    private InputStream inputStream;
    private SqlSession sqlSession;
    private IUserDao iUserDao;

    @Test
    public void test(){
        System.out.println("ll");
    }
    @Before
    public void init() throws IOException {
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //将主配置文件加载成流
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //使用sqlSessionFactoryBuilder创建一个SqlSessionFactory对象
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(inputStream);
        //使用工厂对象创建sqlSession对象
        sqlSession = factory.openSession();
        //使用sqlSession对象创建dao接口的代理对象
        iUserDao = sqlSession.getMapper(IUserDao.class);

    }
    @After
    public void  destroy() throws IOException {
        //提交事务
        sqlSession.commit();
        //关闭流资源
        inputStream.close();
        sqlSession.close();
    }
    @Test
    public void test2(){
        List<User> list = iUserDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void test3(){
        User user = new User(null,"小童","女",getCurrentTime(),"中国");
        int i = iUserDao.addUser(user);
        System.out.println(i);
    }
    @Test
    public void test4(){
        int i = iUserDao.deleteUser(5);
        System.out.println(i);
    }
    @Test
    public void test5(){
        User user = new User();
        user.setId(4);
        user.setUsername("卢锡安");
        iUserDao.updateUser(user);
    }
    @Test
    public void test6(){
        HashMap<String ,Object> hm = new HashMap();
        hm.put("name", "小童");
        hm.put("uid", 4);
        iUserDao.updateUserByMap(hm);
    }
    @Test
    public void test7(){
        User user = iUserDao.findUser(4);
        System.out.println(user);
    }
    @Test
    public void test8(){
        Map<String, Object> map = iUserDao.findUserById(4);
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }
    }
    @Test
    public void test9(){
        String usernameById = iUserDao.findUsernameById(4);
        System.out.println(usernameById);
    }
    @Test
    public void test10(){
        long count = iUserDao.findAllUserCount();
        System.out.println(count);
    }
    @Test
    public void test11(){
        String username="%小%";
        List<User> userList = iUserDao.findUserByUsername(username);
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public void test12(){
        String username="小";
        List<User> userList = iUserDao.findUserByUsername(username);
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public void test13(){
        QueryVo queryVo = new QueryVo();
        User user = new User(null,"小童",null,null,null);
        queryVo.setUser(user);
        User user1 = iUserDao.findUserByQueryVo(queryVo);
        System.out.println(user1);
    }
    @Test
    public void test14(){
        UserInfo userByUserInfoId = iUserDao.findUserByUserInfoId(3);
        System.out.println(userByUserInfoId);
    }
    @Test
    public void test15(){

    }
    @Test
    public void test16(){

    }

    private String getCurrentTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }
}
