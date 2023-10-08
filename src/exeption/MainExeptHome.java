package exeption;

import java.util.Scanner;
import static java.lang.Integer.*;

public class MainExeptHome {
    public static void main(String[] args) {

        /*
        1.

            - Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.

            - При вводі замість числа  буков - показувати повідомлення про помилку на консоль.

            - За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок


         */
        int number;
       Scanner scanner= new Scanner(System.in);
        boolean check=true;
        while (check) {
            try {
                System.out.println("Input number");

                number = parseInt(scanner.next());
                System.out.println("Inputing number is "+number);
                check=false;
                scanner.close();



            } catch (Exception e) {
                System.out.println("Warning");
                check=true;

            }
        }

        System.out.println(second(15));
        System.out.println(second(-15));

    }
    public static int second(int numb) throws MyExeption{
    /*
       2. Створити виняток який викидається коли число менше нуля.
          Створити функцію, яка приймає число і повертає його квадрат. Якщо число буде менше нуля - то викинути створений вийняток
        */
        ;

        try {


            if (numb <= 0) {
                throw new MyExeption("Warning");
            } else {

                return numb*numb;

            }

        } catch (MyExeption myExeption) {
            return numb;

        }
    }
}
