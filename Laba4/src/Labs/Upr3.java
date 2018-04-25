/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;
import java.util.Scanner;
/**
 *
 * 4.3	Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.


 */
public class Upr3 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
              int a = scan.nextInt();
                 int b = scan.nextInt();
                     int[] c = new int[20];
                         int max = 0;

                             for (int i = 0; i < 20; i++) {
                    c[i] = random(a, b);

               System.out.print(c[i] + " ");

        }

                              System.out.println("max=" +sort(c));
    }
    public static int sort(int[] c){
                        int max=0;
              for (int i = 0; i < 20; i++) {
            if ((c[i]) > max) {
                max = c[i];
            }
                      }
                                return max;

    }
                  
                 public static int random(int a,int b)
    {
        int s;
                                    s = ((int) (Math.random() * a) + (b));
                             return s;
    }}