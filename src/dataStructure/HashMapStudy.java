package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"사과");
        map.put(2,"바나나");
        map.put(3,"포도");

        map.remove(2); // map은 키값으로만 데이터 삭제 가능
        map.clear(); // 전체 삭제

        // 조회해야 하는게 많을때는 entry 사용하기
        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + entry.getValue());
        }

        for(Integer i : map.keySet())
        {
            System.out.println(map.get(i));
        }

        map.containsKey(1);
        map.containsValue("사과");


    }
}
