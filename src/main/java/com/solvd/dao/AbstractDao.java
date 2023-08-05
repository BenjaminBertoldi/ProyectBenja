package com.solvd.dao;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;

public abstract class AbstractDao {
    public Connection getCon (){
        return null ;//buscar como implementar esta clase ,esta misma se conencta esta base de datos
    }
}
