package hibernate_test_one_to_one;

import hibernate_test_one_to_one.entity.Detail;
import hibernate_test_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

       Session session = null;

        try {
            // работаем с employee, данные в detail добавляются или удаляются
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);  // oneToOne отношения - удалиться и обьект Employee и обьект Detail (casscade)

            session.getTransaction().commit();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 2);
//            System.out.println("employee " + employee);
//            System.out.println("detail" + employee.getEmpDetail());  // благодаря каскаду получаем не только обьект emp
//            // но и обьект detail
//
//            session.getTransaction().commit();
//            System.out.println("Done! ");
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Tatiana", "solomatina", "IT", 6000);
//            Detail detail = new Detail("Moscow", "+79684041452", "solo1tan@mail.ru");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done ");
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("demiurg", "solomatin", "IT", 3000);
//            Detail detail = new Detail("Moscow", "+79684040717", "solo1evg@mail.ru");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done ");
        } finally {
            session.close();
            factory.close();
        }
    }
}
