package main.com.myApp.dao;

import lombok.Setter;
import main.com.myApp.model.User;
import java.sql.*;

@Setter
public class DatabaseOperations{


    private String url;
    private String username;
    private String password;


    public Connection con;


    public void connectToDatabase(){
        try{
            con = DriverManager.getConnection(url, username, password);

            System.out.println("connecting to database established.....\n");

        } catch (SQLException ex) {
            System.err.println("Failed to connect to database");
            System.err.println(ex.getMessage());

        }
    }


    public void disconnectFromDatabase(){
        try {
            if(con!= null && !con.isClosed()){
                con.close();
                System.out.println("connecting to database closed.....\n");
            }
        }catch(SQLException ex){
            System.err.println("Failed to disconnect from database");
            System.err.println(ex.getMessage());
        }
    }

    public void saveUser(User user){
        String sql = "INSERT INTO employees (EmployeeName, EmployeeEmail, EmployeePassword ) VALUES (?, ?, ?)";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, user.getUserName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());
            st.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to save user", ex);
        }

    }


}
