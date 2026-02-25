package com.app.test;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    Connection con = null;

    public void connectToDatabase() {

        try {
            con = dataSource.getConnection();
            System.out.println("Connecting to database established.....\n");
        } catch (SQLException ex) {
            System.err.println("Failed to connect to database");
            System.err.println(ex.getMessage());
        }

    }

    public void disconnectFromDatabase() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connecting to database closed.....");
            }
        } catch (SQLException ex) {
            System.err.println("Failed to disconnect from database");
            System.err.println(ex.getMessage());
        }
    }

}
