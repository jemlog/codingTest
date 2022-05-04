package boj;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;

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
