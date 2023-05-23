/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author Asus
 */
public class rationalnumber {
    private int numerator;
    private int denumerator;
    public rationalnumber(){
        numerator=1;
        denumerator=1;
    }
    public rationalnumber(int n,int d){
        numerator=n;
        denumerator=d;
    }
    public void setnumerator(int n){
        numerator=n;
    }
    public void setdenumerator(int d){
        denumerator=d;
    }
    public int getnumerator(){
        return numerator;
    }
    public int getdenumerator(){
        return denumerator;
    }
    public double addrational(rationalnumber r1,rationalnumber r2){
        return (((double)r1.numerator/r1.denumerator)+((double)r2.numerator/r2.denumerator));
    }
    public double multrational(rationalnumber r1,rationalnumber r2){
    return (((double)r1.numerator/r1.denumerator)*((double)r2.numerator/r2.denumerator));
    }
    public void display(rationalnumber r1,rationalnumber r2){
        System.out.println("R1="+((double)r1.numerator/r1.denumerator));
        System.out.println("R2="+((double)r2.numerator/r2.denumerator));
    }
}
