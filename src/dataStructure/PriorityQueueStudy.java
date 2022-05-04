package dataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueStudy {

    public static void main(String[] args) {

        // 기본 : 우선순위 낮은 숫자순
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // 우선순위가 높은 숫자 순
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.offer(3);
        System.out.println(priorityQueue.peek());
    }
}
