package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.reflect.generics.tree.MethodTypeSignature;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods() ")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments) {
                if(obj instanceof Book) {
                   Book myBook = (Book) obj;
                    System.out.println("Information about the book, name: " + myBook.getName()
                    + "Author: " + myBook.getAuthor()
                    + "year of publication: " + myBook.getYesrOfPublication());
                }
                else if(obj instanceof String) {
                    System.out.println("Add book in library " + obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: Logging try get the book/journal");
    }



//    @Pointcut("execution(* aop.UniLibrary.*())")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10 ");
//    }



//    @Pointcut("execution(* get*())")
//    public void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* return*())")
//    public void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary() {}
//
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAddReturnLoggingAdvice() {
//        System.out.println("beforeGetAddReturnLoggingAdvice: writing Log #3");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}


//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights to receive ");
//    }
}
