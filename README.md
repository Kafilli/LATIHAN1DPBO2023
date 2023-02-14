# LATIHAN 1 DPBO 2023

## Janji
 Saya Muhammad Fikri Kafilli NIM 2107264 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

## Desain Program
Desain Program dibagi menjadi 2 class 
1. Mhs (Mahasiswa)

  Terdapat 4 atribut pada kelas Mhs dan juga method Setter dan Getter untuk tiap atribut
  * Nama (`string`) -> Nama Mahasiswa
  * NIM (`string`) -> NIM Mahasiswa   
  * Prodi (`string`) -> Program Studi Mahasiswa   
  * Fakultas (`string`) -> Fakultas Mahasiswa  
  
2. Process

  Terdapat 4 method pada kelas Process
  * Tambah -> Menambah Data 
  * Ubah -> Mengubah Data
  * Hapus -> Menghapus Data
  * Tampil -> Menampilkan Data
 
 ## Alur Program
 
 Terdapat 4 bahasa yang digunakan untuk membuat program yaitu Python, C++, Java, dan PHP. Namun, untuk PHP tidak ada input dari user. Program memiliki 5 perintah menu berupa angka yaitu :
 * angka (1) untuk menjalankan perintah **Tambah**. Program akan meminta user untuk memasukkan data mahasiswa yaitu NIM, nama, prodi, dan fakultas. Namun, jika NIM sudah ada pada list data maka proses input data akan gagal dan user diminta memasukkan perintah menu kembali.
 * angka (2) untuk menjalankan perinitah **ubah**. program akan meminta user untuk memasukkan NIM dari data mahasiswa yang mau diubah. Kemudian program akan mengecek apakah NIM tersebut tersedia pada list atau tidak. Jika ada maka program akan meminta update dari nama, prodi, dan fakultas mahasiswa. Namun, jika NIM tidak ditemukan maka user akan diminta untuk memasukkan perintah menu.
 * angka (3) untuk menjalankan perintah **hapus**. program akan meminta user untuk memasukkan NIM dari data mahasiswa yang mau dihapus. Kemudian program akan mengecek apakah NIM tersebut tersedia pada list atau tidak. Jika ada maka program akan Menghapus data mahasiswa dari list. Namun, jika NIM tidak ditemukan maka user akan diminta untuk memasukkan perintah menu.
 * angka (4) untuk menjalankan perintah **Tampil**. Program akan menampilkan semua data mahasiswa yang ada di dalam list.
 * angka (5) untuk keluar dari program.
 
 ## Dokumentasi
 * Python
 
 User memilih perintah **Tambah**
 
 ![image](https://user-images.githubusercontent.com/100756191/218762999-7aa3c87f-550e-43dd-a787-03f8c3f66180.png)
 
 User memilih perintah **Ubah**
 
 ![image](https://user-images.githubusercontent.com/100756191/218762720-797dc113-7ca5-4791-9e44-367d27e6f8fe.png)
 
 User memilih perintah **Hapus**
 
 ![image](https://user-images.githubusercontent.com/100756191/218763306-e283fb5b-c0e7-4765-ae9e-0f7ccadfb507.png)
 
* PHP

![ss](https://user-images.githubusercontent.com/100756191/218763746-9295281d-c7ea-4515-85f5-20049dde4c16.png)

