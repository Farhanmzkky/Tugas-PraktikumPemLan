
import java.io.File;
import java.util.Scanner;


public class HapusDirektori{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan direktori yang ingin anda hapus : ");
        String direktori = input.nextLine();

        File folder = new File(direktori);
        // Mengecek apakah folder ada dan merupakan direktori
        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();

             // Menghapus semua file dalam direktori
            for (File file : daftarFile) {
                // Jika file adalah file biasa, hapus file tersebut
                if (file.isFile()) {
                    if (file.delete()) { // Menghapus file
                        System.out.println("File terhapus: " + file.getName());
                    } else { // Jika gagal menghapus file
                        System.out.println("Gagal menghapus file: " + file.getName());
                    }
                }
            }

            // Hapus direktori setelah semua file terhapus
            if (folder.delete()) { // Menghapus direktori
                System.out.println("Direktori berhasil dihapus: " + folder.getName());
            } else { // Jika gagal menghapus direktori
                System.out.println("Maaf, gagal menghapus direktori, pastikan semua file sudah dihapus");
            }
        // Jika direktori tidak valid atau tidak ditemukan
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan direktori");
        }
    }
}
    
