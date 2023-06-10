package Ch4;

import java.util.ArrayList;
import java.util.List;

public class Count {

    static int count(List<Object> list, int n) {
        if (n == 0 || list.isEmpty())
            return 0;
        else {
            return 1 + count(list, n - 1);
        }
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(count(list, list.size()));
    }

}
