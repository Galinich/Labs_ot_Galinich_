/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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