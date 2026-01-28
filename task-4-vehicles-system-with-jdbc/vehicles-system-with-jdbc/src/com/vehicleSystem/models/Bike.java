package com.vehicleSystem.models;

import com.vehicleSystem.enums.Type;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Setter
@Getter
public class Bike implements Vehicle {
    private int id;
    private String model;
    private final Type vehicleType=Type.BIKE;


    @Override
    public void speedUp(String vehicleName) {
        System.out.println(String.format("The %s is speeding up.", vehicleName));
    }

    @Override
    public void speedDown(String vehicleName) {
        System.out.println(String.format("The %s is speeding down.", vehicleName));
    }

    @Override
    public void turnRight(String vehicleName) {
        System.out.println(String.format("The %s is turning right.", vehicleName));
    }

    @Override
    public void turnLeft(String vehicleName) {
        System.out.println(String.format("The %s is turning left.", vehicleName));
    }


}
