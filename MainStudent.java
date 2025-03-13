import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        // Instansiasi objek Scanner
        Scanner input = new Scanner(System.in);

        // Jawaban No. 3
        System.out.println("\nMenghitung Nilai Rata-Rata Siswa!!");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah siswa     : ");

        // Mengambil input jumlah siswa
        int jumlah = input.nextInt();
        // Membuat array objek Student
        Student[] students = new Student[jumlah];
        input.nextLine();

        // Mengambil input nama, alamat, umur, nilai matematika, science, dan english
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Masukkan Nama Siswa       : ");
            students[i].setName(input.nextLine());

            System.out.print("Masukkan Alamat Siswa     : ");
            students[i].setAddress(input.nextLine());

            System.out.print("Masukkan Umur Siswa       : ");
            students[i].setAge(input.nextInt());
            input.nextLine();

            System.out.print("Masukkan Nilai Matematika : ");
            students[i].setMath(input.nextInt());
            input.nextLine();

            System.out.print("Masukkan Nilai Science    : ");
            students[i].setScience(input.nextInt());
            input.nextLine();

            System.out.print("Masukkan Nilai English    : ");
            students[i].setEnglish(input.nextInt());
            input.nextLine();

            students[i].displayMessage();
        }

        //instansiasi objek dengan nama anna
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // Menggunakan contructor lain
        // Instansiasi objek dengan nama chris
        System.out.println("==============================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // Objek dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("==============================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

         // Objek dengan nama chris dirubah informasi alamat dan umurnya melalui method
         System.out.println("==============================");
         chris.setAddress("Surabaya");
         chris.setAge(22);
         chris.displayMessage();

        // Menampilkan jumlah objek yang telah dibuat
        Student.jumlahObjek();
    }
}
