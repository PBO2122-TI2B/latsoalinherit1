/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_amelia;

/**
 *
 * @author Amelia
 */
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    @Override
    public float luas(){
        super.luas();
        float luas = alas * tinggi/2;
        System.out.println(luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        super.keliling();
        double s = ((alas/2)*(alas/2)) + (tinggi*tinggi);
        double c = Math.sqrt(s);
        float kel = (int) (alas + c + c);
        System.out.println(kel);
        return kel;
    }
}
