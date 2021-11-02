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
public class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;
    
    @Override
    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float keliling = 2 * (panjang * lebar);
        System.out.println("Keliling Persegi Panjang : "+keliling);
        return keliling;
    }
}
