/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fileinputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Sunayna
 */
public class StateCapitals2 {
    public static void main(String[] args) throws Exception {
        System.out.println("50 STATES & CAPITALS ARE LOADED");
        HashMap<String,String> map = new HashMap<String, String>();
        try{
            FileReader reader=new FileReader("/Users/Sunayna/OneDrive/Desktop/StateCapitals.txt");
            BufferedReader bufferedReader=new BufferedReader(reader);
            String line;
            
            while((line=bufferedReader.readLine())!=null)
            {
                 
                 String str[] = line.split(",");
                 for(int i=0;i<str.length;i++){
                 String arr[] = str[i].split("::");
                 if(arr.length==2){
                  map.put(arr[0], arr[1]);}
                
                
            }
            }
            
        }catch(IOException e) {
            e.printStackTrace();
            
        }
         System.out.println(map);
        
    }
            
    
}
