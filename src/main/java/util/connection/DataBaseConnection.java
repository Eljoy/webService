package util.connection;

import java.sql.Connection;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Home on 07.01.2015.
 */
public class DataBaseConnection {
   private String host, root, password, nameDB, url;
   private Properties properties = new Properties();
   private Connection mysqlconnection;

    public DataBaseConnection(String host, String root, String password, String nameDB) {
       this.host = host;
       this.root = root;
       this.nameDB = nameDB;
       this.password = password;
   }
    public DataBaseConnection(Properties properties, String url) {
        this.url = url;
        this.properties = properties;
    }

    public void initProperties(){
        url = "jdbc:mysql://" + host + "/" + nameDB;
        properties.setProperty("user", root);
        properties.setProperty("password", password);
        properties.setProperty("characterEncoding", "UTF-8" );
        properties.setProperty("useUnicode", "true");

        System.out.println(url);
    }
    public void init() {
        if(mysqlconnection == null) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mysqlconnection = DriverManager.getConnection(url, root, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        }
    }
    public void close() {
        try {
            mysqlconnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet query (String query) {
        try {
            PreparedStatement statement = mysqlconnection.prepareStatement(query);
            //statement.setString(1, "Detroit");
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public  void updateQuery (String query) {
        try {
            Statement statement = mysqlconnection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
