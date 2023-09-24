package streamapi.homework;

import java.util.Comparator;

public class CompareBySurname implements Comparator<HomeStudent> {
    @Override
    public int compare(HomeStudent o1, HomeStudent o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
