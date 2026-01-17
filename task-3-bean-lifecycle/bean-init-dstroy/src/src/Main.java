package src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beanInitDestroy.Shape;
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = container.getBean("myCircle", Shape.class);
        circle.storeShape();

        ((ClassPathXmlApplicationContext)container).close();

        }
    }
