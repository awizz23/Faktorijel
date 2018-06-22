/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorijel;

/**
 *
 * @author APC
 */
public class Faktorijel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int i,fakt=1;  
        int broj = 5; //Ovo je broj za računanje faktorijela    
            for(i=1;i<=broj;i++){    
            fakt=fakt*i;    
  }    
  System.out.println("Faktorijel od "+broj+" je: "+fakt);    
 }  
}  

