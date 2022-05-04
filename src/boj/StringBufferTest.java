package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringBufferTest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sbTemp = new StringBuilder();
        String input = br.readLine();
        boolean flag = false;
        for(int i=0; i< input.length(); i++)
        {
            if(input.charAt(i) == '<')
            {
                flag = true; // 지금부터 부호 안에 들어갔음을 의미
                sb.append('<'); // 진짜 리스트에 추가함
                }
            // 만약 flag가 true라면 진짜이기때문에 안 뒤집어도 됨
            if(input.charAt(i) == '>')
            {
                flag = false;
                sb.append('>');
                continue;
            }
            if(flag)
            {
                sb.append(input.charAt(i));
            }
            if(!flag)
            {
                // 먼저 바깥 중에서 공백 만나면 그전꺼까지 이제 뒤집고 진짜에 붙여주기!
                if(input.charAt(i)==' ')
                {
                    StringBuffer sbuf = new StringBuffer();
                   String result =  sbuf.append(sbTemp).reverse().toString();
                   sb.append(result);
                   sb.append(' ');
                }
                else
                {
                    sbTemp.append(input.charAt(i));
                }

            }




        }
        System.out.println(sb.toString());

    }
}
