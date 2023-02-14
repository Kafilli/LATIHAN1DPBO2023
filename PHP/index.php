<?php

require('Process.php');

//deklarasi object Mhs
$mahasiswa[0] = new Mhs();
$mahasiswa[1] = new Mhs();
$mahasiswa[2] = new Mhs();

$proses = new Process(); //instansi objek process

//menambah data
$proses->tambah($mahasiswa[0], "2107264", "Fikri", "Ilkom", "MIPA", "./img.png");
$proses->tambah($mahasiswa[1], "2207264", "Muhammad", "Ilkom", "MIPA", "./img.png");
$proses->tambah($mahasiswa[2], "2307264", "Kafilli", "Ilkom", "MIPA", "./img.png");

//menampilkan data
echo "Data Awal";
$proses->tampil($mahasiswa);

//mengubah data
$proses->ubah($mahasiswa[0], "Aceng", "Pilkom", "FPOK");
//menampilkan data
echo "</br>Data Setelah Diubah";
$proses->tampil($mahasiswa);

//menghapus data
$proses->hapus($mahasiswa, "2107264", 3);
//menampilkan data
echo "</br>Data Setelah Dihapus";
$proses->tampil($mahasiswa);
