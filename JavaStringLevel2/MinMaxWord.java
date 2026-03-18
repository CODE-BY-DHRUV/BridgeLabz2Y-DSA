class MinMaxWord {
    static int[] findMinMax(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;

        for (String[] a : arr) {
            int len = Integer.parseInt(a[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }
}
