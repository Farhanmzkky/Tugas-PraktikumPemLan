public class Main {
    public static void main(String[] args) {
        Kue listKue[] = new Kue[20]; // Membuat array listKue dengan panjang 20 untuk menyimpan objek Kue
        // Membuat variabel untuk menyimpan total harga semua kue, total harga kue pesanan, total berat kue pesanan, total harga kue jadi, dan total jumlah kue jadi
        double totalSemuaHarga = 0; 
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0; 
        double totalJumlahJadi = 0;

        // Membuat objek KuePesanan dan KueJadi dan menyimpannya ke dalam array listKue
        listKue[0] = new KueJadi("Bolu Tape", 70000, 3);
        listKue[1] = new KuePesanan("Ciffon Cake", 85000, 1.5);
        listKue[2] = new KueJadi("Pandan Cake", 55000, 5);
        listKue[3] = new KuePesanan("Vanilla Cake", 50000, 1);
        listKue[4] = new KueJadi("Chocolate Cake", 50000, 1);
        listKue[5] = new KuePesanan("Strawberry Cake", 95000, 2.5);
        listKue[6] = new KueJadi("Blueberry Cheese Cake", 155000, 5);
        listKue[7] = new KuePesanan("Tiramisu Cake", 100000, 2.5);
        listKue[8] = new KueJadi("Banana Cake", 85000, 4);
        listKue[9] = new KuePesanan("Coffee Cake", 65000, 1.5);
        listKue[10] = new KueJadi("Roll Cake", 35000, 7);
        listKue[11] = new KuePesanan("Cheese Cake", 125000, 1);
        listKue[12] = new KueJadi("Bun Cake", 15000, 6);
        listKue[13] = new KuePesanan("Red Valvet Cake", 100000, 2);
        listKue[14] = new KueJadi("Honey Cake", 45000, 3);
        listKue[15] = new KuePesanan("Pumkin Cake", 85000, 2);
        listKue[16] = new KueJadi("Cinnamon Roll Cake", 85000, 3);
        listKue[17] = new KuePesanan("Sweet Patato Cake", 55000, 1.5);
        listKue[18] = new KueJadi("Sponge Cake", 85000, 4);
        listKue[19] = new KuePesanan("Butter Cake", 65000, 1);

        double maxHarga = 0; // Variabel untuk menyimpan harga kue termahal
        Kue kueTermahal = null; // Variabel untuk menyimpan objek kue termahal

        // Menampilkan daftar semua kue dan menghitung total harga, total berat, dan total jumlah
        System.out.println("\n---------------------->>> Daftar Semua Kue <<<----------------------");
        for (Kue kue : listKue) { // Menggunakan enhanced for loop untuk iterasi setiap objek Kue dalam array listKue
            System.out.println(kue);
            totalSemuaHarga += kue.hitungHarga(); // Menghitung total harga semua kue

            // Menghitung total harga kue pesanan, total berat kue pesanan, total harga kue jadi, dan total jumlah kue jadi
            if(kue instanceof KuePesanan kuePesanan){
                totalHargaPesanan += kuePesanan.hitungHarga();
                totalBeratPesanan += kuePesanan.getBerat();
            }else if (kue instanceof KueJadi kueJadi) {
                totalHargaJadi += kueJadi.hitungHarga();
                totalJumlahJadi += kueJadi.getJumlah();
            }

            // Menghitung kue termahal
            if (kue.hitungHarga() > maxHarga){
                maxHarga = kue.hitungHarga();
                kueTermahal = kue;
            }
        }
        System.out.println("----------------------------------------------------------------------\n");

        // Menampilkan total harga semua kue, total harga kue pesanan, total berat kue pesanan, total harga kue jadi, dan total jumlah kue jadi
        System.out.println("-> Total harga semua jenis kue : Rp." + totalSemuaHarga);
        System.out.println("\n---------------------------> List Pesanan <---------------------------");
        System.out.println("-> Total harga kue : Rp." + totalHargaPesanan);
        System.out.println("-> Berat kue       : " + totalBeratPesanan);
        System.out.println("\n---------------------------> List Kue Jadi <--------------------------");
        System.out.println("-> Total harga kue : Rp" + totalHargaJadi);
        System.out.println("-> Jumlah kue      : " + totalJumlahJadi);

        // Menampilkan kue termahal
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("Kue Termahal : " + kueTermahal.getNama() + ", Harga : " + kueTermahal.hitungHarga()); 
        System.out.println("----------------------------------------------------------------------\n");   
    }
}
