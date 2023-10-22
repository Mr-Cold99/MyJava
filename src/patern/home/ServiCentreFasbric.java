package patern.home;

public class ServiCentreFasbric {
    public ServiceCentre orderProcedure(ServiceType serviceType) {
        ServiceCentre client = null;
        switch (serviceType){
            case CHECKENGINE -> client=new CheckEngine();
            case MAINTINSSERVICE -> client=new Maintince();
            case CHECKELECTRICAL -> client=new CheckEllectic();

        }
        client.getCar();
        client.makeService();
        client.returnCar();
        System.out.println("Do not buy car miles with three letters");
        return client;
    }



}
