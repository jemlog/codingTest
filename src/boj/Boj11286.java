package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj11286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        // 절댓값 우선순위를 가져오는 작업이다!
        for(int i = 0 ; i < num; i++)
        {
            int num2 = Integer.parseInt(br.readLine());

            // num2이 양수일때는 양수값을 담는 우선순위 큐에 넣는다.
            if(num2 > 0)
            {
                    plusPriorityQueue.add(num2);
                System.out.println(plusPriorityQueue);
            }
            else if(num2 < 0)
            {

                    minusPriorityQueue.add(num2);
                System.out.println(minusPriorityQueue);

            }
            else   // 만약 0이 나온다면?
            {
                // 일단 양쪽이 다 0이라면?
                if(plusPriorityQueue.size() ==0 && minusPriorityQueue.size() == 0)
                {
                   // System.out.println(0);
                    sb.append(0);
                    sb.append("\n");
                }
                else if(plusPriorityQueue.size() ==0 && minusPriorityQueue.size() != 0)
                {

                    Integer peekMinus = minusPriorityQueue.poll();
              //      System.out.println(peekMinus);
                    sb.append(peekMinus);
                    sb.append("\n");
                }
                else if(plusPriorityQueue.size() !=0 && minusPriorityQueue.size() == 0)
                {

                    Integer peekPlus = plusPriorityQueue.poll();
                   // System.out.println(peekPlus);
                    sb.append(peekPlus);
                    sb.append("\n");
                }
                else
                {
                    // 양쪽 다 들어있을때!
                    Integer peekMinus = minusPriorityQueue.peek();
                    Integer peekPlus = plusPriorityQueue.peek();
                    if(peekPlus == -1*peekMinus)
                    {
                        // 만약에 두개 비교했는데 같다면 작은 수를 빼버림
                   //     System.out.println();
                        sb.append(minusPriorityQueue.poll());
                        sb.append("\n");
                    }
                    else{
                        // 이제 절댓값 비교하는 로직!
                        if(peekPlus > -1*peekMinus)
                        {
                          //  System.out.println(plusPriorityQueue.poll());
                            sb.append(plusPriorityQueue.poll());
                            sb.append("\n");
                        }
                        else if(peekPlus < -1*peekMinus)
                        {
                        //    System.out.println(plusPriorityQueue.poll());
                            sb.append(minusPriorityQueue.poll());
                            sb.append("\n");
                        }
                    }
                }


                    }
                }
        System.out.println(sb.toString());
            }}
