package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {  // для запуска таргет метода
        System.out.println("aroundReturnBookLoggingAdvice: returns TRY the book to the library");
        long begin = System.currentTimeMillis();

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed(); // proceed - запуск таргет метода
        } catch (Exception e) {
            System.out.println("Exception logging of aroundReturnBookLoggingAdvice: " + e);
          //  targetMethodResult = "Unknown";
            throw e; // бросаем исключение дальше. return есстественно не сработает
        }

        //targetMethodResult = "Who say May"; //изменили return target метода

        System.out.println("aroundReturnBookLoggingAdvice: returns SUCCESS the book to the library");
        System.out.println("program running time:  " + (System.currentTimeMillis() - begin));
        return targetMethodResult;
    }
}
