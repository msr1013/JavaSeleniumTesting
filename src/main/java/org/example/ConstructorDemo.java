package org.example;

public class ConstructorDemo {
    public static String name;

    public ConstructorDemo(){
        this.name="Sita";
    }

    public ConstructorDemo(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo = new ConstructorDemo();
        System.out.println(ConstructorDemo.name);
    }


}
