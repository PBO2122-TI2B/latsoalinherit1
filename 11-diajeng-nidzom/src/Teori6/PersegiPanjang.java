/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori6;

/**
 *
 * @author SMK TELKOM
 */
public class PersegiPanjang {
    float panjang;
    float lebar;

    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" +luas);
        return luas;
    }

    public float keliling(){
        float kl = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: "+ kl);
        return kl;
    }
}
