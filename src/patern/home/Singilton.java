package patern.home;

public class Singilton {
    private static  Singilton instance;
    private String somesig;
    private Singilton(String somesing){
        this.somesig=somesing;
    }
    public static Singilton getinstance(){
        if (instance==null){
            instance=new Singilton("BMW");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singilton{" +
                "somesig='" + somesig + '\'' +
                '}';
    }
}
