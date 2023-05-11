package GrokkingAlgorithms;

public class BinarySearch {

    static int count = 0;

    static int bSearch(int[] array, int i) {
        int h = array.length - 1;
        int l = 0;

        while (l <= h) {
            count++;
            int mid = (l + h) / 2;
            int g = array[mid];
            if (g == i) {
                return mid;
            } else if (g > i) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = bSearch(new int[]{0, 1, 19, 21, 37, 43, 55, 60}, 100);
        System.out.println(x);
        System.out.println(count);
    }

}
