package com.mycompany.minpro1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Ikan> daftarIkan = new ArrayList<>();
        ArrayList<LokasiPenangkapan> daftarLokasi = new ArrayList<>();
        ArrayList<HasilPenangkapan> daftarHasil = new ArrayList<>();
        ArrayList<Stok> daftarStok = new ArrayList<>();

        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n========================================");
            System.out.println(" SISTEM MANAJEMEN PENGELOLAAN PERIKANAN");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Perikanan");
            System.out.println("2. Tampilkan Data Perikanan");
            System.out.println("3. Ubah Data Perikanan");
            System.out.println("4. Hapus Data Perikanan");
            System.out.println("5. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            
            input.nextLine(); 

            switch (pilihan) {

                case 1: {
                    // ===== CREATE =====
                    System.out.println("\n=== TAMBAH DATA PERIKANAN ===");

                    System.out.print("ID Data (contoh: P001) : ");
                    String id = input.nextLine();

                    System.out.println("--- Data Ikan ---");
                    System.out.print("Nama Ikan  : ");
                    String namaIkan = input.nextLine();
                    System.out.print("Jenis Ikan : ");
                    String jenisIkan = input.nextLine();

                    System.out.println("--- Data Lokasi Penangkapan ---");
                    System.out.print("Nama Lokasi : ");
                    String namaLokasi = input.nextLine();
                    System.out.print("Wilayah     : ");
                    String wilayah = input.nextLine();

                    System.out.println("--- Data Hasil Penangkapan ---");
                    System.out.print("Tanggal (dd-mm-yyyy)       : ");
                    String tanggal = input.nextLine();
                    System.out.print("Kondisi Ikan (Segar/Rusak) : ");
                    String kondisi = input.nextLine();

                    System.out.println("--- Data Stok ---");
                    System.out.print("Jumlah Stok : ");
                    int jumlahStok = input.nextInt();
                    input.nextLine();
                    System.out.print("Satuan (kg/ekor) : ");
                    String satuan = input.nextLine();

                    Ikan ikanBaru = new Ikan(id, namaIkan, jenisIkan);
                    LokasiPenangkapan lokasiBaru = new LokasiPenangkapan(id, namaLokasi, wilayah);
                    HasilPenangkapan hasilBaru = new HasilPenangkapan(id, tanggal, kondisi);
                    Stok stokBaru = new Stok(id, jumlahStok, satuan);

                    daftarIkan.add(ikanBaru);
                    daftarLokasi.add(lokasiBaru);
                    daftarHasil.add(hasilBaru);
                    daftarStok.add(stokBaru);

                    System.out.println("Data perikanan berhasil ditambahkan.");
                    break;
                }

                case 2: {
                    // ===== READ =====
                    System.out.println("\n=== DATA PERIKANAN ===");

                    if (daftarHasil.size() == 0) {
                        System.out.println("Belum ada data.");
                        break;
                    }

                    for (int i = 0; i < daftarHasil.size(); i++) {
                        HasilPenangkapan hasil = daftarHasil.get(i);
                        String id = hasil.idHasil;

                        Ikan ikan = null;
                        for (int j = 0; j < daftarIkan.size(); j++) {
                            if (daftarIkan.get(j).idIkan.equals(id)) {
                                ikan = daftarIkan.get(j);
                            }
                        }

                        LokasiPenangkapan lokasi = null;
                        for (int j = 0; j < daftarLokasi.size(); j++) {
                            if (daftarLokasi.get(j).idLokasi.equals(id)) {
                                lokasi = daftarLokasi.get(j);
                            }
                        }

                        Stok stok = null;
                        for (int j = 0; j < daftarStok.size(); j++) {
                            if (daftarStok.get(j).idStok.equals(id)) {
                                stok = daftarStok.get(j);
                            }
                        }

                        System.out.println("----------------------------------");
                        System.out.println("ID              : " + id);
                        if (ikan != null) {
                            System.out.println("Nama Ikan       : " + ikan.namaIkan);
                            System.out.println("Jenis Ikan      : " + ikan.jenisIkan);
                        }
                        if (lokasi != null) {
                            System.out.println("Lokasi          : " + lokasi.namaLokasi + " (" + lokasi.wilayah + ")");
                        }
                        System.out.println("Tanggal         : " + hasil.tanggal);
                        System.out.println("Kondisi         : " + hasil.kondisi);
                        if (stok != null) {
                            System.out.println("Jumlah Stok     : " + stok.jumlahStok + " " + stok.satuan);
                        }
                    }
                    break;
                }

                case 3: {
                    // ===== UPDATE =====
                    System.out.println("\n=== UBAH DATA PERIKANAN ===");
                    System.out.print("Masukkan ID Data yang ingin diubah: ");
                    String id = input.nextLine();


                    int indexIkan = -1;
                    for (int i = 0; i < daftarIkan.size(); i++) {
                        if (daftarIkan.get(i).idIkan.equals(id)) {
                            indexIkan = i;
                        }
                    }

                    int indexLokasi = -1;
                    for (int i = 0; i < daftarLokasi.size(); i++) {
                        if (daftarLokasi.get(i).idLokasi.equals(id)) {
                            indexLokasi = i;
                        }
                    }

                    int indexHasil = -1;
                    for (int i = 0; i < daftarHasil.size(); i++) {
                        if (daftarHasil.get(i).idHasil.equals(id)) {
                            indexHasil = i;
                        }
                    }

                    int indexStok = -1;
                    for (int i = 0; i < daftarStok.size(); i++) {
                        if (daftarStok.get(i).idStok.equals(id)) {
                            indexStok = i;
                        }
                    }

                    if (indexIkan == -1 || indexLokasi == -1 || indexHasil == -1 || indexStok == -1) {
                        System.out.println("Data dengan ID tersebut tidak ditemukan.");
                        break;
                    }

                    System.out.print("Nama Ikan Baru  : ");
                    String namaIkanBaru = input.nextLine();
                    System.out.print("Jenis Ikan Baru : ");
                    String jenisIkanBaru = input.nextLine();

                    System.out.print("Nama Lokasi Baru : ");
                    String namaLokasiBaru = input.nextLine();
                    System.out.print("Wilayah Baru     : ");
                    String wilayahBaru = input.nextLine();

                    System.out.print("Tanggal Baru : ");
                    String tanggalBaru = input.nextLine();
                    System.out.print("Kondisi Baru : ");
                    String kondisiBaru = input.nextLine();

                    System.out.print("Jumlah Stok Baru : ");
                    int jumlahStokBaru = input.nextInt();
                    input.nextLine();
                    System.out.print("Satuan Baru : ");
                    String satuanBaru = input.nextLine();

                    daftarIkan.set(indexIkan, new Ikan(id, namaIkanBaru, jenisIkanBaru));
                    daftarLokasi.set(indexLokasi, new LokasiPenangkapan(id, namaLokasiBaru, wilayahBaru));
                    daftarHasil.set(indexHasil, new HasilPenangkapan(id, tanggalBaru, kondisiBaru));
                    daftarStok.set(indexStok, new Stok(id, jumlahStokBaru, satuanBaru));

                    System.out.println("Data perikanan berhasil diubah.");
                    break;
                }

                case 4: {
                    // ===== DELETE =====
                    System.out.println("\n=== HAPUS DATA PERIKANAN ===");
                    System.out.print("Masukkan ID Data yang ingin dihapus: ");
                    String id = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < daftarHasil.size(); i++) {
                        if (daftarHasil.get(i).idHasil.equals(id)) {
                            daftarHasil.remove(i);
                            ditemukan = true;
                            break;
                        }
                    }

                    for (int i = 0; i < daftarIkan.size(); i++) {
                        if (daftarIkan.get(i).idIkan.equals(id)) {
                            daftarIkan.remove(i);
                            break;
                        }
                    }

                    for (int i = 0; i < daftarLokasi.size(); i++) {
                        if (daftarLokasi.get(i).idLokasi.equals(id)) {
                            daftarLokasi.remove(i);
                            break;
                        }
                    }

                    for (int i = 0; i < daftarStok.size(); i++) {
                        if (daftarStok.get(i).idStok.equals(id)) {
                            daftarStok.remove(i);
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Data perikanan berhasil dihapus.");
                    } else {
                        System.out.println("Data dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                }

                case 5:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }
        }
    }
}