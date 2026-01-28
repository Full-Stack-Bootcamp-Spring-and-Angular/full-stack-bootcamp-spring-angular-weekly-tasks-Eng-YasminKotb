package com.vehicleSystem.controller;

import com.vehicleSystem.dao.DatabaseOperations;
import com.vehicleSystem.enums.Type;
import com.vehicleSystem.models.Bike;
import com.vehicleSystem.models.Car;
import com.vehicleSystem.models.Plane;
import com.vehicleSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleService {

    @Autowired
    private DatabaseOperations dao;

    public void addVehicle(String model, Type type) {
        Vehicle vehicle = createVehicle(type);
        setVehicleModel(vehicle, model);
        dao.saveVehicle(vehicle);
    }

    public void deleteVehicle(int id) {
        dao.deleteVehicle(id);
    }

    public void updateVehicle(int id, String model, Type type) {
        Vehicle vehicle = createVehicle(type);
        setVehicleId(vehicle, id);
        setVehicleModel(vehicle, model);
        dao.updateVehicle(vehicle);
    }

    public Vehicle searchById(int id) {
        return dao.searchById(id);
    }

    public List<Vehicle> getAllVehicles() {
        return dao.getAllVehicles();
    }

    private Vehicle createVehicle(Type type) {
        switch (type) {
            case CAR:
                return new Car();
            case BIKE:
                return new Bike();
            case PLANE:
                return new Plane();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }

    private void setVehicleModel(Vehicle vehicle, String model) {
        if (vehicle instanceof Car) {
            ((Car) vehicle).setModel(model);
        } else if (vehicle instanceof Bike) {
            ((Bike) vehicle).setModel(model);
        } else if (vehicle instanceof Plane) {
            ((Plane) vehicle).setModel(model);
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }

    private void setVehicleId(Vehicle vehicle, int id) {
        if (vehicle instanceof Car) {
            ((Car) vehicle).setId(id);
        } else if (vehicle instanceof Bike) {
            ((Bike) vehicle).setId(id);
        } else if (vehicle instanceof Plane) {
            ((Plane) vehicle).setId(id);
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
