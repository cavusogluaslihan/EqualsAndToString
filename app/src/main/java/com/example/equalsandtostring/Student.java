package com.example.equalsandtostring;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Student {
        private int id ;
        private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name of the student : "+name+ ",ID of the student : "+id;
    }

    @Override
    public boolean equals(Object obj) {
        if ( name == ((Student)obj).getName()){
            return true;
        } else {
            return false;
        }
    }
}

