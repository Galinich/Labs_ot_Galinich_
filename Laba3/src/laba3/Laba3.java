/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3;

/**
 *
 * 3.1 Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран 
 * сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от
 * другого началом новой строки). 
 * Перед созданием массива подумайте, какого он будет размера. 
 */
public class Laba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] a = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            a[i] = b;
            b += 2;
            i++;
        }        
       
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
       
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(a[i]);

    }
            }
    
