package boj;

import javax.print.attribute.standard.PrinterResolution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < num; i++)
        {
            int num2 = Integer.parseInt(br.readLine());
            if(num2 == 0)
            {
                if(priorityQueue.isEmpty())
                {
                    System.out.println(0);
                }
                else{
                    System.out.println(priorityQueue.poll());
                }
            }
            else{
                priorityQueue.add(num2);
            }
        }

    }
}
