public class Aritmatika{

    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
        //menambahkan syntax
        hitungPerkalian(a, b);
    }

    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : " + nilai);
        //hitungPenjumlahan(a,b); error
    }

    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian (String nil1, String nil2){
        double n1 = Double.parseDouble(nil1);
        double n2 = Double.parseDouble(nil2);
        return n1/n2;
    }
}