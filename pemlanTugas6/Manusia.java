public class Manusia { //Membuat class dengan nama Manusia
    //Membuat atribut
    private String nama;
    private boolean jenisKelamin = true; //true = laki-laki, false = perempuan
    private String nik;
    private boolean menikah = true; //true = menikah, false = belum menikah

    //Membuat constructor
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    //Membuat getter & setter
    public String getNama(){
        return this.nama;
    }
    public boolean getJenisKelamin(){
        return this.jenisKelamin;
    }
    public String getNik(){
        return this.nik;
    }
    public boolean getMenikah(){
        return this.menikah;
    }

    // Membuat method getTunjangan
    public double getTunjangan(){
        double tunjangan; // Mendeklarasikan variabel tunjangan
        if(menikah){ // Jika menikah
            if(jenisKelamin){ // Jika jenis kelamin laki-laki
                tunjangan = 25.0; 
            } else { // Jika jenis kelamin perempuan
                tunjangan = 20.0;
            }
        } else { // Jika belum menikah
            tunjangan = 15.0;
        }
        return tunjangan; // Mengembalikan nilai tunjangan
    }

    //Membuat method getPendapatan
    public double getPendapatan(){
        return getTunjangan(); // Mengembalikan nilai tunjangan
    }  
    
    //Membuat method toString dengan mengoverride method toString
    @Override
    public String toString(){ 
        return "\nNama             : " + this.nama +
               "\nNIK              : " + this.nik  +
               "\nJenis Kelamin    : " + (this.jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\nPendapatan       : " + getPendapatan() ;
    }
}