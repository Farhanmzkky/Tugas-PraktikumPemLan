import java.io.File;

public class CheckUkaranFile {
    public static void main(String[] args) {
        File file = new File("filepercobaan1.txt"); // Membuat objek file dan memasukkan pathname file

        // Mencari file
        if (file.exists()) {
            long ukuranByte = file.length(); // Mendeklarasi ukuran dengan panjang file dalam byte

            if (ukuranByte < 1024 * 1024) {
                // jika kurang dari 1 MB, tampilkan dalam KB
                double ukuranKB = ukuranByte / 1024.0;
                System.out.print("Ukuran file : " + ukuranKB + "KB");
            } else {
                // 1 MB atau lebih, tampilkan dalam MB
                double ukuranMB = ukuranByte / (1024.0 * 1024.0);
                System.out.print("Ukuran file : " + ukuranMB + "MB");
            }
        // Jika file tidak valid atau tidak ditemukan    
        } else {
            System.out.println("Maaf file tidak ditemukan, mungkin salah nama file");
        }
    }
}
