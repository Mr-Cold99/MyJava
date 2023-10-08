package exeption;

import java.util.Objects;

public class MyExeption extends RuntimeException {
    String massage;
    public MyExeption(){}


    public MyExeption(String massage) {
        super(massage);
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyExeption that = (MyExeption) o;
        return Objects.equals(massage, that.massage);
    }

    @Override
    public String toString() {
        return "MyExeption{" +
                "massage='" + massage + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(massage);
    }
}
