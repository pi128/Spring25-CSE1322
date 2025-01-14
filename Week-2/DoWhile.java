import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Ensure they enter a name 
        // with at least 3 characters
        Scanner sc = new Scanner(System.in);

        String name = "";

        do{
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }
        while(name.length() < 3);
    }
}
