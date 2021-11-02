package Inheritance;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    @Override
    public float luas(){
        float luas = alas*tinggi/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        float keliling = alas*2 + tinggi*2;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}
