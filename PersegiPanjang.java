public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;


    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " +luas);
        return luas;
    }

    public float keliling(){
        float keliling = 2 * ( panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " +keliling);
        return keliling;
    }
}

//Adika Ahmad Hanif Nazhir