/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.Random;

/**
 *
 * @author Sunayna
 */
public class HiddenNuts {
   
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        for(int i=0;i<hidingSpots.length;i++)
        {
            if(hidingSpots[i]=="Nut")
            {System.out.println("Found it! It's in spot# "+ i );}
        }

        // Nut finding code should go here! 
    }

    
}
