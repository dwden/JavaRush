package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        File file = new File(name);
        String text;
        ArrayList<String> arr = new ArrayList<String>();
        FileWriter outp = new FileWriter(file);
        while (true) {
            text=reader.readLine();
            arr.add(text);
            if (text.equals("exit")) break;
        }
        for (String s : arr) {

            outp.write(s+"\r\n");
            outp.flush();
        }
        outp.close();
        reader.close();
    }
}
