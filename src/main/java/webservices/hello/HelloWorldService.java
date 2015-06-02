package webservices.hello;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Home on 6/2/2015.
 */
@WebService
public interface HelloWorldService {
    @WebMethod(action = "say-hello-world")
    public String sayHelloWorld(String name);
}
