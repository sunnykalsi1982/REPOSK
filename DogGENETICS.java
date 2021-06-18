/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundations.assignment;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author sunny
 */
public class DogGENETICS {
    public static void main(String[] args) {
        String[] breeds = {"St. Bernard", "Chihuahua ", "Dramatic Red nosedAsian Pug", "Common Cur", "King Doberman"};
        
        Scanner sc = new Scanner(System.in);
        Random dGen = new Random();
        
        String dName;
        String dogGen;
        int totalGen = 100;
        int breedPercent = 0;
        
        System.out.println(" What is your dogs name");
        dName = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dName + "'s " + "prestgious background right here");
        
        for(int i=0; i<5; i++){
       
            String breed = "";
            breed = breeds[i];
             if (i != 4) {
                breedPercent = dGen.nextInt(totalGen);
                totalGen -= breedPercent;
            } else {
                breedPercent = totalGen;
                
        
        
    }
              System.out.println(breed + ":" + breedPercent + "%");

        }
    }
}

         
        
    
    
