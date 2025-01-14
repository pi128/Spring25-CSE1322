public class For {
    public static void main(String[] args) {
        // This prints abcd...xwy
        for(char c = 'a'; c < 'z'; c++){
            System.out.print(c);
        }

        // This prints 100, 99, 98, ... 1,
        for(int y = 100; y > 0; y--){
            System.out.print(y + ", ");
        }
    }
}
