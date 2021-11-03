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
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    @Override
    public float luas() {
        
        float luas = (float) 0.5 * (alas * tinggi);
        if(luas < 100){
            System.out.println("Luas Segitiga           : " + luas);
        }else{
            System.out.println("Maaf, alas dan tinggi terlalu besar");
        }
        return luas;
    }  
    @Override
    public float keliling(){
        float sisiMiring = (float) Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );
        float keliling = alas + tinggi + sisiMiring;
        if(keliling < 100){
            System.out.println("Keliling Segitiga       : " + keliling);
        }else{
            System.out.println("Maaf, alas dan tinggi terlalu besar");
        }
        return keliling;
    }
}
