package streamapi.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class HomeMain2 {
    public static void main(String[] args) {
        /*1. Створити лист з 20 прізвищами. Вони повинні повторюватися.
        За допомогою стрім апі перетворити цей лист на мапу.
        У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.

        */
        List<String> surname=new ArrayList<>();
        Random rnd=new Random();

        surname.add("Kravets");
        surname.add("Kit");
        surname.add("Kravets");
        surname.add("Sydorovich");
        surname.add("Fedirko");
        surname.add("Dmytryk");
        surname.add("Kit");
        surname.add("Dmytryk");
        surname.add("Sydorovich");
        surname.add("Sydorovich");
        surname.add("Sydorovich");
        surname.add("Fedirko");
        surname.add("Kravets");
        surname.add("Kit");
        surname.add("Dmytryk");
        surname.add("Dmytryk");
        surname.add("Kravets");
        surname.add("Dmytryk");
        surname.add("Kravets");
        surname.add("Dmytryk");

        /////????????????????????????????????



       // 2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
        List<Integer> nubs=new ArrayList<>();
        for (int i=0;i<20;i++){
            nubs.add(rnd.nextInt(100));
        }
        System.out.println(nubs);
        int suma=nubs.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma);




    }
}
