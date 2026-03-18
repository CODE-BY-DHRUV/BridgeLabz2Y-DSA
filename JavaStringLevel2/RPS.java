class RPS {
    static String computer() {
        String[] c = {"rock","paper","scissors"};
        return c[(int)(Math.random()*3)];
    }

    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper"))) return 1;
        return -1;
    }
}

