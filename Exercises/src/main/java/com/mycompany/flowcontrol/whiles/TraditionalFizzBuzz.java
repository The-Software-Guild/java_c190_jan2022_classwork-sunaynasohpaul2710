/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        int count=0;
        
        
        for(i=1;;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FIZZ Buzz");
                count++;
            }
            else if(i%5==0)
            {System.out.println("BUZZ");
            count++;}
            else if(i%3==0)
            {System.out.println("FIZZ");
            count++;}
           
            else if(count==num)
            {System.out.println("TRADITION!!!!!");
            break;}
            
            else{System.out.println(i);}
            
        }
        
    }
    
}
