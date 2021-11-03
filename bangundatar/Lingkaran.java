package bangundatar;

public class Lingkaran extends BangunDatar{
    public float r;

    public float hitungLuas() {
        float luas = 22 / 7 * r * r;
        return super.hitungLuas(luas);
    }

    public float hitungKeliling() {
        float keliling = 2 * 22 / 7 * r;
        return super.hitungKeliling(keliling);
    }
}
