package webservices.clearDB;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Home on 6/2/2015.
 */
@WebService
public interface ClearDataBaseService {
    @WebMethod(action = "clear-data-base")
    public String clearFriends(String username);
}
