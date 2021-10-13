public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    public float c;

    public float luas(){
        float luas = (float) 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    public float NilaiC(){
        float c = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return c;
    }

    public float keliling(){
        float keliling = alas + tinggi + NilaiC();
        System.out.println("Keliling Segitiga : " +keliling);
        return keliling;
    }
}

//Adika Ahmad Hanif Nazhir