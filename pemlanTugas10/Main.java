// Mengimport dari package java.util untuk menggunakan List, ArrayList, Arrays, Collections, Comparator, HashSet, dan Set
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Membuat daftar pemain untuk Tim A
        List<Pemain> pemainTimA = new ArrayList<>(Arrays.asList(
            new Pemain(168,50),
            new Pemain(170,60),
            new Pemain(165,56),
            new Pemain(168,55),
            new Pemain(172,60),
            new Pemain(170,70),
            new Pemain(169,66),
            new Pemain(165,56),
            new Pemain(171,72),
            new Pemain(166,56)
        ));
        
        // Membuat daftar pemain untuk Tim B
        List<Pemain> pemainTimB = new ArrayList<>(Arrays.asList(
            new Pemain(170,66),
            new Pemain(167,60),
            new Pemain(165,59),
            new Pemain(166,58),
            new Pemain(168,58),
            new Pemain(175,71),
            new Pemain(172,68),
            new Pemain(171,68),
            new Pemain(168,65),
            new Pemain(169,60)
        ));
    
        System.out.println("=================>> Tim A <<================");
        System.out.println("========== Tinggi Badan Ascending ==========");
        sortByTB(pemainTimA, true); // Mengurutkan pemain Tim A berdasarkan tinggi badan secara ascending
        pemainTimA.forEach(System.out::println);

        System.out.println("\n========= Tinggi Badan Descending ==========");
        sortByTB(pemainTimA, false); // Mengurutkan pemain Tim A berdasarkan tinggi badan secara descending
        pemainTimA.forEach(System.out::println);

        System.out.println("\n========== Berat Badan Ascending ===========");
        sortByBB(pemainTimA, true); // Mengurutkan pemain Tim A berdasarkan berat badan secara ascending
        pemainTimA.forEach(System.out::println);

        System.out.println("\n========== Berat Badan Descending ==========");
        sortByBB(pemainTimA, false); // Mengurutkan pemain Tim A berdasarkan berat badan secara descending
        pemainTimA.forEach(System.out::println);

        System.out.println("\n\n=================>> Tim B <<================");
        System.out.println("\n========== Tinggi Badan Ascending ==========");
        sortByTB(pemainTimB, true); // Mengurutkan pemain Tim B berdasarkan tinggi badan secara ascending
        pemainTimB.forEach(System.out::println);

        System.out.println("\n========= Tinggi Badan Descending ==========");
        sortByTB(pemainTimB, false); // Mengurutkan pemain Tim B berdasarkan tinggi badan secara descending
        pemainTimB.forEach(System.out::println);

        System.out.println("\n========== Berat Badan Ascending ===========");
        sortByBB(pemainTimB, true); // Mengurutkan pemain Tim B berdasarkan berat badan secara ascending
        pemainTimB.forEach(System.out::println);

        System.out.println("\n========== Berat Badan Descending ==========");
        sortByBB(pemainTimB, false); // Mengurutkan pemain Tim B berdasarkan berat badan secara descending
        pemainTimB.forEach(System.out::println);

        System.out.println("\n\n==========>> Maximum & Minimum <<==========");
        pemainMaxMin(pemainTimA, "Tim A"); // Menampilkan tinggi dan berat badan maksimum dan minimum untuk Tim A
        pemainMaxMin(pemainTimB, "Tim B"); // Menampilkan tinggi dan berat badan maksimum dan minimum untuk Tim B

        System.out.println("");
        sortByTB(pemainTimB, true);
        searchTB(pemainTimB, 168, "B"); // Mencari jumlah pemain di Tim B dengan tinggi badan 168 cm
        searchTB(pemainTimB, 160, "B"); // Mencari jumlah pemain di Tim B dengan tinggi badan 160 cm

        System.out.println("");
        sortByBB(pemainTimA, true);
        searchBB(pemainTimA, 56, "A"); // Mencari jumlah pemain di Tim A dengan berat badan 56 kg
        searchBB(pemainTimA, 53, "A"); // Mencari jumlah pemain di Tim A dengan berat badan 53 kg

        System.out.println("\n======>> Cek Kesamaan TB atau BB Pemain <<======");
        checkSama(pemainTimA, pemainTimB); // Mengecek apakah ada pemain di Tim A dan Tim B yang memiliki tinggi badan atau berat badan yang sama

    }

    // Membuat metode untuk mengurutkan pemain berdasarkan tinggi badan
    public static void sortByTB (List<Pemain> pemain, boolean ascending) {
        pemain.sort(Comparator.comparingInt(Pemain::getTinggiBadan)); // Menggunakan Comparator untuk mengurutkan berdasarkan tinggi badan
        if(!ascending) Collections.reverse(pemain); // Jika ascending adalah false, maka membalik urutan
    }

    // Membuat metode untuk mengurutkan pemain berdasarkan berat badan
    public static void sortByBB (List<Pemain> pemain, boolean ascending){
        pemain.sort(Comparator.comparingInt(Pemain::getBeratBadan)); // Menggunakan Comparator untuk mengurutkan berdasarkan berat badan
        if(!ascending) Collections.reverse(pemain); // Jika ascending adalah false, maka membalik urutan
    }

