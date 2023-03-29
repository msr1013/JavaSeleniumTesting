package org.example;

public class Pyramid {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=a;k++){
                System.out.print("*");
            }
            a=a+2;
            System.out.println();
        }
    }
}
