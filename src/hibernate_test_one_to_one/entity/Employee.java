package hibernate_test_one_to_one.entity;

import javax.persistence.*;

@Entity
@Table(name = "my_db.employees")
public class Employee {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column()
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;

    @Column
    private int salary;

    /**
     * @OneToOne() указывает на тип отношений между обьектами
     * @JoinColumn указывает на столбец, который осуществляет связь с другим обьектом
     */
    @OneToOne(cascade = CascadeType.ALL)  // Uni directional
    @JoinColumn(name = "details_id") // forent key for table employees и cc ылается на таблицу details(id)
    // связь между таблицами и какие поля эту связь осуществляют
    private Detail empDetail; // для связи между таблицами

    public Employee() {}

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }

    @Override
    public String toString() {
        return "STR - Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
