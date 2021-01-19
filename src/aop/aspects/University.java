package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private final List<Student> studentList = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("John", 2, 7.7);
        Student student2 = new Student("Tatiana", 2, 8.5);
        Student student3 = new Student("Daria", 4, 6.9);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

    public List<Student> getStudentList() {
        System.out.println("getting started with the method");
     //   System.out.println(studentList.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(studentList);
        return studentList;
    }

}
