/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundations.assignment;
import java.util.Scanner;

/**
 *minimum heart rate = minhrate
 * maximum heart rate = maxrate
 * mxhr = 220 - age
 * @author sunny
 */
public class HealthyHearts {
    


public static void main(String[]args){
    
  float  minhrate, maxhrate;
  
  Scanner sc = new Scanner(System.in);
  
  
  System.out.println("what is your age:");
  int age = sc.nextInt();
  float mxhr = 220- age;
  System.out.println("Your maximum heart rate should be "+ (220-age)+ " beats per minute");
  /* get target heart rate minimum(50%) and max(85%) for given age*/
         minhrate = (int)(mxhr/2f);
         maxhrate = (int) (mxhr*.85f);
   System.out.println("You target HR zone is is "+ minhrate + " - " + maxhrate +" beats per minute");
    
    
    
    
    
    
    
    
    
    
    
    
}

}