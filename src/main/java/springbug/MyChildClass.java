package springbug;

import org.springframework.stereotype.Component;

@Component
public class MyChildClass extends ParentClass {
    @Override
    public void f() throws Exception {

    }
}
