package com.example.workoutcontrol.ROOM;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
}
