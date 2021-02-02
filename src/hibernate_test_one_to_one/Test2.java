package hibernate_test_one_to_one;

import hibernate_test_one_to_one.entity.Detail;
import hibernate_test_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 3);
            detail.getEmployee().setEmpDetail(null); // разрушаем связь между обьектами (строками разных таблиц)

            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Done! ");

//              получаем имрлоиса из детейла
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 5);
//            System.out.println("detail: " + detail);
//            System.out.println("detail.getEmployee: " + detail.getEmployee());
//
//            session.getTransaction().commit();
//            System.out.println("Done! ");


//             работаем с employee, данные в detail добавляются или удаляются
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Amanator", "India", "Sea", 5000);
//            Detail detail = new Detail("Morgao", "+44986446566", "india@mail.ru");
//
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done! ");

        } finally {
            session.close();
            factory.close();
        }
    }
}
