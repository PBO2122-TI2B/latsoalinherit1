public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    @Override
    float luas() {
        float luas = (float) 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = alas + tinggi + (float)Math.sqrt((alas * alas) + (tinggi * tinggi));
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
    
}