import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String s = sc.nextLine();

        System.out.println("Number: ");
        int x = sc.nextInt();

        System.out.println(s);
        System.out.println(x);
    }
}
