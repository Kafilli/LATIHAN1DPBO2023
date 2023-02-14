
// import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mhs mahasiswa = new Mhs();// inisialisasi object Mhs
        Process proses = new Process(); // inisialisasi object process
        // variabel untuk inputtan user
        int pilih = 0;
        String nama = "";
        String nim = "";
        String prodi = "";
        String fakultas = "";

        ArrayList<Mhs> list = new ArrayList<>();// deklarasi array list untuk menampung list object
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("======================================\n" + "1: Masukkan Data" + '\n' + "2: Ubah Data"
                + '\n' + "3: Hapus Data" + '\n'
                + "4: Tampilkan Data" + '\n' + "5: Keluar");
        // perulangan untuk proses
        do {
            System.out.print("======================================\n");
            try {
                pilih = sc.nextInt();
            } catch (Exception e) {
                System.out.println("The input is not an integer!");
            }
            switch (pilih) {
                case 1:// menambah data
                    proses.tambah(list);
                    break;
                case 2:// mengubah data
                    System.out.println("Pilih nim yang mau diubah");
                    nim = sc.next();
                    proses.ubah(list, nim);
                    break;
                case 3:// menghapus data
                    System.out.println("Pilih nim yang mau dihapus");
                    nim = sc.next();
                    proses.hapus(list, nim);
                    break;
                case 4:// menampilkan data
                    proses.tampil(list);
                    break;
                default:
                    break;
            }
        } while (pilih != 5);

        sc.close();// menutup scanner
    }
}