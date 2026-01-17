import com.dependencyInjection.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container= new ClassPathXmlApplicationContext("config/applicationContext.xml");

        // retrieve bean
        Shape circle=container.getBean("myCircle", Shape.class);
        circle.draw2D();

        // retrieve bean
        Shape square=container.getBean("mySquare", Shape.class);
        square.draw2D();

    }
}