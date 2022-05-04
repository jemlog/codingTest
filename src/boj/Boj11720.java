package boj;

import java.io.*;

public class Boj11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        String input = br.readLine();
        for(int i = 0; i< num; i++)
        {
            count += Character.getNumericValue(input.charAt(i));
        }
        System.out.println(count);


    }
}
