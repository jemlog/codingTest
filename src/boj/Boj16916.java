package boj;

import java.io.*;

public class Boj16916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String part = br.readLine();
        if(input.contains(part))
        {
            bw.write(String.valueOf(1));
        }
        else
        {
            bw.write(String.valueOf(0));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
