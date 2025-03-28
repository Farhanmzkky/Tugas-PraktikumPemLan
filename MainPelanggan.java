import java.util.Scanner; // Memanggil class Scanner

public class MainPelanggan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek input dari class Scanner
        System.out.println("================>> SELAMAT DATANG <<================");
        System.out.println("===============>> di SWALAYAN TINY <<===============");
        // Meminta inputan dari user
        System.out.println("Masukkan data anda terlebih dahulu!!");
        System.out.print("Nama           : "); 
        String nama = input.nextLine();  
        System.out.print("Nomor Pengguna : "); 
        String noPelanggan = input.nextLine();  
        System.out.print("Saldo          : "); 
        double saldo = input.nextDouble();  
        input.nextLine();  
        System.out.print("PIN            : "); 
        String pin = input.nextLine();  
        System.out.println("====================================================\n");
        // Membuat objek p1 dari class Pelanggan
        Pelanggan p1 = new Pelanggan(saldo, noPelanggan, nama, pin);

        while (true) {  // Membuat looping while dengan nilai true
            // Menampilkan menu pilihan untuk user
            System.out.println("MENU : ");
            System.out.println("1. Lakukan Pembelian");
            System.out.println("2. Top-up Saldo");
            System.out.println("3. Keluar");
            System.out.print("-> Pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) { // Membuat switch case
                case 1: // Case 1 untuk pembelian
                    System.out.println("================>> PEMBELIAN <<================");
                    System.out.println("Masukkan data anda terlebih dahulu!!");
                    System.out.print("PIN : "); 
                    String pinpeng = input.nextLine(); 
                    if (p1.validasiPin(noPelanggan, pinpeng)) {  // Memanggil method validasiPin
                        System.out.print("Jumlah pembelian: Rp "); 
                        double jumlah = input.nextDouble(); 
                        p1.transaksi(jumlah); // Memanggil method transaksi
                    } else { 
                        System.out.println("PIN anda salah, Transaksi dibatalkan."); 
                    } 
                    break;
                case 2:
                    System.out.println("================>> TOP-UP <<================");
                    System.out.println("Masukkan data anda terlebih dahulu!!");
                    System.out.print("PIN : "); 
                    String pinTopUp = input.nextLine(); 
                    if (p1.validasiPin(noPelanggan, pinTopUp)) { // Memanggil method validasiPin
                        System.out.print("Jumlah top-up : Rp "); 
                        double topUp = input.nextDouble(); 
                        p1.topup(topUp); // Memanggil method topup
                    } else { 
                        System.out.println("PIN anda salah, Transaksi dibatalkan."); 
                    } 
                    break;
                case 3: 
                    System.out.println("Terima kasih telah menggunakan layanan kami!"); 
                    input.close(); // Menutup input agar tidak terjadi memory leak
                    return;
                default: 
                    System.out.println("Pilihan tidak valid. Silakan coba lagi."); 
                    break;  
            }
        }
    }
}
