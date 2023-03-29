package org.example;

public class StarInverted {
    public static void main(String[] args){
        int a=5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1;j<=4;j++) {


                    System.out.print(" ");
                }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i || i==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}