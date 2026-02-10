import entity.Course;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        //----------//Hibernate Many-to-Many//----------//


        try{
            session.beginTransaction();

            List<Course> courses = new ArrayList<>();
            courses.add(new Course("C#"));
            courses.add(new Course("Python"));
            courses.add(new Course("Java")) ;

            List<Student> students = new ArrayList<>();
            students.add(new Student("Yasmin"));
            students.add(new Student("Mariam"));
            students.add(new Student("Khadeja"));

            for(Student student: students){

                student.setCourses(courses);
                session.persist(student);
            }
//
//            for(Course course: courses){
//
//                course.setStudents(students);
//                session.save(course);
//            }
            int studentId=1;
            Student student=session.get(Student.class, studentId);
            System.out.println("Student data= " + student);
            System.out.println("courses:  " + student.getCourses());

            session.getTransaction().commit();


        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}