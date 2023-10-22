package patern.home;

public class MainFabric {
    public static void main(String[] args) {
        ServiCentreFasbric bmw=new ServiCentreFasbric();
        bmw.orderProcedure(ServiceType.CHECKENGINE);
        Singilton singilton=Singilton.getinstance();

        Singilton singilton1=Singilton.getinstance();

        System.out.println(singilton1);
        System.out.println(singilton);


    }
}
