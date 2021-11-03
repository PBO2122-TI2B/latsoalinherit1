public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(){
        float luas = (float) (Math.PI * r * r); //Math.pi sebagai nilai PI 
        System.out.println("Luas Lingkaran : " +luas);
        return luas;
    }

    @Override
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran : " +keliling);
        return keliling;
    }
}

//Adika Ahmad Hanif Nazhir