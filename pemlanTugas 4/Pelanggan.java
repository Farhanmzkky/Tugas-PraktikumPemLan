// Membuat class Pelanggan
// Membuat class Pelanggan dengan atribut saldo, noPelanggan, nama, pin, salahPin, dan statusPin
public class Pelanggan {
    private double saldo;
    private String noPelanggan;
    private String nama;
    private String pin;
    private int salahPin = 0;
    private boolean statusPin = false;

    // Membuat constructor Pelanggan
    public Pelanggan(){ 
        this.nama = "";  
        this.noPelanggan = "";  
        this.saldo = 0;  
        this.pin = "";  
    }
    // Membuat constructor Pelanggan dengan parameter saldo, noPelanggan, nama, dan pin
    public Pelanggan(double  saldo, String noPelanggan, String nama, String pin ) {
        this.saldo = saldo;
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.pin = pin;
    }

    // Membuat getter dan setter
    public double getSaldo(){
        return saldo;
    } 
    public String getNoPelanggan(){
        return noPelanggan;
    }
    public String getNama(){
        return nama;
    }
    public String getPin(){
        return pin;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNoPelanggan(String noPelanggan){
        this.noPelanggan = noPelanggan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setPin(String pin){
        this.pin = pin;
    }

    // Membuat method jenisPelanggan dengan parameter jumlah
    public double jenisPelanggan(double jumlah){
        String jenis = noPelanggan.substring(0,2); // Mengambil 2 digit pertama dari noPelanggan
        double cashback = 0; // Membuat variabel cashback dengan nilai 0
        if (jenis.equals("38")){ // Jika jenis sama dengan 38 (Silver)
            if(jumlah > 1000000){
                cashback = jumlah * 0.05; // Jika jumlah lebih dari 1.000.000, maka cashback 5%
            }
        }else if (jenis.equals("56")) { // Jika jenis sama dengan 56 (Gold)
            if( jumlah > 1000000){ 
                cashback = jumlah * 0.07; // Jika jumlah lebih dari 1.000.000, maka cashback 7%
            } 
            else{ 
                cashback = jumlah * 0.02; // Jika jumlah kurang dari 1.000.000, maka cashback 2%
            } 
        }  else if (jenis.equals("74")) { // Jika jenis sama dengan 74 (Platinum)
            if( jumlah > 1000000){ 
                cashback = jumlah * 0.10; // Jika jumlah lebih dari 1.000.000, maka cashback 10%
            } 
            else{ 
                cashback = jumlah * 0.05; // Jika jumlah kurang dari 1.000.000, maka cashback 5%
            } 
             
        }
        return cashback;// Mengembalikan nilai cashback
    }
    // Membuat method transaksi dengan parameter jumlah
    public void transaksi(double jumlah) { 
        if (saldo < jumlah) { // Jika saldo kurang dari jumlah
            System.out.println("Maaf, saldo anda tidak cukup");
            return; 
        }
        // Memanggil method jenisPelanggan dengan parameter jumlah
        double cashback = jenisPelanggan(jumlah);
        // Menghitung total
        double total = jumlah - cashback;

        // Jika saldo kurang dari total
        if (saldo - total < 10000) {
            System.out.println("Maaf, saldo harus lebih dari Rp 10.000 setelah transaksi");
            return;
        }
    
        saldo -= total; // Mengurangi saldo dengan total
        saldo += cashback; // Menambah saldo dengan cashback
    
        System.out.println("Pembelian berhasil!!");
        System.out.println("Anda mendapat cashback: Rp " + cashback);
        System.out.println("Saldo: Rp " + saldo);
    }
    
    // Membuat method topup dengan parameter jumlah
    public void topup(double jumlah){
        saldo += jumlah; // Menambah saldo dengan jumlah
        System.out.println("Anda berhasil Top-up!! Saldo anda : " + saldo);
    }

    // Membuat method validasiPin dengan parameter noPengguna dan pin
    public boolean validasiPin(String noPengguna, String pin){
        // Jika statusPin bernilai true
        if(statusPin){
            System.out.println("Maaf, akun anda telah terblokir");
            return false;
        }
        // Jika noPelanggan sama dengan this.noPelanggan dan pin sama dengan this.pin
        if(noPelanggan.equals(this.noPelanggan) && pin.equals(this.pin)){ 
            salahPin = 0;  
            return true;
        }
        // Jika salahPin lebih dari 3
        else {
            salahPin++;
            System.out.println("Percobaan ke- " + salahPin + " gagal");
            if(salahPin > 3){ // Jika salahPin lebih dari 3 akun terblokir
                statusPin = true;
                System.out.println("Sudah mencapai batas MAX, akun anda terblokir!!");
            }
        }
        return false; // Mengembalikan nilai false
    } 
}
