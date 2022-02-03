/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class LuckySevens {
   public static void main(String[] args) {
        System.out.println("How many dollars do you have? ");
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        Random rm=new Random();
        int dice1,dice2;
        int count=0;
        int temp=num;
        int store=0;
        int i;
        
        for( i=1;i<=num;i++)
        {
            dice1=rm.nextInt(6)+1;
            dice2=rm.nextInt(6)+1;
            
            if ((dice1+dice2)==7)
            {
                num=num+4;
            }
            else 
            {num=num-1;}
            
            count++;
            
           if(temp<num)
           {
               store=i;
               temp=num;
           }
            System.out.println("You should have quit after "+i+" rolls when you had $"+num);
           
        }
        System.out.println("\n \n \n You are broke after "+count+" rolls.");
        System.out.println("You should have quit after "+store+" rolls when you had $"+temp);
        
        
    }
   
}
