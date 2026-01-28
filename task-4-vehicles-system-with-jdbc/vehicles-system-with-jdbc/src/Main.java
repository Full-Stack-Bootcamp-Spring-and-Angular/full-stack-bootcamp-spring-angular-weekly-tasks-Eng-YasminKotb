import com.vehicleSystem.config.Config;
import com.vehicleSystem.controller.VehicleService;
import com.vehicleSystem.enums.Type;
import com.vehicleSystem.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        // Retrieve the single VehicleService bean
        VehicleService vehicleService = container.getBean(VehicleService.class);


        // Add vehicles using the same service with Type parameter
        vehicleService.addVehicle("Maisto", Type.CAR);
        vehicleService.addVehicle("Mirija", Type.PLANE);
        vehicleService.addVehicle("BAUER", Type.BIKE);




        // Test - Get all vehicles
        List<Vehicle> vehicles = vehicleService.getAllVehicles();

        System.out.println("------All Vehicles------\n");
        for (Vehicle v : vehicles) {
            int id = v.getId();
            String model = v.getModel();
            String type = String.valueOf(v.getVehicleType());
            System.out.println(String.format("ID: %d --- Type: %s --- Model: %s\n", id, type, model));
        }

        ((AnnotationConfigApplicationContext) container).close();

    }
}
