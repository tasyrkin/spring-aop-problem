import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbug.Client;

public class Main {

    public static void main(String[] args) {

        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        final Client client = ctx.getBean(Client.class);
        System.out.println(client);


    }
}
