package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello World !!!");

        String [] arr = new String[]{"Tom","Cat","Jerry","Hell"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }







        ArrayList list = new ArrayList();


    }

    public static void method1(){
        try {
            FileInputStream fil = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }
}
