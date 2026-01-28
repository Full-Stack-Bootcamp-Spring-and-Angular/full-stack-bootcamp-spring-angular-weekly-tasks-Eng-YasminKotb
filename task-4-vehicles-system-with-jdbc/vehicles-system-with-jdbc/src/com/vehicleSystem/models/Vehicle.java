package com.vehicleSystem.models;

import com.vehicleSystem.enums.Type;

public interface Vehicle {



    String getModel();
    Type getVehicleType();
    int getId();
    void speedUp(String vehicleName);
    void speedDown(String vehicleName);

    void turnRight(String vehicleName);

    void turnLeft(String vehicleName);



}
