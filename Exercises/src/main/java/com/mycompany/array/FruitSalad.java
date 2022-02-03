/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author Sunayna
 */
public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry",
            "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple",
            "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

      
        int count = 0, mount = 0, pount = 0;
        System.out.print("{ ");
        for (String fruitSalad : fruit) {
            if (fruitSalad.contains("Apple")) {
                count++;
                if (count < 4) {
                    System.out.print(fruitSalad  + ",");
                }
            } else if (fruitSalad .contains("Orange")) {
                mount++;
                if (mount < 3) {
                    System.out.print(fruitSalad + ",");
                }
            } else if (fruitSalad .contains("Tomato")) {
               // continue;
            } else if (fruitSalad .contains("berry")) {
                System.out.print(fruitSalad + ",");
            } else {
                pount++;
                if (pount < 12) {
                    System.out.print(fruitSalad  + ",");
                }
            }
        }

        System.out.print(" }");
       
        

    }
}
