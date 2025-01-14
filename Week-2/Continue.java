public class Continue {
public static String[] validNames(String[] names){
    String[] returnNames = new String[names.length];

    int position = 0;

    for(String oneName : names){
        if(oneName.length() < 2){
            continue;
        }

        returnNames[position] = oneName;

        position++;
    }

    return returnNames;
}
    
public static void main(String[] args) {
    String[] possibleNames = new String[]{"a", "bob", "x", "alice"};

    String[] goodNames = validNames(possibleNames);

    for(String x : goodNames){
        System.out.println("Good name: " + x);
    }
}
}
