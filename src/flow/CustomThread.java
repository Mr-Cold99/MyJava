package flow;


        /*
         Створення та запуск потоків через наслідування класу Thread:
         "Для створення потоку в Java можна успадкувати клас Thread та перевизначити метод run()."
         */
public class CustomThread extends Thread {
    private final int threadCount;

    public CustomThread(int threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public void run() {
        System.out.println("Потік Запущено "+threadCount);

    }
}
