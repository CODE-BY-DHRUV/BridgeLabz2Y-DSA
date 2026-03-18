class FrequencyUsingUnique {

    static String[][] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        char[] unique = UniqueCharacters.uniqueChars(s);
        String[][] res = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(f[unique[i]]);
        }
        return res;
    }
}
