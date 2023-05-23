/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3;

/**
 *
 * @author Asus
 */
public class cylinder extends circle {
    private double height;
    public cylinder(){
        height=1.0;
    }
    public cylinder(double r){
        super(r);
    }
    public cylinder(double r,double h){
        super(r);
        height=h;
    }
    public double getheight(){
        return height;
    }
    public double getvolume(){
        return(super.getarea()*height);
    }
    
    
}
