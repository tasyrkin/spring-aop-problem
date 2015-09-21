package springbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private final MyChildClass myChildClass;

    @Autowired
    public Client(MyChildClass myChildClass) {
        this.myChildClass = myChildClass;
    }
}
