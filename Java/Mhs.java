
//import library
import java.util.ArrayList;
import java.util.Scanner;

// class mahasiswa berisi data mahasiswa berupa nama, nim, prodi, dan fakultas
public class Mhs {
    // atribut private
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;

    // atribut public

    // Constructor untuk mengubah value menjadi default
    public Mhs() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    // public method
    // setter dan getter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

}