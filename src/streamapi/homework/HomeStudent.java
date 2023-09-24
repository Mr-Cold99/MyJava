package streamapi.homework;

import java.util.List;
import java.util.Objects;

public class HomeStudent {
    private String surname;
    private int avarageScore;

    public HomeStudent(String surname) {
        this.surname = surname;
    }

    public HomeStudent(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public HomeStudent(String surname, int avarageScore) {
        this.surname = surname;
        this.avarageScore = avarageScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeStudent that = (HomeStudent) o;
        return Double.compare(that.avarageScore, avarageScore) == 0 && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, avarageScore);
    }

    @Override
    public String toString() {
        return "HomeStudent{" +
                "surname='" + surname + '\'' +
                ", avarageScore=" + avarageScore +
                '}';
    }

}