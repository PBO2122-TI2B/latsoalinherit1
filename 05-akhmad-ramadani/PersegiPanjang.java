public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    @Override
    public float luas() {
        float result = panjang * lebar;
        return result;
    }

    @Override
    public float keliling() {
        float result = 2 * (panjang + lebar);
        return result;
    }
}
