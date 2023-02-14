
//import library
import java.util.ArrayList;
import java.util.Scanner;

// class process berisi list dari object class Mhs yang
// digunakan untuk memodifikasi list tersebut seperti menambah data,
// mengubah data, melihat data, dan menampilkan data.
public class Process {
    // atribut private

    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;

    // atribut public
    public Mhs mahasiswa;

    // constructor
    public Process() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    // method untuk menambahkan data mahasiswa ke dalam lists
    public void tambah(ArrayList<Mhs> list) {
        Scanner sc = new Scanner(System.in);
        Mhs temp = new Mhs();
        int i = 0;
        int cek = 0;
        System.out.println("Masukkan data nim, nama, prodi, fakultas");
        try {
            nim = sc.next();
        } catch (Exception e) {
        }
        for (i = 0; i < list.size(); i++) {
            // mengecek apakah nim sudah ada di dalam list atau belum
            if (nim.equals(list.get(i).getNim())) {
                System.out.println("NIM sudah ada");
                cek = 1;
            }
        }
        // jika nim belum ada maka meminta masukkan lainnya
        if (cek == 0) {

            try {
                nama = sc.next();
            } catch (Exception e) {
            }

            try {
                prodi = sc.next();
            } catch (Exception e) {
            }
            try {
                fakultas = sc.next();
            } catch (Exception e) {
            }
            temp.setFakultas(fakultas);
            temp.setProdi(prodi);
            temp.setNim(nim);
            temp.setNama(nama);
            list.add(temp);
        }
    }

    // method untuk menghapus data pada arraylist
    public void hapus(ArrayList<Mhs> list, String nim) {
        int i = 0;
        int cek = 0; // boolean untuk menentukan apakah nim ada pada list atau tidak
        // for loop untuk mengecek list satu per satu
        for (i = 0; i < list.size(); i++) {
            // jika ada maka data dihapus dan boolean menjadi true
            if (nim.equals(list.get(i).getNim())) {
                list.remove(i);
                cek = 1;
            }
        }
        if (cek == 0) {
            System.out.println("NIM tidak ditemukan");
        }
    }

    // method untuk mengubah data pada list
    public void ubah(ArrayList<Mhs> list, String nim2) {
        Scanner sc = new Scanner(System.in);
        Mhs temp = new Mhs();
        int i = 0;
        int cek = 0; // boolean untuk menentukan apakah nim ada pada list atau tidak
        for (i = 0; i < list.size(); i++) {
            // jika ada maka meminta data lagi dan boolean menjadi true
            if (nim2.equals(list.get(i).getNim())) {
                System.out.println("Masukkan data nama, prodi, fakultas");
                nama = sc.next();
                temp.setNama(nama);
                prodi = sc.next();
                temp.setProdi(prodi);
                fakultas = sc.next();
                temp.setFakultas(fakultas);
                temp.setNim(nim2);
                list.set(i, temp);
                cek = 1;
            }
        }
        if (cek == 0) {
            System.out.println("NIM tidak ditemukan");
        }
    }

    // method untuk menampiilkan data mahasiswa pada list
    public void tampil(ArrayList<Mhs> list) {
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            System.out.println(
                    Integer.toString(i + 1) + ". " + list.get(i).getNim() + " | " + list.get(i).getNama()
                            + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas());
        }
    }

}
