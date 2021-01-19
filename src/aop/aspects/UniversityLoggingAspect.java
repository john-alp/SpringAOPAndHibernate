package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {


    // @After() выполняется после окончания метода с основной логикой, в вне зависимости как завершился таргет метод, нормально или
    // с исключение. Часто наз. афтер файнали

    @After("execution(* getStudent*())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: Logging is normal job method or exception");
    }

//   //Перехватываем исключения из класса таргет
//    @AfterThrowing(pointcut = "execution(* getStudent*())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging throw" + exception);
//    }



//    @Before("execution(* *getStudentList())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println(" beforeGetLoggingAdvice: " + "log the list of students " + "BEFORE method getStudents");
//    }
//    // после нормального завершения метода ловим return
//    @AfterReturning(pointcut = "execution(* getStudentList())", returning = "studentList")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> studentList) {
//        // Здесь перехватываем и меням ретурн таргет метода
//        Student firstStudent = studentList.get(0);
//        firstStudent.setNameSurname("Mr. " + firstStudent.getNameSurname());
//        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);
//
//        System.out.println(" beforeGetLoggingAdvice: " + "log the list of students " + "AFTER method getStudents");
//    }
}
