import main.myApp.entity.User;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        //--------------------------- //Create object// --------------------------- //

        /*
        User user = new User(1, "Yasmin Kotb", "123456","Yasmin5@gmail.com");

        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();
        */

        //--------------------------- //Read object// --------------------------- //

        /*
        session.beginTransaction();

        User user = session.get(User.class, 1);
        System.out.println(user.getEmail());

        session.getTransaction().commit();
         */

        //--------------------------- //Update object// --------------------------- //

        /*
        session.beginTransaction();

        User user = session.get(User.class, 1);

        user.setPassword("654321");
        session.save(user);

        session.getTransaction().commit();
         */

        //--------------------------- //Delete object// --------------------------- //
        session.beginTransaction();

        User user = session.get(User.class, 1);

        session.delete(user);

        session.getTransaction().commit();

    }
}