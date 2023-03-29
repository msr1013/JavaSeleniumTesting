package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Sita");

//        System.out.println(stringList);
//        stringList.remove(1);
//        System.out.println(stringList);

        for(String val:stringList){
            System.out.println(val);
        }
    }
}
