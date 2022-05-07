package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Boj1966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<String,Integer> maps = new HashMap();
        for(int i = 0 ; i < num; i ++)
        {
            maps.put(br.readLine(), 1);
        }
        for(int j = 0; j < num-1; j++)
        {
            String input = br.readLine();
            if(maps.containsKey(input))
            {
                maps.replace(input,maps.get(input)+1);
            }
        }
        Set<String> keys = maps.keySet();
        for(String key : keys)
        {
            if(maps.get(key) == 1)
            {
                System.out.println(key);
                break;
            }
        }
    }
}
