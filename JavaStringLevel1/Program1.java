import java.util.Scanner;

public class Program1 {

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean customResult = compareUsingCharAt(s1, s2);
        boolean builtInResult = s1.equals(s2);

        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using equals(): " + builtInResult);
        System.out.println("Results same? " + (customResult == builtInResult));
    }
}
