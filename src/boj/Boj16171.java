package boj;

import java.io.*;
import java.util.List;

public class Boj16171 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String compare = br.readLine();
        StringBuilder sb = new StringBuilder();
        int len = input.length();
        for(int i = 0; i < len; i++)
        {
            // 해당 문자가 알파벳인지 확인하는 로직!
            if(Character.isAlphabetic(input.charAt(i)))
            {
                sb.append(input.charAt(i));
            }
        }
        if(sb.toString().contains(compare))
        {
            bw.write(String.valueOf(1));
        }
        else{
            bw.write(String.valueOf(0));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
