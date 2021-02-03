package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Dance");
            Child child = new Child("Polina", 15);
            Child child1 = new Child("Marina", 13);
            Child child2 = new Child("Krokodila", 11);


            session.beginTransaction();

//            section.addChildToSection(child);
            //          section.addChildToSection(child3);

            section1.addChildToSection(child);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);

//            session.save(section);
//
//            session.save(child);
//            session.save(child1);
//            session.save(child2);
            session.persist(section1);

            session.getTransaction().commit();
            System.out.println("Done!!! ");
//            //*******************************************************************

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Math");
//            Section section2 = new Section("Sea");
//            Section section3 = new Section("Walk");

//            Child child = new Child("Sergey", 6);
//
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);

//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!! ");
//            //*******************************************************************
//            // получение информации по секции
//            session = factory.getCurrentSession();
//
//            Child child = new Child();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//            System.out.println(section);
//            System.out.println(section.getChildList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!! ");
//            //*******************************************************************
            // получение информации по ребенку
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 1);
//            System.out.println(child);
//            System.out.println(child.getSectionList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!! ");
//            //*******************************************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!! ");
//            //*******************************************************************
        } finally {
            session.close();
            factory.close();
        }
    }
}
