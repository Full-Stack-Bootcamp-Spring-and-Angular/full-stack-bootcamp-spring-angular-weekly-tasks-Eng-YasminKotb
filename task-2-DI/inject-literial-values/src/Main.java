import com.dependencyInjection.Car;
import com.dependencyInjection.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        //retrieve bean
        Car car=container.getBean("myCar", Car.class);
        car.storeVehicle();

        //retrieve bean
        Plane plane=container.getBean("myPlane", Plane.class);
        plane.storeVehicle();
    }
}