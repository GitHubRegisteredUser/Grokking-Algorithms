package Ch4;

import java.util.ArrayList;
import java.util.List;

public class Max {

    public static int max(List<Integer> list, int n) {
        if (n == 1) {
            return list.get(0);
        } else {
            return Math.max(list.get(n - 1), max(list, n - 1));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(9);
        list.add(-10);
        list.add(25);
        list.add(50);
        list.add(-100);
        list.add(1000);
        System.out.println(max(list, list.size()));
    }

}
