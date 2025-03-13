public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObjek = 0;
    
    // Jawaban No. 2
    // Membuat constructor tanpa parameter
    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    // Membuat constructor dengan parameter
    public Student(String n, String a, int age) {
        this.name = n;
        this.address = a;
        this.age = age; 
        jumlahObjek++;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    public double getAverage(){
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    public void displayMessage(){
        System.out.println("\nSiswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunya nilai rata rata " + getAverage());
        // Menampilkan apakah siswa lulus atau tidak
        System.out.println("Dinyatakan " + (nilaiAkhir() ? "LULUS" : "TIDAK LULUS"));
        System.out.println("==============================\n");
    }

    // Jawaban No. 3
    // Membuat method nilaiAkhir untuk memnentukan apakah siswa lulus atau tidak
    // Jika nilai rata-rata lebih dari 61 maka siswa dinyatakan lulus
    public boolean nilaiAkhir(){
        if (getAverage() > 61) {
            return true;
        } else {
            return false;
        }
    }
    // Jawaban No. 5
    // Membuat method jumlahObjek untuk menampilkan total objek yang telah dibuat
    public static void jumlahObjek(){
        System.out.println("--------------------------------------------");
        System.out.println("Jumlah objek yang telah dibuat adalah " + jumlahObjek);
        System.out.println("--------------------------------------------");
    }

}

