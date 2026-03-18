class UniqueCharacters {

    static int length(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {}
        return i;
    }

    static char[] uniqueChars(String s) {
        int len = length(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[k++] = c;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        String s = "programming";
        char[] res = uniqueChars(s);

        for (char c : res) System.out.print(c + " ");
    }
}
