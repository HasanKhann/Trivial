package trivialpursuitcheckresponses;
import java.io.*;
import java.util.Scanner;

/**********************************
 * Project: Trivial Pursuit Check Responses
 * Programmer: Hasan Khan
 * Date: April 12, 2020
 * Program Name: TrivialPursutCheckResponses
 **********************************/

public class TrivialPursuitCheckResponses {

    public static void main(String[] args) {
        Scanner sc;
        File nf = new File ("C:\\Users\\user\\Documents\\NetBeansProjects\\Trivial Pursuit\\TrivialPursuit.txt"); //specifies file location       
        String[] answers = {"d","b","a","b","a"}; // trivial answer key
        
        try {
            sc = new Scanner (nf); //creates new scanner under file
            while(sc.hasNext()) //condition is true if there are more lines in the file
            {
                String name = sc.nextLine(); //gets users name
                int numCorrect = 0; //keeps track of users correct answers
                for(int i = 0; i < 5; i++) { //loops the next 5 lines to determine amount of correct answers
                    String userAnswer = sc.nextLine(); 
                    if (userAnswer.equals(answers[i])) { //checks if the users answers are correct
                        numCorrect++; //increments number of correct answers for current user
                    }
                }
                System.out.println(name + " has a total of " + numCorrect + " correct answer(s)"); //prints number of correct answers for user
            }
        }
        catch(IOException e) //catches error
        {
            System.out.println("File error: " + e.getMessage()); //prints an error message
        }
    }
    
}
