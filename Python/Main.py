# import class dari file
from Mhs import Mhs
from Process import Process

mahasiswa = []  # list untuk menampun objek Mhs
proses = Process(mahasiswa)  # instance untuk proses

# meminta masukkan pilihan
print("======================================")
print("1: Masukkan Data\n2: Ubah Data\n3: Hapus Data\n4: Tampilkan Data\n5: Keluar")
print("======================================")
pilih = int(input())
while pilih != 5:
    if pilih == 1:  # menambah data
        proses.tambah(mahasiswa)
    if pilih == 2:  # mengubah data
        print("Masukkan NIM yang mau diubah")
        nim = input()
        proses.ubah(mahasiswa, nim)
    if pilih == 3:  # menghapus data
        print("Masukkan NIM yang mau dihapus")
        nim = input()
        proses.hapus(mahasiswa, nim)
    if pilih == 4:  # menampilkan data
        proses.tampil(mahasiswa)
    print("======================================")
    pilih = int(input())
