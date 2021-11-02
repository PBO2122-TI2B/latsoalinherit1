/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author USER
 */
public class BangunDatar {
    protected float luas;
    protected float keliling;
    
    public BangunDatar(float l,float k){
        super();
        luas = l;
        keliling = k;
    }
    
    protected void awal(){
        System.out.println("=========================================");
        System.out.println("MENGHITUNG LUAS DAN KELILING BANGUN DATAR");
    }          
}
