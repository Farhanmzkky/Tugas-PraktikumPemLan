// Membuat class KueJadi yang merupakan subclass dari Kue
public class KueJadi extends Kue{
    // Atribut
    private double jumlah; 

    // Constructor
    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }
    // Getter
    public double getJumlah(){
        return this.jumlah;
    }

    // Membuat method untuk menghitung harga kue jadi dengan mengoverride method hitungHarga dari superclass Kue
    @Override
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }

    // Membuat method toString untuk menampilkan informasi kue jadi dengan mengoverride method toString dari superclass Kue
    public String toString(){
        // Menggunakan super.toString() untuk memanggil method toString dari superclass Kue
        return super.toString()  + ", Jumlah : " + jumlah;
    }
}
