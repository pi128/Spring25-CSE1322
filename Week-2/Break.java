import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Choose A, B, or C, or type quite to end.");

            String choice = sc.nextLine();

            if(choice.equals("quit")){
                break;
            }
        }

        System.out.println("Immediately after the break happens, this line will happen.");
    }
}
