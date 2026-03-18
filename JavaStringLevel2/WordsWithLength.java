import java.util.*;

class WordsWithLength {
    static int findLength(String s) {
        int c = 0;
        try { while (true) s.charAt(c++); }
        catch (Exception e) { return c - 1; }
    }

    static String[][] wordsWithLength(String s) {
        String[] words = s.split(" ");
        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = wordsWithLength(sc.nextLine());

        System.out.println("Word\tLength");
        for (String[] r : arr)
            System.out.println(r[0] + "\t" + Integer.parseInt(r[1]));
    }
}

