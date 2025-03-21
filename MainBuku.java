import java.util.Scanner; // Memanggil class Scanner

public class MainBuku {
  public static void main(String[] args) {
    // Membuat objek input dari class Scanner
    Scanner input = new Scanner(System.in);
    int pilihan; // Membuat variabel pilihan

    // Membuat perulangan do-while
    do {
      System.out.println("\nSelamat Datang di Perpustakaan!!");
      System.out.println("1. Tambah buku");
      System.out.println("2. Tampilkan daftar buku secara lengkap");
      System.out.println("3. Tampilkan hanya judul buku");
      System.out.println("4. Keluar");
      System.out.print("Silahkan masukkan pilihan anda : ");
      pilihan = input.nextInt();
      input.nextLine(); 
      // Membuat switch case
      switch (pilihan) {
        case 1 :
        System.out.println("\n-----------------> Tambah Buku <-----------------");
        System.out.print("Masukkan jumlah buku yang ingin ditambahkan : ");
        int tambahBuku = input.nextInt();
        input.nextLine(); 

        // Membuat perulangan for untuk menambahkan buku
        for (int i = 0; i < tambahBuku; i++) {
          System.out.println("\n==> Buku ke-" + (i + 1));
          System.out.print("- Judul Buku   : ");
          String judul = input.nextLine();
          System.out.print("- Penulis      : ");
          String penulis = input.nextLine();
          System.out.print("- Tahun Terbit : ");
          int tahunTerbit = input.nextInt();
          input.nextLine(); 
          Buku bukuBaru = new Buku(judul, penulis, tahunTerbit);
          bukuBaru.simpanKeFile();
          System.out.println("Buku berhasil ditambahkan!");
        }
        break;

        case 2 :
        System.out.println("\n-----------------> Daftar Buku <-----------------");
        System.out.println("Daftar Buku lengkap :");
        Buku.informasiBukuDariFile();
        break;

        case 3 :
        System.out.println("\n-----------------> Daftar Buku <-----------------");
        System.out.println("Daftar Judul buku :");
        Buku.informasiJudulDariFile();
          break;

        case 4 :
        System.out.println("\n-----------------> Keluar <-----------------");
        System.out.println("Terima Kasih telah menggunakan sistem Perpustakaan!!");
        break;

        default :
        System.out.println("Pilih sesuai pilihan yang ada!!");
      }
    // Membuat kondisi jika pilihan tidak sama dengan 4
    } while (pilihan != 4);

    // Menutup objek input
    input.close();
  }
}