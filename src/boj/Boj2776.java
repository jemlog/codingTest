package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boj2776 {

    // 해당 값이 있는지만 찾으면 되는 문제이기 때문에 HashSet에 담았다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> setA = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        // 전체 테스트 케이스 돌리기
        for(int i = 0; i< T; i++)
        {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j< N; j++)
            {
                setA.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int k =0; k< M; k++)
            {
                if(setA.contains(Integer.parseInt(st2.nextToken())))
                {
                    sb.append(1);
                    sb.append("\n");
                }
                else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
            setA.clear();
        }
        System.out.println(sb.toString());
    }

}
