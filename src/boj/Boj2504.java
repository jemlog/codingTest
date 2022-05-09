package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stacks = new Stack<>();

        for(int i = 0 ; i < input.length(); i++)
        {
            if(input.charAt(i) == '(') stacks.push('(');
            else if(input.charAt(i) == '[') stacks.push('[');

        }


    }
}
