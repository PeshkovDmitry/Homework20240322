package homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(new Student(1L, "","",10));
            session.getTransaction().commit();
            session.close();
        }
    }


    public static void insertStudents(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.persist(
                    new Student(1L, "Иванов", "Иван", 18)
            );
            session.persist(
                    new Student(2L, "Петров", "Петр", 19)
            );
            session.persist(
                    new Student(1L, "Сидоров", "Андрей", 20)
            );
            session.persist(
                    new Student(1L, "Ларина", "Татьяна", 19)
            );
            session.persist(
                    new Student(1L, "Семенова", "Анна", 18)
            );
            session.getTransaction().commit();
        }
    }
}