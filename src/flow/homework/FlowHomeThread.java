package flow.homework;

public class FlowHomeThread extends Thread{
    private final int threadCount;
    public FlowHomeThread(int threadCount){this.threadCount=threadCount;}


    @Override
    public void run() {
        for (int i=0;i<=10;i++) {
            System.out.println("Flow: " + threadCount+ " number: "+i);
        }
    }
}
