class CharTypeTable {
    static String[][] classify(String s) {
        String[][] res = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = VowelConsonantCount.check(s.charAt(i));
        }
        return res;
    }
}

