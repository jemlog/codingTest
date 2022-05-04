package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj20291 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 이번 문제처럼 여러 값이 중복되서 들어가는 경우를 체크할때는 HashMap을 사용하자
        HashMap<String,Integer> maps = new HashMap<>();

        // 결과를 정렬하거나 하는 과정이 필요할때는 따로 리스트에 이름들만 등록해줌
        List<String> lists = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());

        for(int i =0; i < num ; i++)
        {
            String input = br.readLine();
            // 구분자를 사용할때는 split 말고 StringTokenizer를 사용하자.
            StringTokenizer st = new StringTokenizer(input,".");
            // 두번째 요소에 접근하려면 nextToken 2번 호출해야 한다.
            st.nextToken();
            String str = st.nextToken();

            // key를 가지고 있는지로 체크! 중요한 로직이다
            if(maps.containsKey(str))
            {
                // 겹쳐서 다시 집어넣으면 된다.
                maps.put(str,maps.get(str)+1);
            }
            else{
                maps.put(str,1);
                // 처음 들어갈때 외부 리스트에도 추가해주기
                lists.add(str);
            }
        }
        Collections.sort(lists);
        StringBuilder sb = new StringBuilder();

        for (String str : lists) {
            sb.append(str).append(' ').append(maps.get(str)).append('\n');
        }
        System.out.print(sb);
    }
}
