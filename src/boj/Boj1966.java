package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < testNum; i++)
        {
            // 테스트 케이스 돌려보기
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int N = Integer.parseInt(st.nextToken()); // 사용
            int M = Integer.parseInt(st.nextToken());

            String inputPriority = br.readLine();
            StringTokenizer st2 = new StringTokenizer(inputPriority," ");
            // ==== 조건 다 주어짐

            // 큐에 싹 다 집어넣는 과정
            for(int j = 0; j < N; j++)
            {
                queue.offer(Integer.parseInt(st2.nextToken()));
            }

            int count = 0;
            // 현재위치
            int currentPosition = M;
            boolean flag = true;
            // 여기서 ㅃ
            while(flag)
            {
                Integer checkNum = queue.peek();

               // 내가 원하는 녀석을 계속 추적해야 함
                // 만약 내가 원하는 녀석이 인덱스 0에 왔다?
                // 그때를 기준으로 분기 필요
                if(currentPosition == 0)
                {
                    // 자 내가 원하는 녀석의 인덱스가 0이야!
                    // 만약 지금 내가 뺄 녀석이 더 크거나 같으면?

                    if(Collections.max(queue) <= checkNum)
                    {
                          // 성공!
                          count++;
                          flag = false;
                    }
                    else{
                        queue.offer(queue.poll());
                        currentPosition = queue.size() -1;
                    }
                }
                else{
                    if(Collections.max(queue) <= checkNum)
                    {
                        count++;
                        queue.poll();
                        currentPosition--;
                    }
                    else{
                        queue.offer(queue.poll());
                        currentPosition--;
                    }
                }

            }
            System.out.println(count);
            queue.clear();


        }
    }
}
