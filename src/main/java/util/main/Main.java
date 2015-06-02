package util.main;

import util.connection.DataBaseConnection;

import java.sql.ResultSet;

/**
 * Created by Home on 6/2/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        DataBaseConnection connection = new DataBaseConnection("localhost","root", "1234", "test");
        connection.initProperties();
        connection.init();

        connection.updateQuery("delete FROM test.friends where friends.reqStatus = 'unfollow' and friends.respStatus = 'unfollow';");

    }
}
