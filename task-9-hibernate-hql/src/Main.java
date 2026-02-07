import main.myApp.entity.User;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();



//        User user = new User("Sama Omar", "12458");
//        user.setTodaysDate(new Date());
//        session.beginTransaction();
//
//        session.save(user);
//
//        session.getTransaction().commit();

        //---------//get all users as a list//---------//

        /*session.beginTransaction();
        Query query= session.createQuery("from User");

        List<User> userList=query.getResultList();

        for(User user : userList){
            System.out.println(user);
        }*/


        //---------//HQL Update Query //---------//

        /*session.beginTransaction();
        Query query= session.createQuery("update User set username=:u where id=:i");

        query.setParameter("u", "Sama Amr");
        query.setParameter("i", 7);

        int status= query.executeUpdate();
        System.out.println(status);
        session.getTransaction().commit();*/



        //---------//HQL to get records with pagination //---------//

        /*session.beginTransaction();
        Query query= session.createQuery("from User");

        query.setFirstResult(1);
        query.setMaxResults(3);

        List<User> list=query.getResultList();
        for(User user : list){
            System.out.println(user);
        }*/

        //---------//HQL to get the sum of ages //---------//
        session.beginTransaction();

        Query query=session.createQuery("select sum(age) from User");

        List<Integer> sum = query.getResultList();

        System.out.println("sum of all ages= " + sum.get(0));



    }
}