package com.solvd.conexion;

import java.sql.*;

public  class conexion  implements AutoCloseable{

    private static final String DB_URL = "jdbc:mysql://localhost:2023/footballRepo_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "leaditbeat1";
    public Connection connection;
    public conexion(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }

    @Override
    public void close() {
        try{
            if (connection != null){
                connection.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
