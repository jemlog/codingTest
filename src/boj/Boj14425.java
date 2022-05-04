package boj;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boj14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");
        StringBuilder sb = new StringBuilder();
        HashSet<String> sets = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i =0; i < N; i++)
        {
            sets.add(br.readLine());
        }
        for(int j=0; j<M; j++ )
        {
            if(sets.contains(br.readLine()))
            {
                cnt++;
            }

        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }
}
