/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3.Z3;

/**
 *
 * 3.3 	Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
 * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class Z3 {
   public static void main(String[] args){
    int chet=0;
     int[] array=new int[15];
     for(int i=0; i<15; i++){
       array[i] = (int) Math.round(Math.random() * 9);
 System.out.print(array[i] + " ");
if (array[i] % 2 == 0)
		chet++;
		}
System.out.println("\n" + chet);  
   } 
}
