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
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
    
    @Override
    public float luas(){
        super.luas();
        float luas = panjang * lebar;
        System.out.println(luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        super.keliling();
        float kel = 2 * (panjang + lebar);
        System.out.println(kel);
        return kel;
    }
}
