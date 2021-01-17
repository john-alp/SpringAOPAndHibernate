package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* get*())")
    private void beforeGetBookTest() {
        System.out.println("may");
    }

    @Before("execution(public void getBook())") //pointcut
    public void  beforeGetBookAdvice() { //Advice что должно происходить
        System.out.println("beforeGetBookAdvice: try get the book");
    }
}
