package streamapi.homework;

import streamapi.StudentTraining;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class StreamHomeMain {
    public static void main(String[] args) {
        List<HomeStudent>homeStudentList= new java.util.ArrayList<>(List.of(
                new HomeStudent("Kravets", 9),
                new HomeStudent("Bilytsa", 8),
                new HomeStudent("Sydorovich", 3),
                new HomeStudent("Kotovich", 5),
                new HomeStudent("Greth", 5),
                new HomeStudent("Kit", 6),
                new HomeStudent("Rudyk", 8),
                new HomeStudent("Dumych", 4)

        ));
        System.out.println(homeStudentList+"\n");
        /*
        Comparator avarageScoreComparator=new CompareByAvarageScore();
        List<HomeStudent>homeStudentList1=homeStudentList;


        System.out.println(homeStudentList+"\n");
        Collections.sort(homeStudentList,avarageScoreComparator);
*/
        CompareBySurname surnameComparator=new CompareBySurname();
        homeStudentList.sort(surnameComparator);
        System.out.println(homeStudentList);


        CompareByAvarageScore avarageScoreComparator=new CompareByAvarageScore();
        homeStudentList.sort(avarageScoreComparator);
        System.out.println(homeStudentList);


    }






}
