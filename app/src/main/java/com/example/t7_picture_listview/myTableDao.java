package com.example.t7_picture_listview;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface myTableDao {

    @Query("SELECT * FROM Picture ORDER BY ID desc")
    List<Picture> getAllInDescendingOrder();

    @Insert
    void InsertEntity(Picture... entity);

    @Update
    void UpdateEntity(Picture entity);

    @Delete
    void DeleteEntity(Picture entity);
}
