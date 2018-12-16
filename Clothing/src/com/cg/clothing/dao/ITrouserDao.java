package com.cg.clothing.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.clothing.bean.Trouser;

public interface ITrouserDao 
{
 public String addTrouser(Trouser trouser) throws SQLException, IOException;
 public void deleteTrouser();
 Trouser selectTrouser(String tid) throws SQLException, IOException;
}
