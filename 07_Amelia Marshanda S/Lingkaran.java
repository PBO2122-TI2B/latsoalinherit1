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
public class Lingkaran extends BangunDatar{
    public float r;
    
    @Override
    public float luas(){
        super.luas();
        float luas = (float) (3.14 * r * r);
        System.out.println(luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        super.keliling();
        float kel = (float) (2 * 3.14 * r);
        System.out.println(kel);
        return kel;
    }
}
