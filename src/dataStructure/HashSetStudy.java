package dataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

    public static void main(String[] args) {
        //
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<>(set1);
        HashSet<Integer> set3 = new HashSet<>(10); // 초기용량
        HashSet<Integer> set4 = new HashSet<>(Arrays.asList(1,2,3)); // 초깃값 지정

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set1.remove(1); // 특정 값으로 삭제
        set1.clear(); // 전체 삭제

        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        set1.contains(2);
    }
}
