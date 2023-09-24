package collection3;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class HomeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Word word1=new Word("りんご","Apple","Apfel");
        Word word2=new Word("太陽","Sun","Sonne");
        Word word3=new Word("月","Moon", "Monat");
        Word word4=new Word("惑星","Planet","Planet");
        Word word5=new Word("男","Man","Mann");
        Word word6=new Word("犬","Dog","Hund");
        Word word7=new Word("猫","Cat","Katze");
        Word word8=new Word("市","City","City");
        Word word9=new Word("星座","Constellation","Konstellation");
        Word word10=new Word("銀河","Galaxy","Galaxis");


        String key1="Яблуко";
        String key2="Сонце";
        String key3="Місяць";
        String key4="Планета";
        String key5="Людина";
        String key6="Собака";
        String key7="Кіт";
        String key8="Місто";
        String key9="Сузір'я";
        String key10="Галактика";

        LinkedHashMap<String,Word>dictionary=new LinkedHashMap<>();


        dictionary.put(key1.toLowerCase(),word1);
        dictionary.put(key2.toLowerCase(),word2);
        dictionary.put(key3.toLowerCase(),word3);
        dictionary.put(key4.toLowerCase(),word4);
        dictionary.put(key5.toLowerCase(),word5);
        dictionary.put(key6.toLowerCase(),word6);
        dictionary.put(key7.toLowerCase(),word7);
        dictionary.put(key8.toLowerCase(),word8);
        dictionary.put(key9.toLowerCase(),word9);
        dictionary.put(key10.toLowerCase(),word10);








        System.out.println("Перед вами словник з 10 слів Українською Англійською Німецькою і Японською мовами");
        System.out.println("При введені будь якого з 10-ти слів українською мовою ви отримаєте його переклад на тири інші мови");
        System.out.println("*************************************************************************************************************");
        System.out.println("Ось ці слова"+" "+key1+" "+key2+" "+key3+" "+key3+" "+key4+" "+key5+" "+key6+" "+key7+" "+key8+" "+key9+" "+key10);
        System.out.println("*************************************************************************************************************");



        while (true){
            System.out.println("якщо хочете продовжити введіть слово інакше скажіть No");
            String answer=scanner.nextLine().toLowerCase();
            if (answer.equals("no")){
                break;
            } else {
                System.out.println(dictionary.get(answer));
            }
            }

    }


}
