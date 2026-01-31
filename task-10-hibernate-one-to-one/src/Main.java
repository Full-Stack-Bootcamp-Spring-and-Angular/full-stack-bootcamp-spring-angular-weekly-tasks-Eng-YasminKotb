import main.myApp.entity.Passport;
import main.myApp.entity.Person;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        //----------//Hibernate One-to-One//----------//

        /*
        try{
            session.beginTransaction();
            Person person= new Person("Yasmin", "Kotb", LocalDate.parse("2003-02-20"));

            DateTimeFormatter dtm=DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Passport passport= new Passport("C20ZXM", LocalDate.parse("15/03/2025",dtm) );
            passport.setPerson(person);

            session.save(passport);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */


       //----------//Hibernate One-to-One Bi Directional//----------//
        try{
            session.beginTransaction();

            //Passport passport = session.get(Passport.class, 1);
            //System.out.println(passport);

            Person person = session.get(Person.class, 1);
            System.out.println(person);


            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}