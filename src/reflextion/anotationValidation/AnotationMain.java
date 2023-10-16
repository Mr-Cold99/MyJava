package reflextion.anotationValidation;

public class AnotationMain {
    public static void main(String[] args) {
        Person lev=new Person("Lev","Sydorovich",35);
        Person jury=new Person("Jury","Kotovich",30);
        Person ivan=new Person("Ivan","Kravets",-20);


        CheckFoeAgeInterceptor checkFoeAgeInterceptor=new CheckFoeAgeInterceptor();
        checkFoeAgeInterceptor.checkForAgeValidation(lev);
        checkFoeAgeInterceptor.checkForAgeValidation(jury);
        checkFoeAgeInterceptor.checkForAgeValidation(ivan);
    }
}
