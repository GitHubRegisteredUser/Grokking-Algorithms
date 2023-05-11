package GrokkingAlgorithms;

public class Recursion {

    static int factorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(10));

    }

}
