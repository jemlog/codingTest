package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9342 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {

            // 값 입력
            String input = br.readLine();
            if(!input.startsWith("A") && !input.startsWith("B") && !input.startsWith("C") && !input.startsWith("D") && !input.startsWith("E") && !input.startsWith("F"))
            {
                sb.append("Infected!");
                sb.append("\n");
            }
            for(int j =1; j < input.length(); j++)
            {

            }
        }
    }
}
