package Ch4;

public class Sum {

    static int sum(int[] array, int n) {
        if (n == 0)
            return array[n];
        else {
            return array[n] + sum(array, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array, array.length - 1));
    }

}
