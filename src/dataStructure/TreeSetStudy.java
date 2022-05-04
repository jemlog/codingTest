package dataStructure;

import java.util.TreeSet;

public class TreeSetStudy {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(7);
        set.add(4);
        set.add(9);
        set.add(1);
        set.add(5);

        System.out.println(set.first()); // 최대값
        System.out.println(set.last()); // 최소값
        System.out.println(set.higher(5)); // 큰값중 최소값
        System.out.println(set.lower(3)); // 작은값 중 최대값
    }
}
