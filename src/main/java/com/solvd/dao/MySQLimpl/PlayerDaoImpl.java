package com.solvd.dao.MySQLimpl;

import com.solvd.dao.AbstractDao;
import com.solvd.dao.playerDAO.iPlayerDao;
import com.solvd.usages.team.players.Player;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;


public class PlayerDaoImpl extends AbstractDao implements iPlayerDao {
    public static final String GET_PLAYER_BY_ID = "SELECT * FROM player WHERE id=?";

    @Override
    public void save(Player player){

    }

    @Override
    public Player getById(long id){
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try {
            con = getCon();
            ps = con.prepareStatement("query");
            ps.setLong(1,id);
            rs = ps.executeQuery("");
            //rs = ps.execute();
            if (rs.next()){
                int var = rs.getInt("id");
                Player player = new Player();
                //player.setId(var);
                return player;
            }

        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }


    @Override
    public void deleteById(long id) {

    }
}
