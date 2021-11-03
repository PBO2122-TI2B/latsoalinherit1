import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangunDatar bg = new BangunDatar();
        Segitiga sg = new Segitiga();
        Lingkaran lg = new Lingkaran();
        PersegiPanjang pg = new PersegiPanjang();
        System.out.println("\n-- SELAMAT DATANG DI PERHITUNGAN BANGUN DATAR --");

        int choice;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu Bangun Datar\n");
            System.out.print("1.) Segitiga \n");
            System.out.print("2.) Persegi Panjang \n");
            System.out.print("3.) Lingkaran\n");
            System.out.print("4.) Exit\n");
            System.out.print("\nMasukkan Menu Pilihan : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int tinggi, alas;
                    System.out.println("------------------ SEGITIGA ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Segitiga");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Alas        : ");
                    alas = sc.nextInt();
                    System.out.print("Set Tinggi      : ");
                    tinggi = sc.nextInt();
                    sg.setSegitiga(alas, tinggi);
                    System.out.println("-----------------------------------------------");
                    bg.luas();
                    sg.luas();
                    bg.keliling();
                    sg.keliling();
                    break;

                case 2:
                    int panjang, lebar;
                    System.out.println("------------------ PERSEGI PANJANG ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Persegi Panjang");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Panjang : ");
                    panjang = sc.nextInt();
                    System.out.print("Set Lebar   : ");
                    lebar = sc.nextInt();
                    pg.setPersegiPanjang(panjang, lebar);
                    System.out.println("-----------------------------------------------");
                    bg.luas();
                    pg.luas();
                    bg.keliling();
                    pg.keliling();
                    break;

                case 3:
                    int jari;
                    System.out.println("------------------ LINGKARAN ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Lingkaran");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Jari Jari : ");
                    jari = sc.nextInt();
                    lg.setLingkaran(jari);
                    System.out.println("-----------------------------------------------");
                    bg.luas();
                    lg.luas();
                    bg.keliling();
                    lg.keliling();
                    break;

                case 4:
                    System.out.println("Keluar dari Program...");
                    System.exit(0);
                    break;
            }

            // Bad Menu Option Direct
            if (choice > 4 || choice < 1) {
                System.out.println("Pilihan Tidak Ada Di Menu! Coba Ulangi");
                do {
                    choice = sc.nextInt();
                } while (choice < 4);
            }

        } while (choice < 4);

        sc.close();
    }
}
