package dataStructure;

import java.util.TreeMap;

public class TreeMapStudy {

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"사과");
        map.put(2,"복숭아");
        map.put(3,"수박"); // 만약 같은 값 넣으면 기존 값 대체!
        System.out.println(map.firstEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastEntry());
        System.out.println(map.lastKey());
    }
}
