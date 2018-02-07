import java.util.Scanner;

public class Strings {

  public static void main(String[] args) {

    int correct = 0;                                 //counting correct answers for the end of the program
    String guess;                                    //hold user input
    Scanner guessScanner = new Scanner(System.in);   //set user input
    System.out.println("Welcome to Aviation Dork Trivia!");
    System.out.println("A fill-in-the-blanks type quiz that will challenge you knowledge on the subject" +
        " of aviation.");

    System.out.println("What is Chicago's busiest airport?");
    String ohare = "O'hare";                                  //variable to hold correct answer
    guess = guessScanner.next();                              //user guess
    if (ohare.equalsIgnoreCase(guess)) {                      //compare correct answer to user guess
      System.out.println("Correct!");
      correct ++;
    } else {
      System.out.println("Incorrect.");
    }

    System.out.println("Which aircraft manufacturer makes the 737?");
    String boeing = "Boeing";
    guess = guessScanner.next();
    if (boeing.equalsIgnoreCase(guess)) {
      System.out.println("Correct!");
      correct ++;
    } else {
      System.out.println("Incorrect.");
    }


    System.out.println("Does the captain sit left or right seat?");
    String left = "left";
    guess = guessScanner.next();
    if (left.equalsIgnoreCase(guess)) {
      System.out.println("Correct!");
      correct ++;
    } else {
      System.out.println("Incorrect.");
    }

    System.out.println("What is Midway Airport's favorite airline?");
    String southwest = "Southwest";
    guess = guessScanner.next();
    if (southwest.equalsIgnoreCase(guess)) {
      System.out.println("Correct!");
      correct ++;
    } else {
      System.out.println("Incorrect.");
    }

    System.out.println("What phase of flight is the most demanding?");
    String landing = "landing";
    guess = guessScanner.next();
    if (landing.equalsIgnoreCase(guess)) {
      System.out.println("Correct!");
      correct ++;
    } else {
      System.out.println("Incorrect.");
    }

    System.out.println("That was fun, let's see how you did!\n");
    System.out.println("You answered " + correct + "/5 correctly.");

    //congratulate if all answers are correct
    if(correct == 5) {
      System.out.println("Congratulations, you got a perfect score!");

    }
  }
}
