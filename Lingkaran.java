package Inheritance;

public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(){
        double phi = 3.14;
        float luas = (float) (phi*r*r);
        System.out.println("Luas Lingkaran: " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        double phi = 3.14;
        float keliling = (float) (2 * phi * r);
        System.out.println("Keliling Linkaran: " + keliling);
        return keliling;
    }

}
