package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2696 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < num; i++)
        {
            List<Integer> lists = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(input," ");
            for(int j =1; j <= n; j++)
            {
                // 홀수 , 짝수일때 경우 나눠서 작업
                // 홀수 번째만 계속 체크
                if(j%2 != 0)
                {
                    lists.add(Integer.parseInt(st.nextToken()));
                    Object[] arrays = lists.toArray();
                    Arrays.sort(arrays);
                    sb.append(arrays[arrays.length/2]);
                    sb.append(" ");
                }
                else{
                    // 뭔일 없을때는 계산
                    lists.add(Integer.parseInt(st.nextToken()));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
