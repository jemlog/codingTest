package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj17413 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Queue<Character> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        StringBuffer secondBuff = new StringBuffer();

        for(int i = 0 ; i < input.length(); i++)
        {
            // 만약 '<' 가 나오면 이전에 동작하던 단어는 뒤집어서 넣고,
            // 지금부터 큐에 넣어서 동작
            if(input.charAt(i) == '<')
            {
                sb.append(secondBuff.reverse());
                secondBuff.delete(0,secondBuff.length());
                queue.offer('<');
            }
            else if(input.charAt(i) == '>')
            {
                queue.offer('>');
                int cntQueue = queue.size();
                for(int j = 0; j < cntQueue; j++)
                {
                    sb.append(queue.poll());
                }
            }
            else{
                // 만약 일반 문자 케이스라면?
                if(queue.size() == 0)
                {
                    // 여기가 정상 케이스
                    if(input.charAt(i) == ' ' )
                    {
                        sb.append(secondBuff.reverse());
                        secondBuff.delete(0,secondBuff.length());
                        sb.append(' ');
                    }
                    else if(i == input.length() -1)
                    {
                        secondBuff.append(input.charAt(i));
                        sb.append(secondBuff.reverse());
                        secondBuff.delete(0,secondBuff.length());
                    }
                    else
                    {
                        secondBuff.append(input.charAt(i));
                    }

                }
                else{
                    // 여기는 <> 내부
                    queue.offer(input.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());



    }

}
