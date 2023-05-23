/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project3;

/**
 *
 * @author Asus
 */
public class Project3 {

    public static void main(String[] args) {
       circle x=new circle(4);
       System.out.println("Area of circle="+x.getarea());
       System.out.println(x.tostring());
       cylinder y=new cylinder(4,7);
       System.out.println("Volume of cylinder="+y.getvolume());
    }
}
