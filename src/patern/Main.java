package patern;

public class Main {
    public static void main(String[] args) {

    }
    //KISS bad
    public double add(double a,double b){
        if (a==0){
            return b;
        } else if (b==0) {
            return a;
        }else if(a>0&&b>0){
            return a+b;
        }else {
            return a+b;
        }
    }
    //KIS good
    public double addSimple(double a,double b){
        return a+b;
    }
}
