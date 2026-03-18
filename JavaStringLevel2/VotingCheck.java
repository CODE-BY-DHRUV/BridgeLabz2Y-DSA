class VotingCheck {
    static int[] generateAge(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int)(Math.random() * 90);
        return a;
    }

    static String[][] canVote(int[] ages) {
        String[][] r = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            r[i][0] = String.valueOf(ages[i]);
            r[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return r;
    }
}
