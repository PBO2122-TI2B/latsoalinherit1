package bangundatar;

public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    public float hitungLuas() {
        float luas = panjang * lebar;
        return super.hitungLuas(luas);
    }

    public float hitungKeliling() {
        float keliling = (2 * panjang) + (2 * lebar);
        return super.hitungKeliling(keliling);
    }
}
