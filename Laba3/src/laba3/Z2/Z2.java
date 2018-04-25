/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3.Z2;

/**
 *
 *3.2 Создайте массив из всех нечётных чисел от 1 до 99, выведите его 
 * на экран в строку, а затем этот же массив 
 * выведите на экран тоже в строку, но в обратном порядке 
 */
public class Z2  {
    public static void main(String[] args){
        // создание массива
        int[] j = new int[50];
        for (int a = 1, b = 0; a <= 99; a+=2, b++)
        {
            j[b] = a;
        }
        
        // вывод массива
        for (int i = 0; i < 50; i++)
        {
            System.out.print(j[i] + " ");
        }
        
        System.out.print("\n"); // на новую строку
        
        // вывод в обратном порядке
        for (int i = 49; i >= 0; i--)
        {
            System.out.print(j[i] + " ");
        }
    }
 
}