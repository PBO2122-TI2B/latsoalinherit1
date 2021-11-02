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
public class Lingkaran extends BangunDatar {
    public float r;
    
    @Override
    public float luas(){
        double phi = 3.14;
        float luas = (float) (phi*r*r);
        System.out.println("Luas Lingkaran : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        double phi = 3.14;
        float keliling = (float) (2*phi*r);
        System.out.println("Keliling Lingkaran : "+keliling);
        return keliling;
    }
}
