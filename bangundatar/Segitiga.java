package bangundatar;

public class Segitiga  extends BangunDatar{
    public float alas;
    public float tinggi;

    public float hitungLuas() {
        float luas = 1 / 2 * alas * tinggi;
        return super.hitungLuas(luas);
    }

    public float hitungKeliling() {
        float keliling = alas + (float)(2 * Math.sqrt((alas * alas) + (tinggi * tinggi)));
        return super.hitungKeliling(keliling);
    }
}
