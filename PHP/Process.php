<?php
require('Mhs.php');

// class prcess berisi list dari object class Mhs yang
// digunakan untuk memodifikasi list tersebut seperti menambah data,
// mengubah data, melihat data, dan menampilkan data.
class Process
{
    //constructor
    public function __construct()
    {
    }

    //method untuk menambah data
    public function tambah(Mhs $mahasiswa, $nim, $nama, $prodi, $fakultas, $foto)
    {
        $mahasiswa->setnim($nim);
        $mahasiswa->setnama($nama);
        $mahasiswa->setprodi($prodi);
        $mahasiswa->setfakultas($fakultas);
        $mahasiswa->setfoto($foto);
    }
    //method untuk mengubah data
    public function ubah(Mhs $mahasiswa, $nama, $prodi, $fakultas)
    {
        $mahasiswa->setnama($nama);
        $mahasiswa->setprodi($prodi);
        $mahasiswa->setfakultas($fakultas);
    }
    //method untuk menghapus data
    public function hapus(&$mahasiswa, $nim, $jumlah)
    {
        $i = 0;
        for ($i = 0; $i < $jumlah; $i++) {
            if ($mahasiswa[$i]->getnim() == $nim) {
                unset($mahasiswa[$i]);
            }
        }
    }
    //method untuk menampilkan data
    public function tampil($mahasiswa)
    {
        echo "<table border = '1'>";
        echo "<tr>" .
            "<th>No</th>" .
            "<th>NIM</th>" .
            "<th>Nama</th>" .
            "<th>Prodi</th>" .
            "<th>Fakultas</th>" .
            "<th>Foto</th>" .
            "</tr>";

        $i = 1;
        foreach ($mahasiswa as $orang) {
            echo "<tr>" .
                "<th>" . $i . "</th>" .
                "<th>" . $orang->getnim() . "</th>" .
                "<th>" . $orang->getnama() . "</th>" .
                "<th>" . $orang->getprodi() . "</th>" .
                "<th>" . $orang->getfakultas() . "</th>" .
                "<th>" . "<img src='" . $orang->getfoto() . "'style='width: 50px;'>" . "</th>" .
                "</tr>";
            $i++;
        }
        echo "</table>";
    }
    //destructor
    function __destruct()
    {
    }
}
