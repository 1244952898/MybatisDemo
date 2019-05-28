import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import javax.sql.DataSource;
import java.util.Properties;

public class MyBatis2 {
    @Test
    public void  Configration(){
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        PooledDataSourceFactory pooledDataSourceFactory=new PooledDataSourceFactory();
        Properties properties=new Properties();
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://120.27.213.67:3306/pinyougoudb?characterEncoding=utf-8");
        properties.setProperty("username","root");
        properties.setProperty("password","uAiqwVwjJ8-i");
        pooledDataSourceFactory.setProperties(properties);
        DataSource dataSource = pooledDataSourceFactory.getDataSource();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration=new Configuration(environment);
       // configuration.addMappers();
    }
}
