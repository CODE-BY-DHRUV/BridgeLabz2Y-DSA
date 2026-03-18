class FrequencyNested {

    static String[] frequency(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') continue;
            freq[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        String[] res = new String[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0')
                res[k++] = arr[i] + " -> " + freq[i];

        return res;
    }
}
