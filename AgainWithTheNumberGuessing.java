/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package againwiththenumberguessing;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class AgainWithTheNumberGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int myNum, userInput, count;
        count = 0;
        myNum = 1 + r.nextInt(10);
        
        System.out.println("I'm thinking of a number between 1-10, can you guess what it is");
        userInput = keyboard.nextInt();
        count++;
        
        do{
            System.out.println("Incorrect! I was not thinking of " + userInput + " try again");
            userInput = keyboard.nextInt();
            count++;
            if(userInput == myNum){
                System.out.println("You're right! And it only took you " + count + " tires");
            }
            
        }while(userInput != myNum);
    }
    
}
