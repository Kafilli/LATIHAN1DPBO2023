# import file
from Mhs import Mhs
# // class prcess berisi list dari object class Mhs yang
# // digunakan untuk memodifikasi list tersebut seperti menambah data,
# // mengubah data, melihat data, dan menampilkan data.


class Process:
    # constructor
    def __init__(self, mahasiswa):
        self.__data = mahasiswa

    # method untuk menambahkan data mahasiswa ke dalam lists
    def tambah(self, mahasiswa):
        temp = Mhs()  # object tampungan
        print("Masukkan NIM, Nama, Prodi, dan Fakultas")
        cek = 0  # boolean
        temp.set_nim(input())
        for i in mahasiswa:  # mengecek apakah nim sudah atau atau belum
            if i.get_nim() == temp.get_nim():
                cek = 1
                print("NIM sudah ada")
        if cek == 0:
            temp.set_nama(input())
            temp.set_prodi(input())
            temp.set_fakultas(input())
            mahasiswa.append(temp)
            print("Data Berhasil Ditambah")
    # method untuk menampilkan data mahasiswa

    def tampil(self, mahasiswa):
        j = 1
        print("Berikut Data Mahasiswa")
        for i in mahasiswa:
            print(j, ". ", i.get_nim(), " | ", i.get_nama(), " | ",
                  i.get_prodi(), " | ", i.get_fakultas())
            j += 1

    # method untuk mengubah data mahasiswa
    def ubah(self, mahasiswa, nim):
        temp = Mhs()
        cek = 0
        for i in mahasiswa:  # mengecek apakah nim ada atau tidak
            if i.get_nim() == nim:
                print("Masukkan nama, prodi, dan fakultas")
                i.set_nama(input())
                i.set_prodi(input())
                i.set_fakultas(input())
                cek = 1
                print("Data berhasil diubah")
        if cek == 0:  # jika nim tidak ada
            print("NIM tidak ditemukan")

    # method untuk menghapus data
    def hapus(self, mahasiswa, nim):
        cek = 0
        for i in mahasiswa:  # mengecek untuk setiap data
            if i.get_nim() == nim:  # jika nim ktemu
                mahasiswa.remove(i)  # meremove data beradasarkan index
                print("Data Berhasil dihapus")
                cek = 1
        if cek == 0:
            print("NIM tidak ditemukan")
