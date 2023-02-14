// include file dan library
#include <bits/stdc++.h>
#include "Process.cpp"

using namespace std;

int main()
{
    Process proses; // inisialisasi object process
    // inisialisasi variabel untuk masukkan
    string nama;
    string nim;
    string prodi;
    string fakultas;
    // inisialisasi variabel untuk input user
    int pilih;
    list<Mhs> llist; // inisialisasi list untuk menampung object mahasiswa
    // meminta masukkan
    cout << "======================================\n";
    cout << "1: Masukkan Data\n2: Ubah Data\n3: Hapus Data\n4: Tampilkan Data\n5: Keluar\n";
    // perulangan selama pilihan user bukan angka 5
    do
    {
        // meminta masukkan user
        cout << "======================================\n";
        cin >> pilih;
        switch (pilih)
        {
        case 1: // user memilih menambahkan data
        {
            proses.tambah(&llist);
            break;
        }
        case 2: // user memiliih untuk mengubah data
        {
            cout << "Pilih NIM dari data yang mau diubah\n";
            cin >> nim;
            proses.ubah(nim, &llist);
            break;
        }
        case 3: // user memilih untuk menghapus data
        {
            cout << "Pilih NIM dari data yang mau dihapus\n";
            cin >> nim;
            proses.hapus(nim, &llist);
            break;
        }
        case 4: // user memilih untuk menampilkan data
        {
            proses.tampil(llist);
            break;
        }
        default:
            break;
        }

    } while (pilih != 5);
    return 0;
}