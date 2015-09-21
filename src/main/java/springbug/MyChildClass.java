package springbug;

import org.springframework.stereotype.Component;

@Component
public class MyChildClass extends ParentClass {
    @Override
    public void installEngine(String binaryURL, String manifestURL, String engineVersion, boolean isPrimaryReplica) throws Exception {

    }
}
