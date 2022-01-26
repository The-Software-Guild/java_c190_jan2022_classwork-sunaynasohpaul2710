/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class WindowMaster {
    public static void main(String[] args)
    {
       // declare varibales for height and width
        float height;
        float width;
        
        // declare variables for area perimeter and cost
        float areaOfWindow;
        float perimeterOfWindow;
        float cost;
        float glassCost=3.5f;
        float trimCost=2.25f;
        
        //Getting input
        // declare a variable for scanner to system.im
        
        Scanner myScanner= new Scanner(System.in);
        // promot user for height
        System.out.println("Please enter window height (ft): ");
        height= myScanner.nextFloat();
        
        System.out.println("Please enter window width (ft): ");
        width= myScanner.nextFloat();
        
        // calculate the area and perimeter
        
        areaOfWindow = height * width;
        perimeterOfWindow=((2* height)+(2*width));
        
        // Calculate the cost  3.50/sf  and 2.25/sf
        
        // accumulate cost
        cost = areaOfWindow * glassCost;
        cost+= perimeterOfWindow * trimCost;
        
        // Display result
        System.out.println("Window height= "+ height);
        System.out.println("Window width= "+width);
        System.out.println("Window area=" +areaOfWindow);
        System.out.println("Window perimeter= "+ perimeterOfWindow);
        System.out.println("Total cost= CAD "+cost);
        
        
    }
    
}
