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
public class Lingkaran extends BangunDatar {
    float jari;
    float phi = 3.14f;
             
    public Lingkaran(float r,float phi ){
        super(r, phi);
    }

    public void setLingkaran(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Masukkan jari - jari: ");
        jari = sc.nextFloat();
    }
    public double LuasLingkaran(){
        double luasLingkaran;
         luasLingkaran=phi*jari*jari;
            return luasLingkaran;
    }
    public double KelilingLingkaran(){
        double kelilingLingkaran;
        kelilingLingkaran= 2*phi*jari;
            return kelilingLingkaran;
    }
    public void info(){
        System.out.println("Luas Lingkaran = "+ LuasLingkaran());
        System.out.println("Keliling Lingkaran = "+ KelilingLingkaran());
    }
}
