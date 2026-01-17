package com.dependencyInjection;

public class Plane implements Vehicle{
    private DatabaseOperations databaseOperations;

    //setter injection
    public void setDatabaseOperations(DatabaseOperations databaseOperations){
        this.databaseOperations=databaseOperations;
    }
    @Override
    public void storeVehicle() {
        databaseOperations.storeVehicleIntoDatabase("Plane");
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