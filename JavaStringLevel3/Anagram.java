class Anagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] f = new int[256];
        for (int i = 0; i < a.length(); i++) {
            f[a.charAt(i)]++;
            f[b.charAt(i)]--;
        }

        for (int i : f)
            if (i != 0) return false;

        return true;
    }
}
