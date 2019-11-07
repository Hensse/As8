package com.example.t7_picture_listview;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Picture.class}, version = 1)
public abstract class tietokanta extends RoomDatabase {
    public abstract myTableDao myTableDao();
}
