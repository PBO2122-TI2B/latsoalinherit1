package Inheritance;

public class Persegi extends BangunDatar{
        private int sisi;

        public void setSisi(int sisi){
            this.sisi = sisi;
        }
        public int getSisi(){
            return sisi;
        }
        public int hitungLuas(){
            super.Luas();
            return sisi*sisi;
        }
        public int hitungKeliling() {
            super.Keliling();
            return sisi * 4;
        }
    }

