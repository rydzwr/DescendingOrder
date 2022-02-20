package com.rydzwr.descending_order_on_pc;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder
{
    public static int sortDesc(final int num)
    {
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        String numberStr = String.valueOf(num);

        for (int i = 0; i < numberStr.length(); i++)
        {
            chars.add(numberStr.charAt(i));
        }

        for (int i = 0; i < chars.size(); i++)
        {
            int j = Integer.parseInt(String.valueOf(chars.get(i)));
            numbers.add(j);
        }

        Collections.sort(numbers, (a, b) -> b.compareTo(a));

        String x = "";

        for (int i = 0; i < numbers.size(); i++)
        {
            x += numbers.get(i);
        }

        int descendingNum = Integer.valueOf(x);

        return descendingNum;
    }
}
