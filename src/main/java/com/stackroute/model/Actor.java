package com.stackroute.model;

public class Actor {
private int actor_id;
private String actor_name;
private String actor_gender;
private int actor_age;

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getActor_name() {
        return actor_name;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public String getActor_gender() {
        return actor_gender;
    }

    public void setActor_gender(String actor_gender) {
        this.actor_gender = actor_gender;
    }

    public int getActor_age() {
        return actor_age;
    }

    public void setActor_age(int actor_age) {
        this.actor_age = actor_age;
    }

//    public Actor(int actor_id, String actor_name, String actor_gender, int actor_age) {
//        this.actor_id = actor_id;
//        this.actor_name = actor_name;
//        this.actor_gender = actor_gender;
//        this.actor_age = actor_age;
//    }
//
//    public Actor() {
//    }
//
//    @Override
//    public String toString() {
//        return "Actor{" +
//                "actor_id=" + actor_id +
//                ", actor_name='" + actor_name + '\'' +
//                ", actor_gender='" + actor_gender + '\'' +
//                ", actor_age=" + actor_age +
//                '}';
//    }
}
