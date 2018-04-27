
package Laba6_3;

/**
 *
 * @author Я
 */
public class Human extends Ape {
             public Human () {
                            name="горилла";
     }
    
      public void get(){
                        System.out.println("Человек произошел от обезьяны вида:"+name);
     }
      
      public static void main(String[] args){ 
                            Human name = new Human();
    name.get();
    }
} 