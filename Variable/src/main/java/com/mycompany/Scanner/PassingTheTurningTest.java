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
public class PassingTheTurningTest {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        String name,color,fruit;
        int number;
        
        System.out.println("Hello there!");
        System.out.println("what's your name? ");
        name=myScanner.nextLine();
        System.out.println("hi, "+name+"!"+"I'm Alice");
        System.out.println("What's your favourite color?");
        color=myScanner.nextLine();
        System.out.println("huh,"+color+"? Mine;s Electric Lime");
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, "+name+"?");
        fruit=myScanner.nextLine();
        
        System.out.println("Really?" +fruit+"? That's wild!");
        
        System.out.println("Speaking of favorites, what's your favorite number? ");
        number= Integer.parseInt(myScanner.nextLine());
        
        System.out.println(+number+" is a cool number. Mine's -7.");
        
        System.out.println("Did you know 42 * -7 is -294? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, Zaphod!");
        
        
        
        
    }
    
}
