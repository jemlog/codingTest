package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int k = num;
        Stack<Character> stack = new Stack<>();
        List<Character> lists = new ArrayList<>();

        for(int i =0; i < num; i++)
        {


            String input = br.readLine();

            for(int j=0; j < input.length(); j++)
            {
                if(stack.isEmpty())
                {
                    stack.push(input.charAt(j));
                    lists.add(input.charAt(j));
                }
                else{
                    if(stack.peek() != input.charAt(j))
                    {
                        if(lists.contains(input.charAt(j)))
                        {
                            k-=1;
                            break;
                        }
                        else{
                            stack.push(input.charAt(j));
                            lists.add(input.charAt(j));
                        }
                    }
                    else{
                        stack.push(input.charAt(j));
                    }
                }


            }
            lists.clear();
            stack.clear();
        }
        System.out.println(k);
    }
}
