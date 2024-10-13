import java.util.Random;
import java.util.Scanner;
public class game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 0 for the ROCK; 1for PAPER; 2 for SCISSOR;=");
    int userInput=sc.nextInt();
    System.out.println("my choice:"+userInput);
   if(userInput==0){
      System.out.println("My choice is:ROCK");
   }
   else if(userInput==1){
      System.out.println("My choice is:PAPER");
   }
   else if(userInput==2){
      System.out.println("My choice is:SCISSOR");
   }
   
   Random random=new Random();
    int computerInput=random.nextInt(4);
    
    if(userInput==computerInput){
      System.out.println("GAME DRAW...!!!");
    }
  
    else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
      System.out.println("YOU WON...!!!");
  
    }
    else {
      System.out.println("COMPUTER WON ....");
      System.out.println("YOU LOSE..");
    }
    System.out.println("Computer choice ="+computerInput);
      if(computerInput==0){
          System.out.println("computer choice : ROCK");
      }
      else if(computerInput==1){
          System.out.println("computer choice :PAPER");
      }
      else if(computerInput==2){
          System.out.println("computer choice :SCISSOR");
      }
    sc.close();
  }
      
}
 
