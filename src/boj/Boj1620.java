package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 문자열을 통해 숫자를 찾고, 숫자를 통해 문자열을 찾는 문제
 * 보통 문자열에 맞는 쌍을 찾는 경우에는 HashMap을 사용,
 * 들어온 문자열이 숫자인지 아닌지 판단이 필요할시에 숫자로 변환해보면 된다!
 */
public class Boj1620 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 문자열 탐색에는 HashMap이 가장 효율이 좋다!
        // 문자열을 통해 짝을 찾을때는 hashMap
        HashMap<String,Integer> maps = new HashMap<>();

        // 숫자를 통해 문자열을 찾을때는 인덱스를 사용할 수 있는 리스트나 배열 사용
        List<String> lists = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(input," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i =0; i < N; i++)
        {
            String inputName = br.readLine();
            // 하나씩 입력해주기
            maps.put(inputName,i+1);
            lists.add(inputName);
        }
        for(int j =0; j < M; j++)
        {
            // 문자 하나 받고
            String inputName2 = br.readLine();
            // 일단 숫자라고 가정
            boolean flag = true;
            // 문자열 싹다 돌면서
            if(Character.isDigit(inputName2.charAt(0)))
            {
                // flase면 문자열
                flag = false;

            }
            // 숫자라면
            // 리스트에서 인덱스로 찾기
            if(!flag)
            {
                String result = lists.get(Integer.parseInt(inputName2) - 1);
                //sb.append(result);
                //sb.append("\n");
                System.out.println(result);
            }
            else
            {
               // sb.append(maps.get(inputName2));
              //  sb.append("/n");
                System.out.println(maps.get(inputName2));
            }
        }




    }

    // 이 문자열이 숫자인지 아닌지 판단하는 함수
    // 만약에 문자열 자체라면 숫자로 바꾸는거 실패할 것이다.
    // 숫자면 정상 변환 된다!
    // 자바는 내게 익숙한 언어이니깐 예외처리 같은것도 적극 활용!
    public static boolean isStringNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
