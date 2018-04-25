/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3.Z3;

/**
 *
 * 3.5 5.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых 
 * чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс 
 * строки с наибольшим по модулю произведением элементов. 
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Z5 {
    public static void main(String[] args){
        
        int [][] Mas = new int[7][4];
        
        int [] Mas1 = new int[Mas.length];
        
        for(int i =0;i<Mas.length;i++){
            
           
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)(Math.random()*11)-5;
                System.out.print(Mas[i][h]+" ");
                
                if(h==0)Mas1[i]=Mas[i][h];
                else Mas1[i]*=Mas[i][h];
               
                if(h==Mas[i].length-1)
                    System.out.println(" ");
            }
        }
        
        int max=0,max_i=0;
        
        for(int i=0;i<Mas1.length;i++){
            if(Math.abs(Mas1[i])>max){
                max=Mas1[i];
                max_i=i;
            }
        }
        //Выведем информацию на экран
        System.out.println("Строка с наибольшим по модулю произведением элементов ("+max+") имеет индекс - "+max_i);
     }
}
