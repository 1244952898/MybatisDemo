import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.TbAddress;
import pojo.TbUser;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public  void getUserById() throws IOException {
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        String resource = "MyBatis/SqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);

SqlSessionFactory sqlSessionFactory= ssfb.build(inputStream);
SqlSession sqlSession = sqlSessionFactory.openSession();
        TbUser user=sqlSession.selectOne("mapping.TbUserMapper.getUserById",1);
        System.out.println(user);
        sqlSession.close();

    }

    @Test
    public void getEntityForAddressById() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("MyBatis/SqlMapConfig.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbAddress tbAddress = sqlSession.selectOne("TbAddressMapperAbc.getEntityById",59);
        System.out.println(tbAddress);
        sqlSession.close();
    }
}
