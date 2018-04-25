/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;
import java.util.Scanner; 
/**
 *
 * 4.1 	Создать статический метод, который будет иметь два целочисленных параметра a и b, и
 * в качестве своего значения возвращать случайное целое число из отрезка [a;b]. 
 * C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
public class Upr1 {
  public static void main(String[] args) { 
int a, b; 
  Scanner sc = new Scanner(System.in); 
   System.out.println("Введите а: "); 
   a = sc.nextInt(); 
  System.out.println("Введите b: "); 
     b = sc.nextInt(); 
 int arr[] = new int[20]; 
 for(int i=0; i<arr.length; i++) { 
    arr[i]=(int)(method(a,b)); 
       System.out.print(arr[i]+" "); 
       } 
    } 
public static int method(int a, int b){ 
int c, temp; 
     if (a>b) { 
              temp = b; 
            b = a; 
            a = temp; 
       } 
      c = (int)(Math.random()*((b+1)-a)+a); 
return c; 
} 
}