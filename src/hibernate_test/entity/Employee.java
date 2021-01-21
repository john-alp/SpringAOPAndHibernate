package hibernate_test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_db.employees")
public class Employee {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String department;

    @Column
    private int salary;

    public Employee() {}

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
