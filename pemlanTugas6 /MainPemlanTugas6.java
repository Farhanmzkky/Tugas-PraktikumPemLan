
import java.time.LocalDate; //Memanggil library LocalDate

public class MainPemlanTugas6{
    public static void main(String[] args) {
        // Membuat objek Manusia 
        Manusia m1 = new Manusia("Farhan", "1111", true, true);
        Manusia m2 = new Manusia("Devina", "2222", false, true);
        Manusia m3 = new Manusia("Karamoy", "3333", false, false);

        // Membuat objek MahasiswaFILKOM
        MahasiswaFILKOM mf1 = new MahasiswaFILKOM("215150601111111", 2.7, "Ari", "1111", true, false);
        MahasiswaFILKOM mf2 = new MahasiswaFILKOM("225154402222222", 3.4, "Roc", "2222", false, false);
        MahasiswaFILKOM mf3 = new MahasiswaFILKOM("245150703333333",4.0,"Farhan", "3333", true, false);

        // Membuat objek Pekerja
        Pekerja p1 = new Pekerja(10000, LocalDate.of(2023,1 , 1), 2, "Andreas", "1111", true, true);
        Pekerja p2 = new Pekerja(10000, LocalDate.of(2016, 1, 1) , 2, "Andreas", "2222", true, true);
        Pekerja p3 = new Pekerja(10000, LocalDate.of(2005, 1, 1), 10, "Relindis", "3333", false, true);

        // Membuat objek Manager
        Manager me1 = new Manager("HRD", 7500, LocalDate.of(2010, 1, 1), 0, "Rae", "1111", true, true);

        // Menampilkan informasi objek
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println(mf1);
        System.out.println(mf2);
        System.out.println(mf3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(me1);
    
    }
}
