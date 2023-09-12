package flow;

    /*
  Створення та запуск потоків через реалізацію інтерфейсу Runnable:
 "Альтернативний спосіб створити потік - реалізувати інтерфейс Runnable та передати екземпляр цього класу у конструктор Thread."
 */

public class CustomRunnable implements Runnable {
    private final int runnableCount;

    public CustomRunnable(int runnableCount) {
        this.runnableCount = runnableCount;
    }

    @Override
    public void run() {
        System.out.println("Runnable started "+ runnableCount);
    }
}
