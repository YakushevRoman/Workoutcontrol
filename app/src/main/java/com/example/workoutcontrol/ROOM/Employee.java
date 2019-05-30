package com.example.workoutcontrol.ROOM;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Employee {
    @PrimaryKey
    public long id;
    public String name;
    public int age;
    public double weight;
    public String DatewasBorn;

}
