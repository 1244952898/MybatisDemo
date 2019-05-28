import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.TbAddress;
import pojo.TbUser;
import utils.SqlSessionFactoryUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

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
        TbAddress tbAddress = sqlSession.selectOne("TbAddressMapperAbc.getEntityById",60);
        System.out.println(tbAddress);
        sqlSession.close();
    }

    @Test
    public void getUserByLike()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TbUser> userList=sqlSession.selectList("mapping.TbUserMapper.getUserByLikeName","a");
        for (TbUser user: userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void insertAddress()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbAddress address=new TbAddress();
        address.setAddress("address1");
        address.setAlias("alias1");
        address.setCityId("cityid1");
        address.setContact("contact1");
        address.setCreateDate(new Date());
        address.setIsDefault("1");
        address.setMobile("mobile1");
        address.setNotes("notes1");
        address.setProvinceId("proviceid1");
        address.setTownId("townId1");
        address.setUserId("UserId1");
        sqlSession.insert("TbAddressMapperAbc.insertEntity",address);
        sqlSession.commit();
        System.out.println(address.getId());
        sqlSession.close();
    }

    @Test
    public void insertAddress1()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbAddress address=new TbAddress();
        address.setAddress("address2");
        address.setAlias("alias2");
        address.setCityId("cityid2");
        address.setContact("contact2");
        address.setCreateDate(new Date());
        address.setIsDefault("1");
        address.setMobile("mobile2");
        address.setNotes("notes2");
        address.setProvinceId("proviceid2");
        address.setTownId("townId2");
        address.setUserId("UserId1");
        sqlSession.insert("TbAddressMapperAbc.insertEntity",address);
        sqlSession.commit();
        System.out.println(address.getId());
        sqlSession.close();
    }

    @Test
    public void insertAddressUUID()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbAddress address=new TbAddress();
        address.setAddress("address6");
        address.setAlias("alias6");
        address.setCityId("cityid3");
        address.setContact("contact3");
        address.setCreateDate(new Date());
        address.setIsDefault("1");
        address.setMobile("mobile3");
       // address.setNotes("notes2");
        address.setProvinceId("proviceid3");
        address.setTownId("townId3");
        address.setUserId("UserId3");
        sqlSession.insert("TbAddressMapperAbc.insertEntityUUID2",address);
        sqlSession.commit();
        System.out.println(address.getId());
        sqlSession.close();
    }

    @Test
    public void updateAddressUUID()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbAddress address=new TbAddress();
        address.setUserId("UserIdaaaa");
        address.setId(70L);
       int row = sqlSession.update("TbAddressMapperAbc.updateEntityById",address);
        sqlSession.commit();
        System.out.println(row);
        sqlSession.close();
    }

    @Test
    public void delAddressUUID()throws IOException{
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        int row =  sqlSession.delete("TbAddressMapperAbc.delEntityById",70);
        sqlSession.commit();
        System.out.println(row);
        sqlSession.close();
    }
}
