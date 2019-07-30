package pers.xy.entity;

import java.io.Serializable;

/**
 * @author xiayun
 * @Description
 * @Date 2019/6/30
 * @Created by xiayun
 */
public class User implements Serializable {

    private String name;
    private String year;
    private int age;
    private double tall;

    public User(){

    }

    public User(String name, String year, int age, double tall) {
        this.name = name;
        this.year = year;
        this.age = age;
        this.tall = tall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
