package com.solvd.dao.playerDAO;

import com.solvd.dao.interfaces.iEntityDao;
import com.solvd.usages.team.players.Player;

public interface iPlayerDao extends iEntityDao <Player> {
    public void deleteById (long id);
}
