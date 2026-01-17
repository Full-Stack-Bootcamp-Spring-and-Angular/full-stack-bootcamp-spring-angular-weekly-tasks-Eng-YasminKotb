package com.dependencyInjection;

public class Car implements Vehicle{
    private DatabaseOperations databaseOperations;

    //constructor injection
    public Car(DatabaseOperations databaseOperations){
        this.databaseOperations=databaseOperations;
    }

    @Override
    public void storeVehicle() {
        databaseOperations.storeVehicleIntoDatabase("Car");
    }

    @Override
    public void speedUp(String vehicleName) {
        System.out.println(String.format("The %s is speeding up.", vehicleName));
    }

    @Override
    public void speedDown(String vehicleName) {
        System.out.println(String.format("The %s is speeding down.", vehicleName));
    }
}