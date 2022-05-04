package boj;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;
// 키 오름차순 정렬 : 키를 오름차순 정렬해서 보여줘야 할때! -> 이후에 for문으로 돌아가면서 처리 가능!
//		Object[] keys = trees.keySet().toArray();
//                Arrays.sort(keys);
public class Boj4358 {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Double> maps = new HashMap<>();
        List<String> lists = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        double cnt = 0.0;
       while(str != null && !str.isEmpty())
        {
            cnt+=1.0;
            if(maps.containsKey(str))
            {
                // 덮어씌워짐
                maps.put(str,maps.get(str) +1.0);
            }
            else{
                maps.put(str,1.0);
                lists.add(str);
            }
           str = br.readLine();
        }
        Collections.sort(lists);

        for(int i =0; i < lists.size(); i++)
        {   double result = maps.get(lists.get(i))/cnt * 100.0;
            // 와 .... 소숫점 나타내는거 String.format("%.4f", result);

            sb.append(lists.get(i) + " " + String.format("%.4f", result));
            sb.append("\n");
        }
        System.out.println(sb.toString());



    }
}
