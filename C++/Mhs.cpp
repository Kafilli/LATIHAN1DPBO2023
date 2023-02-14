// import library
#include <iostream>
#include <string>
#include <list>

// standard namespace
using namespace std;

// class mahasiswa berisi data mahasiswa berupa nama, nim, prodi, dan fakultas
class Mhs
{
    // atribut private
private:
    string nama;
    string nim;
    string prodi;
    string fakultas;
    // atribut public
public:
    // Constructor untuk mengubah value menjadi default
    Mhs()
    {
        this->nama = "";
        this->nim = "";
        this->prodi = "";
        this->fakultas = "";
    }
    // Public method
    // setter dan getter
    string get_nama()
    {
        return this->nama;
    }
    string get_nim()
    {
        return this->nim;
    }
    string get_prodi()
    {
        return this->prodi;
    }
    string get_fakultas()
    {
        return this->fakultas;
    }

    void set_nama(string nama)
    {
        this->nama = nama;
    }
    void set_nim(string nim)
    {
        this->nim = nim;
    }
    void set_prodi(string prodi)
    {
        this->prodi = prodi;
    }
    void set_fakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }
    // destructor
    ~Mhs()
    {
    }
};