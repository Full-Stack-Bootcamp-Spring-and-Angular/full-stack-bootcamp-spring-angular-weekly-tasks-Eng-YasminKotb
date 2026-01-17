import com.beanScope.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Shape circle1 = container.getBean("myCircle", Shape.class);
        Shape circle2 = container.getBean("myCircle", Shape.class);
        //Same References
        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println();

        // retrieve bean
        Shape square1 = container.getBean("mySquare", Shape.class);
        Shape square2 = container.getBean("mySquare", Shape.class);


        //different References
        System.out.println(square1);
        System.out.println(square2);

    }    }
