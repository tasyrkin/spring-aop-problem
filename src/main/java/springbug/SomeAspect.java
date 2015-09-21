package springbug;

import com.google.common.base.Joiner;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Order(100)
@Component
public class SomeAspect {

    private final static Logger logger = Logger.getLogger(SomeAspect.class);

    @Around("execution(* *(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        final Method methodSignature = MethodSignature.class.cast(pjp.getSignature()).getMethod();

        logger.info(String.format("%s method=[%s %s.%s(%s)]",
                "ASPECT_BEFORE_FUNCTION",
                methodSignature.getReturnType().getName(),
                methodSignature.getDeclaringClass().getCanonicalName(),
                methodSignature.getName(),
                Joiner.on(",").join(pjp.getArgs())));

        final Object result = pjp.proceed();

        logger.info(String.format("%s result=[%s]", "ASPECT_AFTER_FUNCTION", result));

        return result;
    }
}