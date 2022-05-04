package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10799 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] charList = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        int len = charList.length;
        int count = 0;
        for(int i = 0 ; i < len ; i++)
        {
            if(charList[i] == '(')
            {
                // 만약 ( 이면 스택에 넣음
                stack.add(charList[i]);
                System.out.println(stack);
            }
            else{
                // )이 나온 경우 지금까지 (가 몇개 나왔는지 센다.
                // 레이저가 되는 (는 빼고 새야한다.
                if(stack.size() != 0)
                {
                    int temp = 2*(stack.size() -1);
                    count += temp;
                }
                System.out.println(count);
                stack.clear();

            }
        }
        System.out.println(count);


    }
}
