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
public class Lingkaran {
    float r;
    
    public float luas(){
       double phi = 3.14;
       float luas = (float)(phi*r*r);
       System.out.println("Luas lingkaran : "+luas);
       return luas;
    }

    
    float keliling(){
        double phi =3.14;
        float keliling = (float)(2*phi*r);
        System.out.println("Keliling Lingkaran: " +keliling);
        return keliling;
    }
}
