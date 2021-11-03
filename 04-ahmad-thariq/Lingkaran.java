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
public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(){
        double phi = 3.14;
        float luas = (float) (phi*r*r);
        System.out.println("LUAS LINGKARAN: " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        double phi = 3.14;
        float keliling = (float) (2 * phi * r);
        System.out.println("KELILING LINGKARAN: " + keliling);
        return keliling;
    }
}