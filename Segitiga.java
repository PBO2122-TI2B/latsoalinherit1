/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;

/**
 *
 * @author ALIFIYUL
 */

    public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;
    float sisi1,sisi2,sisi3;
    
    float luas(){
        float luas =(alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    
    float keliling(){
        float keliling = sisi1+sisi2+sisi3;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
}
    }


