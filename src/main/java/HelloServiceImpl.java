import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * Created by IGazdaliev on 02.06.2015.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello(String name) throws Exception {
        return "Hello, " + name + "!";
    }

    @Override
    public Calendar getCurrentTime() {
        return Calendar.getInstance();
    }
}
