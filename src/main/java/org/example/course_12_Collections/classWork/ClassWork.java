package org.example.course_12_Collections.classWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {

        List<Integer> nur4ikList = new ArrayList<>();
        System.out.println(nur4ikList.isEmpty());
        List<Integer> FelixList = new ArrayList<>();
        FelixList.add(10);
        FelixList.add(20);
        FelixList.add(30);
        FelixList.add(40);
        FelixList.add(50);
        FelixList.add(60);
        FelixList.add(70);
        FelixList.add(80);
        FelixList.add(90);
        FelixList.add(100);
        FelixList.add(101);
        FelixList.add(102);
        FelixList.add(103);
        FelixList.add(104);
        FelixList.add(105);
        FelixList.add(106);
        System.out.println("До удаления");
        System.out.println(FelixList);

        nur4ikList.add(10);
        nur4ikList.add(20);
        nur4ikList.add(30);


        FelixList.removeAll(nur4ikList);
        System.out.println("После удаления");

        List<Integer> myList = new ArrayList<>();
        myList.add(100);
        myList.add(101);

        myList.removeAll(FelixList);


        System.out.println(FelixList);
        System.out.println(myList);

    }
}
