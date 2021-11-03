public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    @Override
    public float luas(){
        float luas = (float) 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        float c = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float keliling = alas + tinggi + c;
        System.out.println("Keliling Segitiga : " +keliling);
        return keliling;
    }
}

//Adika Ahmad Hanif Nazhir