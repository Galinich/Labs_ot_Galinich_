/*
3. Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
Унаследовать животных от рыб, обезьян от животных и 
человека от обезьян. Поля и методы разработать самостоятельно.
 */
package Laba6_3;

/**
 *
 * @author Я
 */
public class Animal extends Fish {
    
     
     public Animal () {
                       name="Акула";
     }
     
                             public void get(){
        System.out.println("Животное: рыба, вид "+name);
     }
     
     public static void main(String[] args){ 
                      Animal name = new Animal();
                                           name.get();
    }
}