
import java.io.BufferedReader; // Memanggil class BufferedReader
import java.io.BufferedWriter; // Memanggil class BufferedWriter
import java.io.FileReader; // Memanggil class FileReader
import java.io.FileWriter; // Memanggil class FileWriter
import java.io.IOException; // Memanggil class IOException

// Membuat class Buku
public class Buku {
    private String judulBuku;
    private String penulisBuku;
    private int tahunTerbit;

    // Membuat constructor Buku dengan parameter judulBuku, penulisBuku, dan tahunTerbit
    public Buku(String judulBuku, String penulisBuku, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.tahunTerbit = tahunTerbit;
    }
    // Membuat getter untuk judulBuku, penulisBuku, dan tahunTerbit
    public String getJudulBuku() {
        return judulBuku;
    }
    public String getPenulisBuku() {
        return penulisBuku;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Membuat method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Judul: " + judulBuku);
    }
    // Membuat method tampilkanInfo dengan parameter boolean lengkap
    public void tampilkanInfo(boolean lengkap) {
        if (lengkap) {
            System.out.println(judulBuku + ", Penulis " + penulisBuku + " dan Tahun Terbit " + tahunTerbit);
        } else {
            tampilkanInfo();
        }
    }

    // Membuat method simpanKeFile
    public void simpanKeFile() {
        // Membuat try-catch untuk menangkap IOException 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("daftarBuku.txt", true))) {
            writer.write(judulBuku + ";" + penulisBuku + ";" + tahunTerbit); // Menulis judulBuku, penulisBuku, dan tahunTerbit ke file
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data buku.");
        }
    }
    // Membuat method informasiBukuDariFile
    public static void informasiBukuDariFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("daftarBuku.txt"))) {
            String line;
            // Membaca data dari file daftarBuku.txt
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                // Menampilkan data buku
                if (data.length == 3) {
                    System.out.println("- " + data[0] + ", Penulis " + data[1] + " dan Tahun Terbit " + data[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca data buku.");
        }
    }
    // Membuat method informasiJudulDariFile
    public static void informasiJudulDariFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("daftarBuku.txt"))) {
            String line;
            // Membaca data dari file daftarBuku.txt
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length > 0) {
                    System.out.println("- " + data[0]); 
                }
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca data buku.");
        }
    }
}
