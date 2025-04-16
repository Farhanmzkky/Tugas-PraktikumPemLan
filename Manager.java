
import java.time.LocalDate; //Memanggil library LocalDate

//Membuat kelas Manager yang merupakan subclass dari kelas Pekerja
public class Manager extends Pekerja{
    //Membuat atribut departemen
    private String departemen;
    
    //Membuat constructor
    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    //Membuat method getPengajian untuk mendapatkan gaji
    @Override
    public double getPendapatan(){
        double tunjangan = 0.1 * getGaji();
        return super.getPendapatan() + tunjangan;
    }

    //membuat method toString untuk menampilkan informasi objek
    @Override
    public String toString(){
        return super.toString() + 
               "\nDepartemen       : " + this.departemen;
    }
}
