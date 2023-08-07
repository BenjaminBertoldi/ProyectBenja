package com.solvd.conexion;

import com.solvd.usages.people.User;

import java.sql.*;

public  class conexion {

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

    public static void main(String[] args) {
        conexion con = new conexion();
           Statement st;
           ResultSet rs;
           try{
               st = con.connection.createStatement();
               rs = st.executeQuery("SELECT * FROM users");
               while (rs.next()){
                   User user = new User(rs.getString("email"),"",0,0);
                   System.out.println(rs.getInt("id") + " " + rs.getString("firstName") +" "+ rs.getString("lastName") +" "+ rs.getInt("age") +" "+ rs.getString("email"));
               }
               con.connection.close();
            } catch (Exception e){

            }
        }


}
