/*2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст,
Cat(кот) с полем имя и Dog(собака) с полем имя.
Унаследовать кота и собаку от животного. В классах кот и 
собака реализовать методы вывода информации и о животных
  */
package Laba6_2;

/**
 *
 * @author Я
 */
public class Pet {
    public double weight;
         public String gender;
                 public int age;
                      public Pet(double weight,String gender,int age){
        this.weight = 10.5;
                          this. gender = "мужской";
        this.age = 10;
    }
}