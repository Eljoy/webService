package webservices.hello;

import javax.jws.WebService;

/**
 * Created by Home on 6/2/2015.
 */
@WebService(endpointInterface = "webservices.hello.HelloWorldService")
public class HelloWorldImpl implements HelloWorldService {
    @Override
    public String sayHelloWorld(String name) {
        return "Hello World, from, " + name;
    }
}
