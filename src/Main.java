import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String UNIQUE = "Unique";
        final String REPEATED = "Deja Vu";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flagUnique = true;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.indexOf(s.charAt(i),i+1)>0){
                flagUnique = false;
                System.out.println(REPEATED);
                break;
            }

        }
        if (flagUnique) System.out.println(UNIQUE);
    }
}