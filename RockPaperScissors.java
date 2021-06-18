/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundations.assignment;
import java.util.Random;
import java.util.Scanner; 
/**
 *play game Rock, Paper or Scissors
 * Declare Variables
 * @author sunny
 */
public class RockPaperScissors {
    public static void main(String[] args) {
    String awnser="";    
 do{       
int rock = 1;
int paper = 2;
int scissors = 3;

int nties=0 ;
int computerscore=0;
int playerscore =0;
 
/* Ask User to input number of rounds to be played between 1-10*/ 
Scanner sc = new Scanner(System.in);
 
System.out.println("Please enter number of rounds you want to play");

int rounds =  sc.nextInt();
        
if(rounds>10 || rounds <=0 ){
    System.out.println("Invalid entry");
    
 return;
}


    
else if(rounds<=10 && rounds>0) {
    System.out.println("Please enter 1 for rock,2 for paper and 2 for scissors ");
    
}
        
 /* player enters choice out of Rock=1, Paper, Scissors=3*/
    
   for(int i= 1; i<=rounds;i++) {  
       
       int playermove =  sc.nextInt();
  if(playermove>3 ||playermove< 1){
       System.out.println("Invalid entry");
       i--;
  }
     Random  cplay = new Random();
int computermove = cplay.nextInt(3)+1;
 System.out.println(computermove);
         
 if(playermove==computermove){
     System.out.println("it's a tie");
     nties = nties +1;
 }
 else if(playermove== 1){
      if(computermove == 2){
         System.out.println("Computer Wins");
          computerscore = computerscore +1;}
 
          else if(computermove == 3){
            System.out.println("Player Wins ");
            playerscore = playerscore +1;
          } 
 }
          
          else if(playermove== 2){
     if(computermove == 1){
         System.out.println("Player Wins");
          playerscore = playerscore +1;} 
          
          
          else if(computermove == 3){
            System.out.println("Computer Wins ");
            computerscore = computerscore+1;
                  } 
          }
          
          else if(playermove== 3)
     if(computermove == 1){
         System.out.println("Computer Wins");
          computerscore = computerscore+1;
          }     
               
          else if(computermove == 2){
            System.out.println("Player Wins ");
            playerscore =playerscore +1;
                  }
    }

   
   /* Displays score*/
   System.out.println("Number of Computer Wins " +computerscore);
   System.out.println("Number of Player Wins " +playerscore);
    System.out.println("Number of Ties " +nties);
    
    /* Displays, who is winner*/
     if(playerscore> computerscore){
    System.out.println("Winner is Player");}
    else if(computerscore>playerscore){
        System.out.println("Winner is Computer");}
    else if(playerscore==computerscore){
        System.out.println("Game is Tied");}
     
     System.out.println("Do you want to play again??");
     System.out.println("Enter'y' to play again and press any other key to exit");
       
        awnser=sc.next(); 
       
 }while(awnser.equals("y"));
   
   System.out.println("Thanks for Playing");
    }

 
        }
    

  
    
  

        
 
 
 
 

     

 
    
  