// Membuat metode untuk menampilkan tinggi badan dan berat badan maksimum dan minimum dari daftar pemain
    public static void pemainMaxMin (List<Pemain> pemain, String tim){
        // Inisialisasi nilai minimum dan maksimum untuk tinggi badan dan berat badan
        int minTB = Integer.MIN_VALUE;
        int maxTB = Integer.MAX_VALUE;
        int minBB = Integer.MIN_VALUE;
        int maxBB = Integer.MAX_VALUE;

        // Iterasi melalui daftar pemain untuk menemukan nilai minimum dan maksimum
        for (Pemain p : pemain){ 
            if (p.getTinggiBadan() < minTB) minTB = p.getTinggiBadan();
            if (p.getTinggiBadan() > maxTB) maxTB = p.getTinggiBadan();
            if (p.getBeratBadan() < minBB) minBB = p.getBeratBadan();
            if (p.getBeratBadan() > maxBB) maxBB = p.getBeratBadan();
        }

        // Menampilkan hasil
        System.out.println(tim + " -> Tinggi Badan Maximum : " + maxTB + " & Minimum : " + minTB);
        System.out.println(tim + " -> Berat Badan Maximum : " + maxBB + " & Minimum : " + minBB);
    }

    // Membuat metode untuk mencari jumlah pemain dengan tinggi badan atau berat badan tertentu
    public static void searchTB (List<Pemain> pemain, int cari, String tim){
        int jumlah = 0;
        for (Pemain p : pemain){
            if (p.getTinggiBadan() == cari){ // Mengecek apakah tinggi badan pemain sama dengan yang dicari
                jumlah++; 
            }
        }
        System.out.println("Sebanyak " + jumlah + " pemain yang memiliki tinggi badan " + cari + " di Tim " + tim);
    }

    // Membuat metode untuk mencari jumlah pemain dengan berat badan tertentu
    public static void searchBB (List<Pemain> pemain, int cari, String tim){
        int jumlah = 0;
        for (Pemain p : pemain){
            if (p.getBeratBadan() == cari){ // Mengecek apakah berat badan pemain sama dengan yang dicari
                jumlah++;
            }
        }
        System.out.println("Sebanyak " + jumlah + " pemain yang memiliki berat badan " + cari + " di Tim " + tim);
    }

    // Membuat metode untuk mengecek apakah ada pemain di Tim A dan Tim B yang memiliki tinggi badan atau berat badan yang sama
    public static void checkSama (List<Pemain> pemainTimA, List<Pemain> pemainTimB){
        Set<Integer> tbA = new HashSet<>(); // Menggunakan HashSet untuk menyimpan tinggi badan pemain Tim A
        Set<Integer> bbA = new HashSet<>(); // Menggunakan HashSet untuk menyimpan berat badan pemain Tim A

        // Mengisi HashSet dengan tinggi badan dan berat badan pemain Tim A
        for (Pemain p : pemainTimA){
            tbA.add(p.getTinggiBadan());
            bbA.add(p.getBeratBadan());
        }

        boolean ada = false; // Membuat variabel boolean ada untuk menandai apakah ada kesamaan
        for (Pemain p : pemainTimB){
            // Mengecek apakah tinggi badan atau berat badan pemain Tim B ada di HashSet Tim A
            if(tbA.contains(p.getTinggiBadan())){
                System.out.println("- Tinggi Badan yang sama " + p.getTinggiBadan() + " cm");
                ada = true;
            } else { // Jika tidak ada, tampilkan pesan
                System.out.println("- Tinggi Badan " + p.getTinggiBadan() + " cm tidak ada di Tim A");
            }
            
            // Mengecek apakah berat badan pemain Tim B ada di HashSet Tim A
            if (bbA.contains(p.getBeratBadan())){
                System.out.println("- Berat Badan yang sama " + p.getBeratBadan() + " kg");
                ada = true;
            } else { // Jika tidak ada, tampilkan pesan
                System.out.println("- Berat Badan " + p.getBeratBadan() + " kg tidak ada di Tim A");
            }
        }
    }
}
