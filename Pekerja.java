
import java.time.LocalDate; //Memanggil library LocalDate
import java.time.Period; //Memanggil library Period

// Kelas Pekerja yang merupakan subclass dari kelas Manusia
public class Pekerja extends Manusia{
    //Membuat atribut gaji, tahunMasuk, dan jumlahAnak
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    //Membuat constructor
    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    //Membuat getter & setter
    public double getGaji(){
        return this.gaji;
    }
    public LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }
    public int getJumlahAnak(){
        return this.jumlahAnak;
    }
    public void setGaji(double  gaji){
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    //Membuat method getBonus untuk mendapatkan tunjangan bonus
    public double getBonus(){
        LocalDate tahunIni = LocalDate.now(); // Mendapatkan tahun saat ini
        Period lamaBekerja =  Period.between(tahunMasuk, tahunIni); // Menghitung selisih tahun antara tahun masuk dan tahun ini
        int tahunBekerja = lamaBekerja.getYears(); // Mengambil tahun dari selisih tersebut
        double bonus;

        if (tahunBekerja <= 5){
            bonus = 0.05;
        } else if (tahunBekerja >= 5 && tahunBekerja <= 10){
            bonus = 0.10;
        } else {
            bonus = 0.15;
        }
        return gaji * bonus;
    }

    // Membuat method getPendapatan untuk mendapatkan pendapatan pekerja
    @Override
    public double getPendapatan(){
        return super.getTunjangan() + gaji + getBonus() + (jumlahAnak * 20); 
    }

    //Membuat method toString untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return super.toString() +
               "\nTahun Masuk      : " + this.tahunMasuk +
               "\nJumlah Anak      : " + this.jumlahAnak +
               "\nGaji             : " + gaji;
    }
    
}
