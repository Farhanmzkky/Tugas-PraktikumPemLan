//Membuat class Kue yang merupakan superclass dari class KuePesanan dan KueJadi
public abstract class Kue {
    // Atribut
    private String nama;
    private double harga;
    public abstract double hitungHarga(); // Method abstrak untuk menghitung harga kue

    // Constructor
    public Kue (String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama(){
        return this.nama;
    }
    public double getHarga(){
        return this.harga;
    }

    // Membuat method toString untuk menampilkan informasi kue
    @Override
    public String toString(){
        return "Nama Kue : " + getNama() + ", Harga : " + getHarga();
    }
}
