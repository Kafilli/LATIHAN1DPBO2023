<?php

// class mahasiswa berisi data mahasiswa berupa nama, nim, prodi, dan fakultas
class Mhs
{
    //private
    private $nama = '';
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';
    private $foto = '';
    //public
    //construct
    public function __construct($nama = '', $nim = '', $prodi = '', $fakultas = '', $foto = '')
    {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->foto = $foto;
    }
    //method setter dan getter
    public function setnama($nama)
    {
        $this->nama = $nama;
    }
    public function setnim($nim)
    {
        $this->nim = $nim;
    }
    public function setprodi($prodi)
    {
        $this->prodi = $prodi;
    }
    public function setfakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }
    public function setfoto($foto)
    {
        $this->foto = $foto;
    }

    public function getnama()
    {
        return $this->nama;
    }
    public function getnim()
    {
        return $this->nim;
    }
    public function getprodi()
    {
        return $this->prodi;
    }
    public function getfakultas()
    {
        return $this->fakultas;
    }
    public function getfoto()
    {
        return $this->foto;
    }
    //destructor
    function __destruct()
    {
    }
}
