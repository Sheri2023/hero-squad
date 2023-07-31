package com.igacheri.config;

import org.sql2o.Sql2o;
public class databaseconfig {
    public static Sql2o getDatabase(){
        return new Sql2o("jdbc:postgresql://localhost:5432/heroessquad", "postgres", "Wamwea2012!");
    }
}
