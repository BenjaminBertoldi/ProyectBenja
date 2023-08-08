package com.solvd.DAO.PresidentDAO;

import com.solvd.conexion.conexion;
import com.solvd.usages.club.team.President;

import java.sql.ResultSet;
import java.sql.Statement;

public class PresidentConexion extends conexion {
    public static void main(String[] args) {
       try(PresidentConexion con = new PresidentConexion()){
       Statement st = con.getConnection().createStatement();
       ResultSet rs = st.executeQuery("SELECT * FROM president");
       while (rs.next()){
       President president = new President(rs.getString("firstName"),"",0,"");
           System.out.println(rs.getInt("id") + " " + rs.getString("firstName") + " " + rs.getString("lasName") + " " + rs.getInt("age") + " " + rs.getString("takesResolutions"));
       }
       con.close();
       }catch (Exception e){
           e.printStackTrace();
       }
       }
       public President seachPresidentsForId(int id){
        try{
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM president WHERE id = " + id);

            if (rs.next()){
                return new President(rs.getString("firstName"), rs.getString("lasName"), rs.getInt("age"), rs.getString("takesResolutions"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
       }
    }

