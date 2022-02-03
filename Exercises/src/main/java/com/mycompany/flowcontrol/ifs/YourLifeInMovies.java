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
public class YourLifeInMovies {
    public static void main(String[] args) {
        System.out.println("Hey, let's play a game! What's your name?");
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Ok,"+name+ ", when were you born? ");
        int born =sc.nextInt();
        
        System.out.println("well "+name+".......");
        
        if (born==1980)
        {System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?"+" \n And that the first Harry Potter came out over 15 years ago"
                +"\n Also, Space Jam came out not last decade, but the one before THAT.");}
        
        if (born==1995)
        {System.out.println("Did you know that the first Harry Potter came out over 15 years ago.");}
        if (born==1985)
        {System.out.println("Did you know that Space Jam came out not last decade, but the one before THAT.");}
        if (born==1975)
        {System.out.println("Did you know that the original Jurassic Park release is closer to the first lunar landing than it is to today.");}
        if (born==1965)
                {System.out.println("Did you know that  the MASH TV series has been around for almost half a century!");}
    }
    
}
