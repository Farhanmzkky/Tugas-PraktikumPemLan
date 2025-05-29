// Membuat class Pemain yang merepresentasikan pemain dalam sebuah tim olahraga
public class Pemain {
    // Atribut untuk menyimpan berat badan dan tinggi badan pemain
    int beratBadan;
    int tinggiBadan;

    // Constructor untuk menginisialisasi atribut berat badan dan tinggi badan
    Pemain(int tinggiBadan, int beratBadan){
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    // Getter untuk mendapatkan nilai tinggi badan dan berat badan
    public int getTinggiBadan() {
        return tinggiBadan;
    }
    // Getter untuk mendapatkan nilai berat badan
    public int getBeratBadan() {
        return beratBadan;
    }

    // Mengoverride metode toString untuk menampilkan informasi pemain
    @Override
    public String toString(){
        return "- Berat Badan : " + beratBadan + " kg, Tinggi Badan: " + tinggiBadan + " cm";
    }
}
