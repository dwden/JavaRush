package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine()), x2 = Integer.parseInt(reader.readLine()), x3 = Integer.parseInt(reader.readLine()),
                x4 = Integer.parseInt(reader.readLine()), max1, max2;
        if (x1>x2) max1=x1;
        else max1=x2;
        if (x3>x4) max2=x3;
        else max2 = x4;
        if (max1>max2) System.out.println(max1);
        else System.out.println(max2);
    }
}
