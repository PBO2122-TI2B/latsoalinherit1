public class Lingkaran extends BangunDatar {
    public float r;

    @Override
    public float luas() {
        float result = 3.14f * r * r;
        return result;
    }

    @Override
    public float keliling() {
        float result = 2 * 3.14f * r;
        return result;
    }
}
