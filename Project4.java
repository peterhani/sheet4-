/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project4;
import java.util.Scanner;
public class Project4 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    rationalnumber r1=new rationalnumber();
    rationalnumber r2 =new rationalnumber();
    System.out.println("Enter numerator 1");
    int n1=input.nextInt();
    System.out.println("Enter denumerator 1");
    int d1=input.nextInt();
    System.out.println("Enter numerator 2");
    int n2=input.nextInt();
    System.out.println("Enter denumerator 2");
    int d2=input.nextInt();
    r1.setnumerator(n1);
    r1.setdenumerator(d1);
    r2.setnumerator(n2);
    r2.setdenumerator(d2);
    r1.display(r1, r2);
    System.out.println("Addition of the 2 rational number="+r1.addrational(r1, r2));
    System.out.println("Multiplication of the 2 rational numbers="+r2.multrational(r1, r2));
    }
}
