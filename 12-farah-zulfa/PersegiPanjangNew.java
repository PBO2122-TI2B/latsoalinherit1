/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PersegiPanjangNew extends BangunDatar{
    float panjang, lebar;
    
    public PersegiPanjangNew(float l, float k){
        super(l,k);
    }
    
    public void setPanjangLebar(){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------PERSEGI PANJANG---------------");
        System.out.print("\nMasukkan Panjang: ");
        panjang = input.nextFloat();
        System.out.print("Masukkan Lebar: ");
        lebar = input.nextFloat();
    }
    
    private float luasPersegiPanjang(){
        luas = panjang*lebar;
        return luas;
    }
    
    private float kelilingPersegiPanjang(){
        keliling = 2*(panjang+lebar);
        return keliling;
    }
    
    public void Tampil(){
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang()+"\n\n");
    }
    
}
    

