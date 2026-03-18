class GradeSystem {
    static int[][] pcm(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 40 + (int)(Math.random()*60);
        return m;
    }

    static String grade(double p) {
        if (p >= 90) return "A+";
        if (p >= 75) return "A";
        if (p >= 60) return "B";
        if (p >= 40) return "C";
        return "Fail";
    }
}

