package flow;


/*

Багатопотоковість - це здатність програми або операційної системи одночасно виконувати декілька процесів
або потоків виконання в рамках одного процесу.
Переваги: більш ефективне використання ресурсів, збільшення продуктивності, зручність.
Недоліки: складність, можливість виникнення мертвих блокувань та гонок даних.


Процеси та потоки:
Процес - це програма, що виконується в оперативній пам'яті комп'ютера.
Потік - це окрема послідовність виконання, яка може працювати одночасно з іншими потоками в рамках процесу
Приклади процесів та потоків в Java: Гра може мати один потік для руху гравця і інший потік для обробки взаємодії з ігровим середовищем.
 */

public class FlowMain {
    public static void main(String[] args) {

        CustomThread customThread = new CustomThread(1);
        CustomThread customThread1 = new CustomThread(2);
        CustomThread customThread2 = new CustomThread(3);
        CustomThread customThread3 = new CustomThread(4);
        CustomThread customThread4 = new CustomThread(5);
        CustomThread customThread5 = new CustomThread(6);
        CustomThread customThread6 = new CustomThread(7);
        CustomThread customThread7 = new CustomThread(8);
        CustomThread customThread8 = new CustomThread(9);

        runThreads(customThread,customThread1,customThread2,customThread3,customThread4,customThread5,customThread6,customThread7,customThread8);


        Thread thread=new Thread(new CustomRunnable(1));
        thread.start();


        Runnable task=new Thread(()->{
            System.out.println("runs");

        });

        new Thread(task).start();


    }

    private static void runThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }
      /*
    Завдання: Виведення чисел від 1 до N.

    Створіть два потоки, кожен з яких виводить числа від 1 до N, де N - це вхідний параметр.
    Один потік використовує Thread, а другий - Runnable. Зверніть увагу, що виведення кожного потоку повинно бути у власному блоку, щоб числа не змішувались.

    Завдання: Читання з файлу.

    Створіть потік за допомогою Thread і Runnable, який читає декілька строк з текстового файлу і виводить їх на екран.
    Кожен потік повинен читати і виводити різні строки.

    Завдання: Обчислення факторіалу числа.

    Створіть два потоки: один потік обчислює факторіал числа N за допомогою Thread,
    а другий робить те ж саме за допомогою Runnable. Число N передається як вхідний параметр.

    Завдання: Сума чисел.

    Створіть два потоки, кожен з яких обчислює суму чисел в масиві за допомогою Thread і Runnable.
    Кожен потік повинен обчислювати суму в різних частинах масиву

     */
}