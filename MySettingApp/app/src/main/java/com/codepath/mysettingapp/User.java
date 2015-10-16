package com.codepath.mysettingapp;

import java.io.Serializable;

/**
 * Created by msamant on 10/13/15.
 */
public class User implements Serializable {

   public int age;
   public String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
