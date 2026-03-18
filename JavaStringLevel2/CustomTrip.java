class CustomTrim {
    static int[] trimIndex(String s) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substring(String s, int st, int en) {
        String r = "";
        for (int i = st; i <= en; i++) r += s.charAt(i);
        return r;
    }
}
