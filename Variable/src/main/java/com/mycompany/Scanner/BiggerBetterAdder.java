/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Scanner;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
         int var1,var2,var3;
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first variable");
        var1=Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter second variable");
        var2=Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter third variable");
        var3=Integer.parseInt(sc.nextLine());
        
        int result=var1+var2+var3;
        
        System.out.println("The result of adding three variables are :"+ var1+"+"+var2+"+"+var3+"="+result);
        
        
    }
    
}
