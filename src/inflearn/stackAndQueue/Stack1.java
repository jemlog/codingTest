package inflearn.stackAndQueue;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack1 {

    public static String solution(String str)
    {
//        StringBuilder sb = new StringBuilder();
//        Stack<Character> stacks = new Stack<>();
//        for(char x : str.toCharArray())
//        {
//            if(x == ')')
//            {
//                while(stacks.peek()!='('){
//                    stacks.pop();
//                }
//                stacks.pop();
//            }
//            else {
//                stacks.push(x);
//            }
//        }
//        Object[] objects = stacks.toArray();
//        for (Object object : objects) {
//            sb.append((Character) object);
//        }
//        return sb.toString();
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray())
        {
            if(x==')')
            {
                while(stack.pop() != '('); // 안에 안 적어도 그냥 돌아준다!
            }
            else{
                stack.push(x);
            }
        }
         for(int i = 0; i < stack.size(); i++)
         {
             answer+= stack.get(0); // 문자열에 + 로 더할 수 있다!
         }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = solution(str);
        System.out.println(result);
        // 강의에서 배운 스타일을 적용해보자

    }
}
