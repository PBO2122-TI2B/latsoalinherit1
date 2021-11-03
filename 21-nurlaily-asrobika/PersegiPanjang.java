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
public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;   
          
    public PersegiPanjang(float p, float l){
        super(p,l);
    }

    public void setPersegiPanjang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Masukkan panjang: ");
        panjang = sc.nextFloat();
        System.out.println("Masukkan lebar: ");
        lebar = sc.nextFloat();
    }
    private float LuasPersegiPanjang(){
        float luasPersegip;
        luasPersegip=panjang*lebar;
        return luasPersegip;
    }
    private float KelilingPersegiPanjang(){
        float kelilingPersegip;
        kelilingPersegip= 2*(panjang+lebar);
        return kelilingPersegip;
    }
    public void info(){
        System.out.println("Luas Persegi Panjang = "+ LuasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang = "+ KelilingPersegiPanjang());
    }
}