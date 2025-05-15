import java.awt.*; // Mengimpor java.awt untuk menggunakan kelas-kelas seperti Color, Font, dan Layout
import java.awt.event.*; // Mengimpor java.awt.event untuk menangani event seperti ActionEvent
import javax.swing.*; // Mengimpor javax.swing untuk menggunakan komponen GUI seperti JFrame, JLabel, JTextField, JTextArea, JButton, dan JOptionPane

// Membuat kelas FormDaftarUlang yang merupakan turunan dari JFrame
public class FormDaftarUlang extends JFrame {
    // Mendeklarasikan komponen GUI yang akan digunakan 
    private JLabel labelNama, labelTanggalLahir, labelNoPendaftaran, labelNoTelpon, labelAlamat, labelEmail; // Label untuk menampilkan teks
    private JTextField textNama, textTanggalLahir, textNoPendaftaran, textNoTelpon, textEmail; // TextField untuk input data
    private JTextArea textalamat; // TextArea untuk input alamat
    private JButton buttonSubmit; // Tombol untuk mengirim data

    // Membuat konstruktor FormDaftarUlang
    public FormDaftarUlang() {
        setTitle("Form Daftar Ulang Mahasiswa"); // Mengatur judul tampilan
        setSize(450, 500); // Mengatur ukuran tampilan
        setLayout(null); // Mengatur layout menjadi null agar bisa mengatur posisi komponen secara manual
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Mengatur operasi penutupan tampilan

        // Membuat tampilan dengan nama "Nama Lengkap" yang berfungsi untuk mengisi nama lengkap
        labelNama = new JLabel("Nama Lengkap");
        labelNama.setBounds(20, 30, 120, 25); // Mengatur posisi dan ukuran label
        add(labelNama); // Menambahkan label ke tampilan
        // Membuat text field untuk dapat mengisi nama lengkap
        textNama = new JTextField();
        textNama.setBounds(160, 30, 250, 25);
        add(textNama);

        // Membuat tampilan dengan nama "Tanggal Lahir" yang berfungsi untuk mengisi tanggal lahir
        labelTanggalLahir = new JLabel("Tanggal Lahir");
        labelTanggalLahir.setBounds(20, 70, 120, 25);
        add(labelTanggalLahir);

        textTanggalLahir = new JTextField();
        textTanggalLahir.setBounds(160, 70, 250, 25);
        add(textTanggalLahir);

        // Membuat tampilan dengan nama "No. Pendaftaran" yang berfungsi untuk mengisi nomor pendaftaran
        labelNoPendaftaran = new JLabel("No. Pendaftaran");
        labelNoPendaftaran.setBounds(20, 110, 120, 25);
        add(labelNoPendaftaran);

        textNoPendaftaran = new JTextField();
        textNoPendaftaran.setBounds(160, 110, 250, 25);
        add(textNoPendaftaran);

        // Membuat tampilan dengan nama "No. Telepon" yang berfungsi untuk mengisi nomor telepon
        labelNoTelpon = new JLabel("No. Telepon");
        labelNoTelpon.setBounds(20, 150, 120, 25);
        add(labelNoTelpon);

        textNoTelpon = new JTextField();
        textNoTelpon.setBounds(160, 150, 250, 25);
        add(textNoTelpon);
        
        // Membuat tampilan dengan nama "Alamat" yang berfungsi untuk mengisi alamat
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(20, 190, 120, 25);
        add(labelAlamat);

        textalamat = new JTextArea();
        JScrollPane inputAlamat = new JScrollPane(textalamat);
        inputAlamat.setBounds(160, 190, 250, 75);
        add(inputAlamat);

        // Membuat tampilan dengan nama "Email" yang berfungsi untuk mengisi email
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(20, 280, 120, 25);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(160, 280, 250, 25);
        add(textEmail);
        
        // Membuat tombol "SUBMIT" yang berfungsi untuk mengirim data
        buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.setBounds(310, 320, 100, 30);
        buttonSubmit.setBackground(Color.BLUE); // Mengatur warna latar belakang tombol
        buttonSubmit.setForeground(Color.WHITE); // Mengatur warna teks tombol
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 14)); // Mengatur font tombol
        add(buttonSubmit); // Menambahkan tombol ke tampilan

        // Menambahkan ActionListener pada tombol "SUBMIT"
        buttonSubmit.addActionListener(new ActionListener() {

            // Mengimplementasikan method actionPerformed untuk menangani event saat tombol ditekan
            @Override 
            public void actionPerformed(ActionEvent e) {
                // Memeriksa apakah semua kolom telah diisi
                if (FormLengkap()) { 
                    int konfirmasi = JOptionPane.showConfirmDialog(null, // Menampilkan dialog konfirmasi
                            "Apakah anda yakin data yang Anda isi sudah benar??", // Menampilkan pesan konfirmasi
                            "Konfirmasi", // Judul dialog
                            JOptionPane.OK_CANCEL_OPTION); // Menampilkan tombol OK dan Cancel

                    if (konfirmasi == JOptionPane.OK_OPTION) { // Jika pengguna menekan tombol OK
                        tampilkanData();// Menampilkan data yang telah diisi
                    }
                // Jika ada kolom yang belum diisi    
                } else { 
                    JOptionPane.showMessageDialog(null, // Menampilkan pesan peringatan
                            "Pastikan, semua kolom harus diisi!!", // Pesan peringatan
                            "Peringatan", // Judul dialog
                            JOptionPane.WARNING_MESSAGE); // Menampilkan ikon peringatan
                }
            }
        });
    }

    // Method untuk memeriksa apakah semua kolom telah diisi
    // Mengembalikan true jika semua kolom telah diisi, false jika ada yang kosong
    private boolean FormLengkap() {
        return !textNama.getText().trim().isEmpty() &&
            !textTanggalLahir.getText().trim().isEmpty() &&
            !textNoPendaftaran.getText().trim().isEmpty() &&
            !textNoTelpon.getText().trim().isEmpty() &&
            !textEmail.getText().trim().isEmpty() &&
            !textalamat.getText().trim().isEmpty();
    }

    // Method untuk menampilkan data yang telah diisi
    private void tampilkanData() {
        JFrame frameData = new JFrame("Data Mahasiswa Baru"); // Membuat objek tampilan baru untuk menampilkan data
        frameData.setSize(400, 350); // Mengatur ukuran jendela
        frameData.setLocationRelativeTo(null); // Mengatur posisi jendela di tengah layar
    
        JTextArea dataArea = new JTextArea(); // Membuat objek area teks untuk menampilkan data
        dataArea.setEditable(false); // Mengatur agar area teks tidak dapat diedit
        dataArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Mengatur font area teks
    
        // Mengatur warna latar belakang dan teks area teks dengan menggunakan Array 2 dimensi
        String[][] data = { // Array 2 dimensi untuk menyimpan data
            {"Nama Lengkap", textNama.getText()},
            {"Nama", textNama.getText()},
            {"Tanggal Lahir", textTanggalLahir.getText()},
            {"No. Pendaftaran", textNoPendaftaran.getText()},
            {"No. Telepon", textNoTelpon.getText()},
            {"Email", textEmail.getText()},
            {"Alamat", textalamat.getText()}
        };
    
        // Menggunakan StringBuilder untuk membangun string data yang akan ditampilkan
        StringBuilder sb = new StringBuilder();
        sb.append("Data Mahasiswa Baru:\n");
        for (String[] item : data) { // Mengulangi setiap item dalam array data
            sb.append(String.format("%-17s: %s\n", item[0], item[1])); // Mengatur format tampilan data
        }
    
        dataArea.setText(sb.toString()); // Mengatur teks area teks dengan data yang telah dibangun
        frameData.add(new JScrollPane(dataArea)); // Menambahkan area teks ke dalam jendela dengan scroll pane
        frameData.setVisible(true); // Menampilkan semua data
    } 
}