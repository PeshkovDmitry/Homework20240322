package homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            insertStudents(sessionFactory);
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
                    new Student(3L, "Сидоров", "Андрей", 20)
            );
            session.persist(
                    new Student(4L, "Ларина", "Татьяна", 19)
            );
            session.persist(
                    new Student(5L, "Семенова", "Анна", 18)
            );
            session.getTransaction().commit();
        }
    }

    public static void show(SessionFactory factory) {
        try (Session session = factory.openSession()) {
            List<Student> list = session.
        }
    }


}