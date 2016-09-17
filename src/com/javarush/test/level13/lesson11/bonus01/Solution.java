package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader readF = new BufferedReader(new FileReader(reader.readLine()));
        String s;
        while ((s=readF.readLine())!=null){
            arr.add(Integer.parseInt(s));
        }
        Collections.sort(arr);
        for (int i : arr) {if (i%2==0) System.out.println(i);}*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        InputStream inp = new FileInputStream(reader.readLine());
        while (inp.available()>0) System.out.println(Character.getNumericValue((char)inp.read()));
    }
}
