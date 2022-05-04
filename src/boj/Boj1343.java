package boj;
import java.util.*;
import java.io.*;

public class Boj1343 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 'X')
            {
                cnt++;

            }
            else{
                if(cnt%2 == 1)
                {
                    sb.append(-1);
                    break;
                }
                while(cnt != 0)
                {
                    if(cnt >= 4)
                    {
                        sb.append("AAAA");
                        cnt -= 4;

                    }
                    else{
                        sb.append("BB");
                        cnt -= 2;
                    }
                }
                sb.append(".");
            }
        }
        if(cnt > 0){
            if(cnt%2==1)
            {
                sb.append(-1);
            }
            else{
                while(cnt != 0) {

                    if(cnt >= 4) {
                        sb.append("AAAA");
                        cnt -= 4;
                    }else {
                        sb.append("BB");
                        cnt -= 2;
                    }
                }
            }
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
