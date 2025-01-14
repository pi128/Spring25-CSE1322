import java.util.Scanner;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random myRand=new Random();
        Scanner myScan=new Scanner(System.in);
        int correct=myRand.nextInt(5);
        System.out.print("Guess Number (0-4): ");
        int guess=myScan.nextInt();
        if(guess==correct) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong, it was "+correct);
        }
    }
}
