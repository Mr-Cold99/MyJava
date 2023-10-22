package flow;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ////Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
        // Якщо згенероване число == 5 - то перервати роботу потоку

        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (i != 5) {
                i = (int) ((Math.random() * 10) + 1);
                System.out.println("Number is " + i);
            }
            System.out.println("This is the end");
        }
        );
        thread1.run();


        ////Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу
        ExecutorService mypul= Executors.newFixedThreadPool(10);

        Callable<Integer> generation = () -> {
            int i = (int) (Math.random() * 50 + 1);
            return i;
        };


        try {



            Future<Integer> future=mypul.submit(generation);
            Integer ress=future.get();
            System.out.println(ress + " ******* "+1);

            Future<Integer> future1=mypul.submit(generation);
            ress=future1.get();
            System.out.println(ress + " ******* "+2);

            Future<Integer> future2=mypul.submit(generation);
            ress=future2.get();
            System.out.println(ress + " ******* "+3);

            Future<Integer> future3=mypul.submit(generation);
            ress=future3.get();
            System.out.println(ress + " ******* "+4);

            Future<Integer> future4=mypul.submit(generation);
            ress = future4.get();
            System.out.println(ress + " ******* "+5);

        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();

        }finally {
            mypul.shutdown();
        }
    }
}
