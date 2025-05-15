import javax.swing.SwingUtilities; // Mengimpor kelas SwingUtilities untuk menjalankan GUI di thread Event Dispatching

public class Main {
    public static void main(String[] args) {
        // Menggunakan SwingUtilities untuk memastikan GUI dijalankan di thread Event Dispatching agar thread utama tidak terblokir
        SwingUtilities.invokeLater(() -> new FormDaftarUlang().setVisible(true));
    }
}
