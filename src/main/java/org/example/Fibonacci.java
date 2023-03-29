package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        int userInput=5;
        int a=1;
        int b=1;
        int c;
        if(userInput==0){
            System.out.println("Input is less than 2 which cannot be processed");
            return;
        }
        if(userInput>=1){
            System.out.println(a);
        }
        if(userInput>=2){
            System.out.println(b);
        }
        if(userInput>2){
            for(int i=1;i<=userInput-2;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
        }


        }

    }

}
