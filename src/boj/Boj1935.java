package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
1. 스택으로 풀어보기
2. 스택에 넣을때 +-/*중 하나인지 체크
 */
public class Boj1935 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          // String type으로 만들고 , 들어오는 값들 매칭
        Stack<Character> stack = new Stack<>();
        List<Character> charList = new ArrayList<>();
        charList.add('+');
        charList.add('/');
        charList.add('*');
        charList.add('-');

          // 첫줄 받아오기
        int num = Integer.parseInt(br.readLine());
        double result = 0.00;
        //  두번째 줄 문자열 방아오기
        String expr = br.readLine();
        System.out.println(expr);
        // 순서대로 다 받아오기 -> 리스트 넣자
        List<Integer> numList = new ArrayList<>();
        for(int i = 0 ; i < num; i++)
        {
            numList.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(numList);

        // 전체 다 돌면서 계산
        for(int j = 0; j < expr.length(); j++)
        {
           if(charList.contains(expr.charAt(j)))
           {
              switch (expr.charAt(j)){
                  case '+' :
           // 4sw/
                      break;
                  case '-' :
                      break;
                  case '*' :
                      break;
                  case '/' :
                      break;
                  default:
                      break;
           }
           }
           else
           {
               stack.add(expr.charAt(j));
           }
        }

    }

    public static double sum(double s1,double s2)
    {
        return s1 + s2;
    }

    public static double minus(double s1,double s2)
    {
        return s1 - s2;
    }

    public static double multify(double s1,double s2)
    {
        return s1 * s2;
    }

    public static double devide(double s1,double s2)
    {
        return s1 / s2;
    }


}
