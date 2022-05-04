package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        // 초기값을 담아두는 스택
        Stack<Integer> stacks = new Stack<>();
        // 새로운 수열을 담는 스택
        Stack<Integer> newStack = new Stack<>();

        // 입력 개수만큼 입력받기
        for(int i = num; i > 0; i--)
        {
            // 초기값 다 집어넣는 과정
            stacks.push(i);
        }

        // 입력값 하나씩 들어올때마다 push pop 진행
        for(int j = 0; j<num; j++)
        {
            int inputNum = Integer.parseInt(br.readLine());
            if(inputNum < cnt)
            {

            }

            // 그전에

            // ex 4가 나올때까지 계속 push
            while(cnt < inputNum)
            {
                stacks.pop();
                cnt+=1;
                System.out.println("+");
            }
            System.out.println("-");
        }
    }
}
