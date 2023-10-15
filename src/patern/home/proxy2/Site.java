package patern.home.proxy2;

public class Site implements ISite{
    public String getPage(int num){
        return "Сторінка з сайту "+num;
    }
}
