/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class TriviaNights {
    public static void main(String[] args) {
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
         Scanner sc=new Scanner(System.in);
         
         int count=0;
         System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code	2)Assembly Language  \n 3)C#         4)Machine Language");
        int ans=sc.nextInt();
      
        if(ans==4)
        {
            count=count+1;
        }
       
        System.out.println("Second QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1)Grace Hopper		2)Alan Turing  \n 3)Charles Babbage        4)Larry Page");
        int ans2=sc.nextInt();
        
        if(ans2==2)
        {
            count=count+1;
        }
        
        System.out.println("Third QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1)Serenity		2)The Battlestar Galactica  \n 3)The USS Enterprise        4)The Millennium Falcon");
        int ans3=sc.nextInt();
        
        if(ans3==3)
        {
            count=count+1;
        }
        
        
        
        
        if(count==3)
        {
            System.out.println("Nice job - you got 3 correct!");
        }
        else
        {System.out.println("Awesome you got"+ count+" correct!");}
    }
    
    
}
