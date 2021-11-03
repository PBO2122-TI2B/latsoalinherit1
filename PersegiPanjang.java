/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
    
    @Override
    public float luas(){
       float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang    : "+luas);
        return luas;
    }
    @Override
    public float keliling(){
       float keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: "+keliling);
        return keliling;
    }
}
