/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_4;

/**
 *
 * @author Я
 */
public class Cat {
    private int age;
                             private String name;
    public Cat(int age, String name)
        {
                                            this.age = age;
            this.name = name;
        }
                                  public String getName() {
               return name;
    }
                        public int getAge() {
        return age;
    }
    public void vivod() {
                      System.out.println("Имя:"+name);
                           System.out.println("Возраст:"+age);
    }
    
    public static void main(String[] args){
                        Cat cat = new Cat(1,"Felix");
                        cat.vivod();        
    }    
}