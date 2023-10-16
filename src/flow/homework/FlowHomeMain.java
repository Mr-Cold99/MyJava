package flow.homework;

public class FlowHomeMain {
    public static void main(String[] args) {
        /// Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку
        FlowHomeThread flowHomeThread1=new FlowHomeThread(1);
        FlowHomeThread flowHomeThread2=new FlowHomeThread(2);
        runThred(flowHomeThread1,flowHomeThread2);


    }
    public static void runThred(Thread...threads){
        for (Thread thread:threads){
            thread.start();
        }
    }
}
