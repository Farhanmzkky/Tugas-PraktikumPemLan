
import java.io.File;
import java.util.Scanner;

public class ListSemuaFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Path Directory : ");
        String path = input.nextLine(); 

        // Membuat objek File dengan path yang diberikan
        File folder = new File(path);
        // Mengecek apakah folder ada dan merupakan direktori
        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();
            System.out.println("Daftar file di dalam direktori " + path + " :");

            // Menampilkan semua file dalam direktori
            for (File file : daftarFile) {
                if (file.isFile()) {
                    System.out.println("- " + file.getName());
                }
            }
        // Jika tidak ada file dalam direktori
        } else {
            System.out.println("Maaf, direktori tidak ditemukan");
        }
    }
}

