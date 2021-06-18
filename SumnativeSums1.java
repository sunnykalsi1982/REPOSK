/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundations.assignment;

/**
 *
 * @author sunny
 */
public class SumnativeSums1 {
    
    public static void main(String[] args) {
        
        int []a  =   {1,90,-33,-55,67,-16,28,-55,15};
          int[]b  =  {999,-60,-77,14,160,301};
           int[]c  = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,-99};
          
         
         System.out.println("#"+"1 "+ "ARRAY SUM IS " + GetTotal(a));
         System.out.println("#"+"2 "+ "ARRAY SUM IS " + GetTotal(b));
          System.out.println("#"+"3 "+ "ARRAY SUM IS " + GetTotal(c));
    }

          public static int GetTotal(int x []){
             int sum = 0;
                 
             for (int i:x) sum += i;
             return sum;

}
      
}
    
              
          
    
    
    
    

