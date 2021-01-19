package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* ad2d*(..))")
    public void allAddMethods(){}
}
