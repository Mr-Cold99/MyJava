package patern.home.proxy2;

public class MainProxy2 {
    public static void main(String[] args) {
        ISite mySite=new SiteProxy(new Site());


        System.out.println(mySite.getPage(1));
        System.out.println(mySite.getPage(2));
        System.out.println(mySite.getPage(3));
        System.out.println(mySite.getPage(4));
        System.out.println(mySite.getPage(5));
        System.out.println(mySite.getPage(6));
        System.out.println(mySite.getPage(7));


        System.out.println(mySite.getPage(3));
    }
}
