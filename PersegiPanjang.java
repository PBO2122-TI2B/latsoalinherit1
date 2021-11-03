/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOJS6;

/**
 *
 * @author Chaidir Wiradhika
 */
public class PersegiPanjang extends BangunDatar{
    public float pjg;
    public float lbr;

    @Override
    public float luas(){
        float luas = pjg * lbr;
        System.out.println("LUAS PERSEGI PANJANG: "+luas);
        return luas;
    }
    @Override
    public float keliling(){
        float keliling = 2*(pjg*lbr);
        System.out.println("KELILING PERSEGI PANJANG: "+ keliling);
        return keliling;
    }
}