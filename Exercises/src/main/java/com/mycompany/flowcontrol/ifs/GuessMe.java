/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises;

import java.util.Scanner;

/**
 *
 * @author Sunayna
 */
public class GuessMe {
    public static void main(String[] args) {
        int value=27;
        Scanner sc=new Scanner(System.in);
        System.out.println("I've chosen a number. Betcha can't guess it!");
        int input=sc.nextInt();
        System.out.println("Your guess: 44"+  \);
        
        if (value==input)
        {System.out.println(input+ " ? Wow, nice guess! That was it!");}
        if(input>value)
        {System.out.println(input+ " ? Too bad, way too high. I chose #");}
        if(input<value)
        {System.out.println(input+ " ? Ha, nice try - too low! I chose #.");}
            
    }
    
}
