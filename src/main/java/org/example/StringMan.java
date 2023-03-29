package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringMan {
    public static void main(String[] args) throws ParseException {
        String appdates = "2020-01-23";
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date appDateValue = dateFormat.parse(appdates);
        if (date.compareTo(appDateValue)>-1){
            System.out.println("this is small date");
        }

//        String strDate = dateFormat.format(date);
//        System.out.println("converted string "+ strDate);
//        String name = "\"RamPrashad\" ";
//        String names = "RamPrashadRegmi";
//        String test  = "Male\\female"
//                +"\n"+"You are male";
//        String naam = "2023.12.30";
//        String name ="     2023 12 30     ";
//        String a ="RamHari";
//        System.out.println(test);
//        System.out.println("the parameter endered is "+name+"\tand it is very good");
//        System.out.println(names.substring(10,15));
//        System.out.println(names.replace("R","s"));
//        System.out.println(names.replace("Ram","Shyam"));
//        System.out.println(naam.split("\\.")[0]);
//        System.out.println(name.trim());
//        System.out.println(a.toCharArray()[1]);
//        System.out.println(a.compareTo(("Hari")));

    }
}
