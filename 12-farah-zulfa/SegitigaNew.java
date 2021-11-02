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
public class SegitigaNew extends BangunDatar{
    float alas, tinggi;
    
    public SegitigaNew(float l, float k){
        super(l,k);
    }
    
    public void setAlasTinggi(){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------SEGITIGA SAMA SISI-------------");
        System.out.print("\nMasukkan Alas: ");
        alas = input.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        tinggi = input.nextFloat();
    }
    
    private float luasSegitiga(){
        luas = (float) (0.5*alas*tinggi);
        return luas;
    }
    
    private float kelilingSegitiga(){
        keliling = 3*alas;
        return keliling;
    }
    
    public void Tampil(){
        System.out.println("Luas Segitiga: " + luasSegitiga());
        System.out.println("Keliling Segitiga : " + kelilingSegitiga()+"\n\n");
        System.out.println("=========================================");
    }     
}
