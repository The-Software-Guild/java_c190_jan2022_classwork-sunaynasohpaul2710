/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author Sunayna
 */
public class JaggedArray {
     public static void main(String[] args) {
         
         JaggedArray obj=new JaggedArray();
         obj.jaggedArray();
     }
        public static void jaggedArray() {
            // there are three rows in a table
        String[][] strArray = {{"This", "is"}, {"a", "test", "of", "jagged arrays"},{"ram", "sam"}};
        
        // 1 row two column , 2 row four column and so on...
        //i is called a now of rows in array to be run
        // j is called a now of elements in each array of rows should be eun like in 1 row it will print two column and so on

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + " ");
            }
            System.out.println();  
        }
    }
    
}
