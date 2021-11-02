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
public class Segitiga extends BangunDatar{
    public float als;
    public float tngi;

    @Override
    public float luas(){
        float luas = als*tngi/2;
        System.out.println("LUAS SEGITIGA: " + luas);
        return luas;
    }
    @Override
    public float keliling(){
        float keliling = als*2 + tngi*2;
        System.out.println("KELILING SEGITIGA: " + keliling);
        return keliling;
    }
}