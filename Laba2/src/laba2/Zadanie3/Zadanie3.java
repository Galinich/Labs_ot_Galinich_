/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2.Zadanie3;


/**
 *
 * 2.3.	Рисуем треугольник 
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10. 

 */
public class Zadanie3 {
public static void main(String[] args) throws Exception
{
       for (int i = 0; i < 11; i++){
       for (int j = 0; j < i; j++){
           System.out.print(8);
       }
       System.out.println();
   }
}
}