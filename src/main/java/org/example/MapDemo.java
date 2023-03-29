package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("stud1","ram");
        map.put("stud2","sita");
//        System.out.println(map);
//        System.out.println(map.get("stud1"));
//        map.remove("stud1");
//        System.out.println(map);
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("Key="+entry.getKey()+",value ="+entry.getValue());
        }
    }
}
