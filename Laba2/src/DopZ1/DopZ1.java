/*
 2.Доп.1	Сравнить имена Ввести с клавиатуры два имени, и если имена одинаковые,
вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 */
package DopZ1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Я
 */
public class DopZ1 {
     public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String n = read.readLine();
        int c = n.length();
        String m = read.readLine();
        int k = m.length();
        if (n.equals(m)) {
            System.out.println("Имена идентичны");
        }
        else if (c == k) {
            System.out.println("Длина слов равна");
        }
    }
}