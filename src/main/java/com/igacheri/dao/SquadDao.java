package com.igacheri.dao;

import com.igacheri.config.DatabaseConfig;
import com.igacheri.models.Hero;
import com.igacheri.models.Squad;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


import java.util.List;
public class SquadDao {
    private static final Sql2o sql2o = DatabaseConfig.getDatabase();

    public static void create(Squad squad){
        try(Connection connection = sql2o.open()) {
            String query = "INSERT INTO squads (name, max_size, cause) VALUES (:name, :max_size, :cause);";
            connection.createQuery(query)
                    .addParameter("name", squad.getName())
                    .addParameter("max_size", squad.getMax_size())
                    .addParameter("cause", squad.getCause())
                    .executeUpdate();
        } catch(Exception exception){
            System.out.println(exception.getMessage());
        }

    } }

