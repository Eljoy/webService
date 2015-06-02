import java.util.Calendar;

/**
 * Created by IGazdaliev on 02.06.2015.
 */
public interface HelloService {
    public String getHello(String name) throws Exception;
    public Calendar getCurrentTime();
}
