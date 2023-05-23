/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3;

/**
 *
 * @author Asus
 */
public class circle {
    private double radius;
    private String color ;
    public circle (){
    double radius=1.0;
    String color= "red" ;
}
    public circle(double r){
        radius = r;
    }
    public double getradius(){
        return radius;
    }
    public double getarea(){
        return (Math.PI*Math.pow(radius,2));
    }
    public String tostring(){
        return "circle"+"(radius="+radius+",color="+color+")";
    }
}
