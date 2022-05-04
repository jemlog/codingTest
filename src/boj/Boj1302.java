package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1302 {

    // 곂치는 부분이 있을때를 처리하는 방법 공부!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> maps = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            String input = br.readLine();
            if(maps.containsKey(input))
            {
                maps.put(input,maps.get(input)+1);
            }
            else{
                maps.put(input,1);
            }
        }
        List<Integer> values = new ArrayList<>();
        // 키 다 가져와서
        Set<String> keys = maps.keySet();
        Object[] keyArray = keys.toArray();
        Arrays.sort(keyArray);



    }
}
