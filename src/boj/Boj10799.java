package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10799 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stacks = new Stack<>();
        int answer = 0;
        for(int i =0; i< input.length(); i++)
        {
            if(input.charAt(i) == '(') stacks.push('(');
            else {
                stacks.pop();
                if(input.charAt(i-1) == '(') answer+= stacks.size();
                else answer++;
            }
        }
       System.out.println(answer);
    }
}
