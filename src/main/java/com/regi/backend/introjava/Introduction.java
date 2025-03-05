package com.regi.backend.introjava;

import java.util.*;

public class Introduction {
    public static void main(String[] args) {
        // tipe data di java
        String str = "ini tipe data string";
        int number = 10;
        boolean isExist = true;
        char alphabet = 'a';
        double price = 10000.00;
        System.out.println(str);
        for(int i =0 ;i<=5; i++){
            for(int j=0;j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 5;
        while (i<=5){
            i++;
        }
        List<String> list = new ArrayList<>();
//        list.add()
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, "data 1");
        map.put(2, list);

        Set<String> set = new HashSet<>();
        set.add("adsfadsf");

        int []arr = new int[10];

        System.out.println(number);
        System.out.println(isExist);
        System.out.println(alphabet);
        System.out.println(price);


//        input nilai
//        check nilai menggunakan modulus
//        print
        int nilai = 8;
        if(nilai % 2 == 0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }

    }
}
