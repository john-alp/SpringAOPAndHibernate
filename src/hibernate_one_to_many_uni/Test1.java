package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//            session.getTransaction().commit();
//            System.out.println("Done! ");

            // записываем в базу депрартамент и работников

//            session = factory.getCurrentSession();
//            Department department = new Department("HR", 300, 1200);
//            Employee employee1 = new Employee("Vasya", "Pupkin", 200);
//            Employee employee2 = new Employee("Natalia", "Black", 300);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("Done! ");

            session = factory.getCurrentSession();
            session.beginTransaction();
            session.delete(session.get(Department.class, 2));
            session.getTransaction().commit();
            System.out.println("Done! ");

        } finally {
            session.close();
            factory.close();
        }
    }
}
