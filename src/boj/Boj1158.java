package boj;

import java.io.*;
import java.util.*;

public class Boj1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
      /*
      기존의 내 풀이 굳이 배열에 담을 필요 없음
      Integer[] inputValues = new Integer[2];
        inputValues[0] = Integer.parseInt(st.nextToken());
        inputValues[1] = Integer.parseInt(st.nextToken());
       */
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> resultList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++)
        {
            queue.add(i+1);
        } // OK

        for(int i = 0; i < N; i++)
        {
            Collections.rotate((List<?>) queue,-(K-1));
            resultList.add(queue.poll());
        }
        //<3, 6, 2, 7, 5, 1, 4>
        // 중요! StringBuilder를 사용하면 굳이 마지막에 다 넣어줄 필요없이 값 도출될때마다 append 해주자
        // 순서대로 추가해서 마지막에 값 도출해야할때 사용!
        StringBuilder sb = new StringBuilder(N);
        for(int j = 0; j < N -1; j++)
        {
            sb.append(resultList.get(j));
            sb.append(", ");
        }
        sb.append(resultList.get(N -1));
        bw.write("<"+sb.toString()+">");
        bw.flush();
        bw.close();
        br.close();

    }
}
