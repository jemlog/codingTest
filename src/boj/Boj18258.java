package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for(int i = 0; i < num; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            switch (method)
            {
                case "push":
                    System.out.println(st.nextToken());
                    int inputValue = Integer.parseInt(st.nextToken());
                    System.out.println(inputValue);
                    last = inputValue;
                    queue.add(inputValue);
                    break;
                case "front":
                    if(queue.size() == 0)
                    {
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(queue.peek());
                    }
                    break;
                case "back" :
                    if(queue.size() == 0)
                    {
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(last);
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "pop" :
                    if(queue.size() == 0)
                    {
                        System.out.println(-1);
                    }
                    else{
                        queue.poll();
                    }
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                default:
                    break;
            }
        }

    }
}
