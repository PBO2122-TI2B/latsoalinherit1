/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bngndtr;

import java.util.Scanner;

/**
 *
 * @author Asus X453
 */
public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    
          
    public Segitiga(float a, float t){
        super(a,t);
    }


    public void setSegitiga(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Masukkan alas: ");
        alas = sc.nextFloat();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextFloat();
    }
    private float LuasSegitiga(){
        float luassegitiga;
        luassegitiga=0.5f*alas*tinggi;
        return luassegitiga;
    }
    private double KelilingSegitiga(){
        double kelilingsegitiga;
        kelilingsegitiga= alas+alas+alas;
        return kelilingsegitiga;
    }
    public void info(){
        System.out.println("Luas Segitiga = "+ LuasSegitiga());
        System.out.println("Keliling Segitiga = "+ KelilingSegitiga());
    }
}
