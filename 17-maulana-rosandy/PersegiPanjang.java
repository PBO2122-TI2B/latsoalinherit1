package Inheritance;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    @Override
    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: "+luas);
        return luas;
    }

    @Override
    public float keliling(){
        float keliling = 2*(panjang*lebar);
        System.out.println("Keliling Persegi Panjang: "+ keliling);
        return keliling;
    }

}
