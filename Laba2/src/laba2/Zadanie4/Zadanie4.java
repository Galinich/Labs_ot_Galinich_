/*
 * 2.4.	Минимум двух чисел. Ввести с клавиатуры два числа, и вывести на экран 
минимальное из них (Поиск минимума выполняется в функции).
 */
package laba2.Zadanie4;
import java.util.Scanner; 
public class Zadanie4 {
 public static void main(String[] args) throws Exception { 
     Scanner scan = new Scanner(System.in); 

int m = scan.nextInt(); 
int n = scan.nextInt(); 
        if (n<m){
            System.out.println(n+" Определенно меньше");}
        else {System.out.println(m+" Определенно меньше");}
        
}

}