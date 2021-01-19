package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* *getStudentList())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println(" beforeGetLoggingAdvice: " + "log the list of students " + "BEFORE method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudentList())", returning = "studentList")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> studentList) {
        Student firstStudent = studentList.get(0);

        firstStudent.setNameSurname("Mr. " + firstStudent.getNameSurname());
        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);

        System.out.println(" beforeGetLoggingAdvice: " + "log the list of students " + "AFTER method getStudents");
    }
}
