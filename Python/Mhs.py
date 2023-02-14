# delkarasi class
# class mahasiswa berisi data mahasiswa berupa nama, nim, prodi, dan fakultas
class Mhs:
    # private
    __nama = ""
    __nim = ""
    __prodi = ""
    __fakultas = ""

    # public
    # constructor
    def __init__(self, nama="", nim="", prodi="", fakultas=""):
        self.__nama = nama
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas

    # setter dan getter
    def get_nama(self):
        return self.__nama

    def get_nim(self):
        return self.__nim

    def get_prodi(self):
        return self.__prodi

    def get_fakultas(self):
        return self.__fakultas

    def set_nama(self, nama):
        self.__nama = nama

    def set_prodi(self, prodi):
        self.__prodi = prodi

    def set_nim(self, nim):
        self.__nim = nim

    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas
