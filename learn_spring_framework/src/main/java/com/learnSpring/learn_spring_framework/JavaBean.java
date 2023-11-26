package com.learnSpring.learn_spring_framework;

import java.io.Serializable;

//implement Serializable interfaced
public class JavaBean implements Serializable {

    private String text;
    private int number;

    //public no args constructor
    public JavaBean() {
    }

    //getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class Pojo {
    private String text;
    private int number;

    @Override
    public String toString() {
        return "Pojo{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
