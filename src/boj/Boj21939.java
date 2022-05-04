package boj;

import com.sun.source.tree.Tree;

import java.io.*;

import java.util.*;

public class Boj21939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        TreeMap<Integer,Integer> maps = new TreeMap<>();


        for(int i =0; i < num; i++)
        {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            maps.put(key,value);
        }

        int num2 = Integer.parseInt(br.readLine());
        for(int j = 0; j < num2; j++)
        {
            String input2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(input2," ");
            String command = st2.nextToken();
            switch (command)
            {
                case "add" :
                    int problem = Integer.parseInt(st2.nextToken());
                    int hard = Integer.parseInt(st2.nextToken());
                    maps.put(problem,hard);
                    break;
                case "solved" :
                    int problem2 = Integer.parseInt(st2.nextToken());
                    maps.remove(problem2);
                    break;
                case "recommend" :
                    int x = Integer.parseInt(st2.nextToken());
                    if(x == 1)
                    {
                        int max = -999;
                        int number = 0;
                        for(Map.Entry<Integer,Integer> set : maps.entrySet())
                        {
                            // 맥스보다 클때
                            if(set.getValue() > max)
                            {
                                max = set.getValue();
                                number = set.getKey();
                            }

                            if(set.getValue() == max)
                            {
                                if(number < set.getKey())
                                {
                                    number = set.getKey();
                                }
                            }

                        }
                        System.out.println(number);
                    }
                    else
                    {
                        int min = 100001;
                        int number = 0;
                        for(Map.Entry<Integer,Integer> set : maps.entrySet())
                        {
                            // 맥스보다 클때
                            if(set.getValue() < min)
                            {
                                min = set.getValue();
                                number = set.getKey();
                            }

                            if(set.getValue() == min)
                            {
                                if(number > set.getKey())
                                {
                                    number = set.getKey();
                                }
                            }

                        }
                        System.out.println(number);
                    }

                    break;
                default:
                    break;
            }
        }


    }

}
