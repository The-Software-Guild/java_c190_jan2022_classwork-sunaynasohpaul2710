/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flowcontrol.whiles;

/**
 *
 * @author Sunayna
 */
public class ForByFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    
                    
                    if(i==1&& j==1)
                    {System.out.print("#");}
                    else if((i==0||i==2)&& j==1)
                    {System.out.print("$");}
                    else if(i==1&& (j==0||j==2))
                    {System.out.print("@");}
                    else{System.out.print("*");}

                }
                System.out.print("|");
            }
            System.out.println("");
        }
        
        
        ////////////////////////////
        
        
        
    }
    
        
    }
    

