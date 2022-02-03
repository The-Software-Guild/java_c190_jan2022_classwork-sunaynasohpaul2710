/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class Factorizer {
    public static void main(String[] args) {
        int count=0,sum=0, mount=0;
        System.out.println("What number would you like to factor?");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        System.out.println("The factors of"+num+" are:");
        
        //perfect factor
        for(int i=1;i<=num;i++)
        {
            if (num%i==0){
            System.out.print(" "+i);
            count++;
            sum=sum+i;}
            
        }
        sum=sum-num;
        System.out.println("\n "+num +"has "+count+" factors.");
       
        if(num==sum)
        {System.out.println(+num+"is a perfect number");}
        else
        {System.out.println(+num+"is not a perfect number");}
        
        
        // prime number 
        for(int j=2;j<num;j++)
        {
            if (num%j==0)
            {
              mount++;
            }
           
            
        }
        
        if(mount==0)
        { System.out.println(num+"is a prime number.");}
        else
            {System.out.println(num+"is not a prime number.");}
        
        
        
    }
    
}
