// import file
#include "Mhs.cpp"
// standard namespace
using namespace std;

// class prcess berisi list dari object class Mhs yang
// digunakan untuk memodifikasi list tersebut seperti menambah data,
// mengubah data, melihat data, dan menampilkan data.
class Process
{
    // atribut private
private:
    string nama;
    string nim;
    string prodi;
    string fakultas;

    // atribut public
public:
    // constructor
    Process()
    {
        this->nama = "";
        this->nim = "";
        this->prodi = "";
        this->fakultas = "";
    }
    // public method

    // method untuk menghapus data pada list
    void hapus(string nim, list<Mhs> *llist)
    {
        int cek = 0; // boolean untuk menentukan apakah nim ada pada list atau tidak
        // for loop untuk mengecek list satu per satu
        for (list<Mhs>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
        {
            // jika ada maka data dihapus dan boolean menjadi true
            if (it->get_nim() == nim)
            {
                it = (*llist).erase(it);
                cek = 1;
            }
        }
        if (cek == 0)
        {
            cout << "NIM tidak ditemukan\n";
        }
    }
    // method untuk mengubah data pada list
    void ubah(string nim, list<Mhs> *llist)
    {
        int cek = 0; // boolean untuk menentukan apakah nim ada pada list atau tidak
        // for loop untuk mengecek list satu per satu
        for (list<Mhs>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
        {
            // jika ada maka meminta data lagi dan boolean menjadi true
            if (it->get_nim() == nim)
            {
                cek = 1;
                cout << "Masukkan Nama, Prodi, dan Fakultas untuk diubah\n";
                cin >> nama >> prodi >> fakultas;
                it->set_nama(nama);
                it->set_prodi(prodi);
                it->set_fakultas(fakultas);
            }
        }
        if (cek == 0)
        {
            cout << "NIM tidak ditemukan\n";
        }
    }

    // method untuk menampiilkan data mahasiswa pada list
    void tampil(list<Mhs> llist)
    {
        int i = 0;
        for (list<Mhs>::iterator it = llist.begin(); it != llist.end(); it++)
        {
            cout << (i + 1) << ". " << it->get_nim() << " | " << it->get_nama() << " | " << it->get_prodi() << " | " << it->get_fakultas() << "\n";
            i++;
        }
    }

    // method untuk menambahkan data mahasiswa ke dalam lists
    void tambah(list<Mhs> *llist)
    {
        Mhs temp;
        cout << "Masukkan NIM, Nama, Prodi, dan Fakultas\n";
        cin >> this->nim;
        int cek = 0; // boolean
        // mengecek apakah nim sudah ada di dalam list atau belum
        if ((*llist).empty() == 0)
        {
            for (list<Mhs>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
            {
                if (it->get_nim() == this->nim)
                {
                    cek = 1;
                    cout << "NIM sudah ada\n";
                }
            }
        }

        if (cek == 0)
        {
            cin >> this->nama >> this->prodi >> this->fakultas;
            temp.set_nim(this->nim);
            temp.set_nama(this->nama);
            temp.set_prodi(this->prodi);
            temp.set_fakultas(this->fakultas);
            (*llist).push_back(temp);
        }
    }
    // destructor
    ~Process()
    {
    }
};