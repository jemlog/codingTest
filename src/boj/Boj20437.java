package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj20437 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqReverse = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < testNum; i++)
        {
            int caseNum = Integer.parseInt(br.readLine());
            for(int j = 0; j < caseNum ; j++)
            {
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line," ");
                String command = st.nextToken();
                int value = Integer.parseInt(st.nextToken());

                switch (command)
                {
                    case "I" :
                        pq.add(value);
                        pqReverse.add(value);
                        break;
                    case "D" :
                        if(pq.isEmpty())
                        {
                            continue;
                        }
                        else{
                            if(value == 1)
                            {
                                Integer max = pqReverse.poll();
                                pq.remove(max);
                            }
                            else{
                                Integer min = pq.poll();
                                pqReverse.remove(min);
                            }
                        }
                        break;

                    default:
                        break;
                }

            }
            if(pq.isEmpty())
            {
                System.out.println("EMPTY");
            }
            else{
                System.out.println(pqReverse.peek()+" "+pq.peek());
                pq.clear();
                pqReverse.clear();
            }
        }
    }
}
