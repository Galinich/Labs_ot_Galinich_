/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3.Z3;

/**
 *
 * 3.4 4.	Создать двумерный массив из 8 строк по 5 столбцов в 
 * каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
 */
public class Z4 {
    public static void main(String[] args) {

    int[][] array = new int[5][8];

    for (int j = 0; j < 8; j++) {
   for (int i = 0; i < 5; i++) {
     array[i][j] = ((int) (Math.random() * 89)+10);
       System.out.print(array[i][j] + " ");
            }
       System.out.println();
        }
    }
}
