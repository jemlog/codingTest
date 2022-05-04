package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Stack<Character> stacks = new Stack<>();

        // 전체 케이스 다 돌아가면서 체크
        for(int i=0; i < num; i++)
        {
            // 문자열 입력 받음
            String input = br.readLine();

            // 문자열 내부에서 돌아가면서 계산
            for(int j = 0; j < input.length(); j++)
            {
                // 만약 '('가 나온다면 스택에 추가하기
                if(input.charAt(j) == '(')
                {
                    stacks.push('(');
                }
                else
                {
                    if(stacks.size() == 0)
                    {
                        stacks.push(')'); // 메인 로직 부분을 static 메서드로 빼버리자!
                        break;
                    }
                    else{
                        stacks.pop();
                    }
                }
            }

            if(stacks.size() == 0)
            {
                System.out.println("YES");
                stacks.clear();
            }
            else{
                System.out.println("NO");
                stacks.clear();
            }
        }

    }
    }

