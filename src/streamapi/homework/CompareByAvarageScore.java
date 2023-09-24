package streamapi.homework;

import java.util.Comparator;

public class CompareByAvarageScore implements Comparator<HomeStudent> {
    @Override
    public int compare(HomeStudent o1, HomeStudent o2) {
        return o1.getAvarageScore()-o2.getAvarageScore();
    }
}
