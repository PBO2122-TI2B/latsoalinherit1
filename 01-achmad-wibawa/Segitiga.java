/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs3;

/**
 *
 * @author acer
 */
public class Segitiga extends BangunDatar {
    public float alas, tinggi;
    
    @Override
    public float luas(){
        float luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float keliling = (alas*2)+(tinggi*2);
        System.out.println("Keliling Segitiga : "+keliling);
        return keliling;
    }
}
