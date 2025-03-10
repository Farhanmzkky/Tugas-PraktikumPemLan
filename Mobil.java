public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(double d){
        kecepatan = d;
        // memanggil method agar dari Kilometer/Jam menjadi Meter/Sekon
        kecepatan = rubahKecepatan();
    }

    // Membuat method setWaktu (Soal no. 4)
    public void setWaktu(double d){
        waktu = d;
        // memanggil method agar mengubah jam menjadi sekon
        waktu = rubahWaktu();
    }
    // Membuat method rubahWaktu dengan modifier private (Soal no. 5)
    private  double rubahWaktu(){
        // 1 jam = 3600 sekon
        return waktu * 3600;
    }
    // Membuat method rubahKecepatan dengan modifier private (Soal no. 6)
    private  double rubahKecepatan(){
        // 1 km/h = 5/18 m/s
        return kecepatan * 5/18;
    }
    // Membuat method hitungJarak untuk menghitung jarak mobil (Soal no. 7)
    public double hitungJarak(){
        return kecepatan * waktu;
    }
    // Membuat method rubahJarak untuk mengubah jarak yang awalnya meter menjadi kilimeter (Soal no. 8)
    public double rubahJarak(){
        return hitungJarak()/1000;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("dengan waktu sebesar " + waktu + " s");
        System.out.println("jarak tempuh mobil tersebut adalah " + rubahJarak() + " km/h");
    }
}
