import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        //instansiasi Scanner dari class scanner untuk user dapat menerima input
        Scanner input = new Scanner(System.in);
        //instansiasi objek bernama m1
        Mobil m1 = new Mobil();
        System.out.println("=========>> Data Mobil Pertama <<=========");
        System.out.println("Silahkan masukkan data mobil pertama anda!!");

        //menyimpan input kecepatan dari user 
        System.out.print("Masukkan Kecepatan mobil anda  : ");
        m1.setKecepatan(input.nextInt());

        // menyimpan input manufaktur dari user 
        System.out.print("Masukkan manufaktur mobil anda : ");
        m1.setManufaktur(input.next());

        // menyimpan input no plat dari user
        System.out.print("Masukkan No Plat mobil anda    : ");
        m1.setNoPlat(input.next());

        // menympan input warna mobil dari user
        System.out.print("Masukkan warna mobil anda      : ");
        m1.setWarna(input.next());

        // menympan input waktu tempuh mobil dari user
        System.out.print("Masukkan waktu tempuh dalam jam mobil anda : ");
        m1.setWaktu(input.nextDouble());

        // Menampilkan informasi mobil pertama yang ada di class mobil 
        m1.displayMessage();
        System.out.println("");

        //instansiasi objek bernama m2
        Mobil m2 = new Mobil();
        System.out.println("=========>> Data Mobil Kedua <<=========");
        System.out.println("Silahkan masukkan data mobil kedua anda!!");

        //menyimpan input kecepatan dari user 
        System.out.print("Masukkan Kecepatan mobil anda  : ");
        m2.setKecepatan(input.nextInt());

        //menyimpan input manufaktur dari user 
        System.out.print("Masukkan manufaktur mobil anda : ");
        m2.setManufaktur(input.next());

        //menyimpan input no plat dari user
        System.out.print("Masukkan No Plat mobil anda    : ");
        m2.setNoPlat(input.next());

        //menympan input warna dari mobil
        System.out.print("Masukkan warna mobil anda      : ");
        m2.setWarna(input.next());

        // menympan input waktu tempuh mobil dari user
        System.out.print("Masukkan waktu tempuh dalam jam mobil anda : ");
        m2.setWaktu(input.nextDouble());

        // Menampilkan informasi mobil pertama yang ada di class mobil
        m2.displayMessage();
        System.out.println("========================================");

        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 dirubah menjadi warna hijau");
        m1.setWarna("Hijau");
        //menampilkan hasil perubahan
        m1.displayMessage();

        // Menutup objek input
        input.close();
    }
}
