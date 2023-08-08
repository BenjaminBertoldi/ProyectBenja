package com.solvd.DAO.UsersDAO;

import com.solvd.conexion.conexion;
import com.solvd.usages.people.User;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserConexion extends conexion {
    public static void main(String[] args) {
        try (conexion con = new conexion()) {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                User user = new User(rs.getString("email"), "", 0, 0);
                System.out.println(rs.getInt("id") + " " + rs.getString("firstName") + " " + rs.getString("lastName") + " " + rs.getInt("age") + " " + rs.getString("email"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

