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
public class LingkaranNew extends BangunDatar{
    float jari;
    float phi = (float) 3.14;
    
    public LingkaranNew(float l, float k){
        super(l,k);
    }
    
    public void setJari(){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------LINGKARAN---------------");
        System.out.print("\nMasukkan Jari-Jari: ");
        jari = input.nextFloat();
    }
    
    private float luasLingkaran(){
        luas = phi*jari*jari;
        return luas;
    }
    
    private float kelilingLingkaran(){
        keliling = 2*phi*jari;
        return keliling;
    }
    
    public void Tampil(){
        System.out.println("Luas Lingkaran: " + luasLingkaran());
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran()+"\n\n");
    }
    
}
