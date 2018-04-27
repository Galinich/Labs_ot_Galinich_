/*
 * 
 */
package laba5;
import java.util.Scanner;
 class Circle
 {
     public double r,x,y;
               public int dist;

                     public double first()
     {
                                   return (Math.PI * 2 * this.r);
     }
     public void Second()
     {
                           x = y + (int)(Math.random()*199-99);
                       y = x + (int)(Math.random()*199-99);
     }

                                       public Circle()
     {
                       r = 3;
                x = 1;
         y = 1;
     }

     public Circle(int r, double x, double y)
     {
                           this.r=r;
                   this.x=x;
         this.y=y;
     }

     public int Fourth(Circle second)
     {
                   return dist = (int) 
                           (Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2)));
     }
     public boolean Fifth(Circle second)
     {
         return ((this.r + second.r == dist) 
                 || (this.r - second.r == dist) || (dist < (Math.abs(this.r-second.r))));
     }
 }

/**
 *
 * @author Я
 */
public class Laba5 {
      public static void main(String [] args){
        int k;
        double a,b;
                  System.out.println("Нужно ввести радиус 2ой окружности:");
                           Scanner sc_k = new Scanner(System.in);
                k=sc_k.nextInt();
                       System.out.println("Нужно ввести первую координату центра:");
                      Scanner sc_a = new Scanner(System.in);
        a=sc_a.nextInt();
                                   System.out.println("Давай введем вторую координату центра:");
        Scanner sc_b = new Scanner(System.in);
                    b=sc_b.nextInt();
                     Circle obj = new Circle();
                                   Circle obj1 = new Circle(k,a,b); 
        System.out.println("Длинна первой окружности:\t" + obj.first()); //

                                       obj.Second();
                         System.out.println("Первая окружность перемещена в точку:\t" + obj.x + "\t" + obj.y + "\n");

                                          System.out.println("Длинна второй окружности равна:\t" + obj1.first());
                     System.out.println("Вторая окружность перемещена в точку:\t" + obj1.x + "\t" + obj1.y);

                      System.out.println("Расстояние между окружностями:\t" + obj.Fourth(obj1) +"\n");
        
        if (obj.Fifth(obj1))
        {
            System.out.println("Окружности касаются.");
        }
        else
            {
                System.out.println("Окружности не касаются.");
            }
    }

    }