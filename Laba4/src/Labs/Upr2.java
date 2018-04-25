/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;
import java.util.Scanner;
/**
 *
 * 4.2 2.Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода из 
 * предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными ч
 * ислами и вывести все 5 массивов на экран, 
 * каждый на отдельной строке.
 */
public class Upr2 {
  public static void full(int[] arr,int a,int b){
        for (int i = 0; i < 9; i++) {
                    arr[i] = random(a, b);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int random(int a, int b) {
               int s;
                 s = ((int) (Math.random() * a) + (b));
         return s;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
             int[] arr = new int[10];
           int[] arr1 = new int[10];
         int[] arr2 = new int[10];
        int[] arr3 = new int[10];
           int[] arr4 = new int[10];


            full(arr, a, b);
        full(arr1, a, b);
           full(arr2, a, b);
        
           full(arr3, a, b);
         full(arr4, a, b);


    }
        }  

