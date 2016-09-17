package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution {

    static int a = 5;
    public static void main(String[] args) throws Exception
    {
        try
        {
            divisionByZero();
        }
        catch (Exception e) {
            divisionByZero();
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void divisionByZero() throws Exception {a=a/0;}
}
