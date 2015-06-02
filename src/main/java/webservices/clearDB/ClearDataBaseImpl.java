package webservices.clearDB;

import util.connection.DataBaseConnection;

import javax.jws.WebService;

/**
 * Created by Home on 6/2/2015.
 */
@WebService(endpointInterface = "webservices.clearDB.ClearDataBaseService")
public class ClearDataBaseImpl implements ClearDataBaseService {
    @Override
    public String clearFriends(String username) {

        DataBaseConnection connection = new DataBaseConnection("localhost","root", "1234", "test");
        connection.initProperties();
        connection.init();
        connection.updateQuery("delete FROM test.friends where friends.reqStatus = 'unfollow' and friends.respStatus = 'unfollow';");
        return username + ", initiated friends cleaning";
    }
}
