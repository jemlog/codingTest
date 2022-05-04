package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj11286 {

    // comparator는 정렬 기준을 부여하는 것이다!
    public static void main(String[] args) throws IOException {

       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->{
           int abs1 = Math.abs(n1);
           int abs2 = Math.abs(n2);

           if(abs1 == abs2) return n1 > n2 ? 1 : -1;
           return abs1 - abs2;
       });

        for(int i = 0 ; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            if(k == 0){
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            }else{
                pq.add(k);
            }
        }

            }}
