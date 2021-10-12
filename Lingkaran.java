public class Lingkaran extends BangunDatar{
    
    // jari-jari lingkaran
    float r;

    public void setLingkaran(float r) {
        this.r = r;
      }

    @Override
    float luas(){
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas lingkaran : " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}