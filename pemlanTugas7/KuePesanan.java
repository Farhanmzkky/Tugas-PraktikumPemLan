// Membuat class KuePesanan yang merupakan subclass dari Kue
public class KuePesanan extends Kue {
    // Atribut
    private double berat;

    // Constructor
    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    // Getter
    public double getBerat(){
        return this.berat;
    }

    // Membuat method untuk menghitung harga kue pesanan dengan mengoverride method hitungHarga dari superclass Kue
    @Override
    public double hitungHarga(){
        return getHarga() * berat;
    }

    // Membuat method toString untuk menampilkan informasi kue pesanan dengan mengoverride method toString dari superclass Kue
    @Override
    public String toString(){
        return super.toString() + ", Berat : " + getBerat();
    }
}
