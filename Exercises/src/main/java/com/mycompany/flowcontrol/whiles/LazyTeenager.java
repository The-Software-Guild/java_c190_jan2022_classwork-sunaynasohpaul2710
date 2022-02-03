/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class LazyTeenager {
    public static void main(String[] args) {
        int i=1;
       int count=10;
       Random rn=new Random();
       int input=rn.nextInt(6)+1;
       
        do
        {
            System.out.println("Clean your room!! "+ count);
            
           
           count= count+10;
           if (count==70)
               { System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
               break;}

           
           if (i==input)
           {
               System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
               break;
           }
           

           i++;
            
        }while(i<7);
        
        
        
    }
    
}
