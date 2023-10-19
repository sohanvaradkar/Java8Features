package com.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    static int countOccurrences(int x,
                                int d)
    {

        int count = 0;
        while (x > 0)
        {

            if (x % 10 == d)
                count++;
            x = x / 10;
        }
        return count;
    }

    public static int maxOccuranceNum(int x)
    {
        if (x < 0)
            x = -x;

        int result = 0;

        int max_count = 1;
        int max_count2=1;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int d = 0; d <= 9; d++)
        {

            int count = countOccurrences(x, d);
            countMap.put(d, count);
            if (count >= max_count)
            {
                max_count = count;
               // max_count2=
                result = d;

            }

        }
        System.out.println("max count is "+countMap);
        return result;
    }
    public static void main(String[] args) {
        int number = 2031771;

        System.out.println(maxOccuranceNum(number));
    }
    }

