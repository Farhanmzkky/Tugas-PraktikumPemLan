// Membuat class MahasiswaFILKOM yang merupakan subclass dari Manusia
public class MahasiswaFILKOM extends Manusia{ 
    //Membuat atribut nim dan ipk
    private String nim;
    private double ipk;

    //Membuat constructor
    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    //Membuat getter & setter
    public String getNIM(){
        return this.nim;
    }
    public double getIPK(){
        return this.ipk;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setIPK(double ipk){
        this.ipk = ipk;
    }

    //Membuat method getStatus untuk mendapatkan status mahasiswa
    public String getStatus(){
        String akt = "20" + nim.substring(0,2); // Mendapatkan tahun masuk dengan mengambil 2 digit pertama dari nim
        char kodeProdi = nim.charAt(6); // Mendapatkan kode prodi dengan mengambil karakter ke-6 dari nim
        // Menggunakan switch expression untuk menentukan nama prodi berdasarkan kode prodi
        String prodi = switch (kodeProdi) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Kamu bukan anak prodi FILKOM";
        };
        return prodi + ", " + akt; // Mengembalikan nama prodi dan tahun masuk
    }

    //Membuat method getBeasiswa untuk mendapatkan tunjangan beasiswa
    public double getBeasiswa(){
        double tunjangan; // Mendeklarasikan variabel tunjangan
        if(ipk >= 3.0 && ipk <= 3.5){
            tunjangan = 50;
        } else if (ipk >= 3.5 && ipk <= 4.0){
            tunjangan = 75;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    } 

    //Membuat method getPendapatan untuk mendapatkan pendapatan mahasiswa dengan
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    //Membuat method toString untuk menampilkan informasi mahasiswa
    @Override
    public String toString(){
        return super.toString() +
               "\nNIK              : " + this.nim +
               "\nIPK              : " + this.ipk +
               "\nStatus           : " + getStatus();
    }
}

