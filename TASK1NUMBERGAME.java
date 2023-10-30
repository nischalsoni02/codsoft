import java.util.Random;
import java.util.Scanner;
public class TASK1NUMBERGAME{
    public static void main(String[] args) {
        // Generating a random number from 1 to 100
        Random rd = new Random();
        int rdnumber = rd.nextInt(100) + 1;
        // read user input
        Scanner scn = new Scanner(System.in);
        // ask the user to enter the number to be guessed
        System.out.println("Enter your guess between 1 and 100:");
        int guess = scn.nextInt();
        // Initialize the number of attempts and score
        int attempts = 1;
        
        int score = 0;
        // Compare the no guessed with the random no
        while (guess != rdnumber) {
            if (guess < rdnumber) {
                System.out.println("Your guess is lower than the actual no. Try again:");
                guess = scn.nextInt();
            } else {
                System.out.println("Your guess is higher than the actual no. Try again:");
                guess = scn.nextInt();
            }
            
            attempts++;
        }
        // when guess is correct
        System.out.println("Congratulations! your guess is correct.");
        
        score++;
        // Ask the user if they want to play again
        System.out.println("Do you want to play again? (yes/no)");
        String answer = scn.next();
        while (answer.equals("yes")) {
            rdnumber = rd.nextInt(100) + 1;
            attempts = 1;
            System.out.println("Enter your guess between 1 and 100:");
            guess = scn.nextInt();
            while (guess != rdnumber) {
                if (guess < rdnumber) {
                    System.out.println("Your guess is lower than the actual no. Try again:");
                    guess = scn.nextInt();
                } else {
                    System.out.println("Your guess is higher than the actual no. Try again:");
                    guess = scn.nextInt();
                }
                attempts++;
            }
            //when the guess is correct
            System.out.println("Congratulations! Your guess is correct.");
            score++;
            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            answer = scn.next();
        }
        // Print the final score
        System.out.println("no.of rounds you've played : " + score);
        scn.close();
    }

}