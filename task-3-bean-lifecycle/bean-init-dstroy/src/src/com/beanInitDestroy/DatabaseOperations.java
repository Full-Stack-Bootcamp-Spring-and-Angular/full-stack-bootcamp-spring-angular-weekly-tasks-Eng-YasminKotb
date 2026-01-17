package src.com.beanInitDestroy;

public class DatabaseOperations {

    public void connectToDatabase(){
        System.out.println("connecting to database established.....");
    }

    public void storeShapeIntoDatabase(String shapeName){
        System.out.println(String.format("%s stored successfully!", shapeName));
    }

    public void disconnectFromDatabase(){
        System.out.println("connecting to database closed.....");
    }



}
