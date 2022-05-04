package boj;

import java.io.*;
import java.util.*;

public class Boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 기존의 요소가 있는지 없는지 찾는건 hashmap 자료구조가 제일 빠름! 0(1)!
        HashMap<String,Integer> maps = new HashMap<>();
        List<String> newList = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++)
        {
            // 듣도 못한 사람 추가

            maps.put(br.readLine(),1);
        }
        for(int j = 0; j < M; j++)
        {
            String input = br.readLine();
            if(maps.containsKey(input))
            {
                newList.add(input);
            }
        }
        Collections.sort(newList);

        StringBuilder sb = new StringBuilder();

        sb.append(newList.size());

        sb.append('\n');
        for(int k = 0; k<newList.size(); k++)
        {
            sb.append(newList.get(k));
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
