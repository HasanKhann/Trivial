package trivial.pursuit;
import java.io.*;
import java.util.Scanner;

/**********************************
 * Project: Trivial Pursuit
 * Programmer: Hasan Khan
 * Date: April 12, 2020
 * Program Name: TrivialPursuit
 **********************************/

public class TrivialPursuit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        File nf = new File ("TrivialPursuit.txt"); //creates new file
        PrintWriter pw; 
        boolean play = true; //checks if user still wants to play or if other would like to play
        
        try{ 
            pw = new PrintWriter(nf);
            while (play) {
                System.out.println("What is your name?"); //asks user to input their name
                String name = sc.nextLine();
                pw.println(name);

                //Question 1 input to file, asks question and displays options to choose from
                System.out.println("1. What is the smallest unit of memory?");
                System.out.println("a) Gigabyte b) Kilobyte c) Megabyte d) Byte");
                String question1 = sc.nextLine();
                pw.println(question1);

                //Question 2 input to file, asks question and displays options to choose from
                System.out.println("2. Which email service is owned by Google?");
                System.out.println("a) Hotmail b) Gmail c) YahooMail d) iCloud");
                String question2 = sc.nextLine();
                pw.println(question2);

                //Question 3 input to file, asks question and displays options to choose from
                System.out.println("3. How many planets are in our solar system?");
                System.out.println("a) 8 b) 7 c) 5 d) 11");
                String question3 = sc.nextLine();
                pw.println(question3);

                //Question 4 input to file, asks question and displays options to choose from
                System.out.println("4. When was the first iPhone released?");
                System.out.println("a) 2011 b) 2007 c) 2008 d) 2009");
                String question4 = sc.nextLine();
                pw.println(question4);
                
                //Question 5 input to file, asks question and displays options to choose from
                System.out.println("5. When was Amazon founded?");
                System.out.println("a) 1994 b) 1995 c) 2005 d) 2006");
                String question5 = sc.nextLine();
                pw.println(question5);


                System.out.println("Would another person like to play? Y/N"); //asks user if they or someone else would like to play again
                String playAgain = sc.nextLine(); 
                if ("N".equals(playAgain)) { //if user says no, program is complete
                    play = false;

                }
            }

            pw.close();
        }
        catch(IOException e) { //catches error
            System.out.println("File error: " + e.getMessage()); //prints an error message
        }
    }
    
}