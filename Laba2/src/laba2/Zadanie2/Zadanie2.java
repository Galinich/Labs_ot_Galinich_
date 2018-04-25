/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2.Zadanie2;

import java.util.Scanner; 


/**
 *
 * 2.	2. Рисуем прямоугольник Ввести с клавиатуры два числа m и n. 
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. 
Пример: m=2, n=4

 */
public class Zadanie2 {
     


 public static void main(String[] args) throws Exception
    {
      
        Scanner scan = new Scanner(System.in); 

int m = scan.nextInt(); 
int n = scan.nextInt(); 


for (int i = 0; i < m ; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
System.out.print(8); 
} 
System.out.println(""); 
} 


} 

}    