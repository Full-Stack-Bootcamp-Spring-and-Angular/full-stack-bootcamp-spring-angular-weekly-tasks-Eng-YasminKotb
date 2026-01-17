package com.dependencyInjection;

public class DatabaseOperations {
    private String url;
    private String username;
    private String password;

    public void storeVehicleIntoDatabase(String vehicleName){
        System.out.println(String.format("connecting to database with url= %s\nusername= %s\npassword= %s", url, username, password));
        System.out.println(String.format("%s is stored successfully!\n", vehicleName));
    }

    //setters
    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}