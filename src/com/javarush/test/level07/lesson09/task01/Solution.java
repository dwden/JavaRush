package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listK2 = new ArrayList<Integer>();
        ArrayList<Integer> listK3 = new ArrayList<Integer>();
        ArrayList<Integer> listD = new ArrayList<Integer>();
        for (int i = 0; i<20; i++) {list.add(Integer.parseInt(reader.readLine()));}
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0) listK2.add(list.get(i));
            if (list.get(i) % 3 == 0) listK3.add(list.get(i));
            if (list.get(i) % 2 != 0 & list.get(i) % 3 != 0) listD.add(list.get(i));
        }
        printList(listK3);
        printList(listK2);
        printList(listD);

    }

    public static void printList(List<Integer> list)
    {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
