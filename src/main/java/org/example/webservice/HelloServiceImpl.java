package org.example.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.webservice.HelloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
 		return "Hello " + name;
    }
}
