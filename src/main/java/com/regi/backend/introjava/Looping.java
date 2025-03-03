package com.regi.backend.introjava;

import java.util.ArrayList;
import java.util.List;

public class Looping {
/**
 * Tugas :
 * Buat Segitiga
 * - Miring Kiri
 * - Miring Kanan
 * - Tengah
 * - Terbalik kiri
 * - Terbalik Kanan
 * */
    public static void main(String[] args) {
        String s = "";
//        char c = Character.emt;
        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int number = 9;
        if(number %2 == 0){
            System.out.println("bilangan genap");
        }else if(number %2 ==1){
            System.out.println("bilangan ganjil");
        }else{
            System.out.println("tidak diketahui");
        }
    }

    public void status(){

    }
}
