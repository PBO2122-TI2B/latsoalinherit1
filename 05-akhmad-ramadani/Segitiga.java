public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        float result = (alas * tinggi) / 2;
        return result;
    }

    @Override
    public float keliling() {
        float hipotenusa = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float result = hipotenusa + alas + tinggi;
        return result;
    }

}
