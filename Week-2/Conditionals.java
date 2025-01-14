import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age?: ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("You cannot drink or vote.");
        }
        else if(age < 21){
            System.out.println("You can vote but not drink.");
        }
        else{
            System.out.println("You can vote and drink, don't do them together.");
        }
    }
}
