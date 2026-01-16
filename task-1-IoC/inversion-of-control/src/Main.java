import com.InversionOfControl.Circle;
import com.InversionOfControl.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = container.getBean("myCircle", Circle.class);

        //retrieve bean
        double circleArea = circle.getArea(3);
        System.out.println(String.format("The Area of the circle= %.14f" , circleArea));

        //Retrieve bean
        Square square = container.getBean("mySquare", Square.class);
        double squareArea = square.getArea(3);
        System.out.println(String.format("\nThe Area of the square= %.1f" , squareArea));

    }
}