package com.eri.modul1;

public class Objek {
    public static void main(String[] args) {
        //deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Erie");
        mahasiswaTanpa.setNim(19104021);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t: "+mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 19104021);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: "+mahasiswa.getNama());
        System.out.println("Nim\t: " + mahasiswa.getNim()
        );
    }
}
