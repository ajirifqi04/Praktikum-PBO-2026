# Mini Project 1 PBO

- Nama: Aji Rifqi Suryana

- NIM: 2509116054

- Kelas: B

- Praktikum: Pemrograman Berorientasi Objek

# SISTEM MANAJEMEN PENGELOLAAN PERIKANAN



Mini project Praktikum Pemrograman Berorientasi Objek (PBO). Program CRUD berbasis Java untuk mengelola data sumber daya perikanan.

## Latar Belakang

Data perikanan seperti jenis ikan, lokasi penangkapan, jumlah stok, dan kondisi hasil tangkapan biasanya masih dicatat secara manual. Cara ini rawan salah catat dan sulit dipakai untuk memantau ketersediaan sumber daya secara cepat.

Program ini dibuat sebagai implementasi konsep Pemrograman Berorientasi Objek (PBO) menggunakan Java, dengan tema Sistem Manajemen Pengelolaan Perikanan. Konsep class, object, constructor, dan ArrayList dipakai untuk mengelola data lewat menu CRUD (tambah, tampilkan, ubah, hapus) berbasis console.

## Deskripsi Singkat Program

Program berjalan di console dan mengelola data perikanan: jenis ikan, lokasi penangkapan, hasil tangkapan, dan stok. Ada 4 fungsi utama yang bisa diakses lewat satu menu: tambah data, tampilkan data, ubah data, dan hapus data.

## Struktur Class

- `Main` - entry point, berisi main() dan logika menu
- `Ikan` - data jenis ikan (idIkan, namaIkan, jenisIkan)
- `LokasiPenangkapan` - data lokasi penangkapan (idLokasi, namaLokasi, wilayah)
- `HasilPenangkapan` - data hasil tangkapan (idHasil, tanggal, kondisi)
- `Stok` - data stok ikan (idStok, jumlahStok, satuan)

Keempat class entitas dihubungkan lewat ID yang sama di setiap transaksi data. Datanya disimpan di ArrayList yang terpisah, tapi tetap bisa dicari dan ditampilkan sebagai satu kesatuan berdasarkan ID tersebut.

## Penjelasan Alur Program

Program dimulai dari main() di class MINPRO1. Empat ArrayList dibuat untuk menampung objek Ikan, LokasiPenangkapan, HasilPenangkapan, dan Stok. Selanjutnya program masuk ke perulangan while yang terus menampilkan menu selama user belum memilih Keluar (pilihan 5). Pilihan menu diproses lewat switch.

### 1. Tambah Data Perikanan (Menu 1)
User memasukkan satu ID yang dipakai untuk satu transaksi data, misalnya I001. Setelah itu user mengisi data ikan (nama, jenis), lokasi penangkapan (nama lokasi, wilayah), hasil tangkapan (tanggal, kondisi), dan stok (jumlah, satuan) satu per satu. Dari input ini dibuat satu objek baru untuk tiap class lewat constructor, lalu dimasukkan ke ArrayList masing-masing. Terakhir program menampilkan pesan bahwa data berhasil ditambahkan.

### 2. Tampilkan Data Perikanan (Menu 2)
Program melakukan perulangan for ke daftar hasil tangkapan yang tersimpan. Untuk tiap data, dicari data terkait (ikan, lokasi, stok) di ArrayList lain yang punya ID sama, lalu ditampilkan sebagai satu kesatuan: ID, nama dan jenis ikan, lokasi dan wilayah, tanggal, kondisi, serta jumlah stok.

### 3. Ubah Data Perikanan (Menu 3)
User memasukkan ID data yang mau diubah. Program mencari posisi data tersebut di keempat ArrayList. Kalau ketemu, user mengisi data baru dan data lama diganti dengan objek baru berisi data terbaru. Kalau ID tidak ditemukan, program menampilkan pesan bahwa data tidak ada.

### 4. Hapus Data Perikanan (Menu 4)
User memasukkan ID data yang mau dihapus. Program mencari dan menghapus data dengan ID tersebut dari keempat ArrayList sekaligus, lalu menampilkan pesan berhasil atau pesan kalau ID tidak ditemukan.

### 5. Keluar (Menu 5)
Kondisi perulangan while diubah sehingga program berhenti. Program menampilkan pesan penutup sebelum selesai.

## Demo Program

### 1. Menu Utama
Tampilan awal aplikasi, menampilkan 5 pilihan menu.

<img width="236" height="153" alt="MENU AWAL" src="https://github.com/user-attachments/assets/1d464838-7438-48bd-a747-0a1c18eff1eb" />

### 2. Tambah Data Perikanan (Menu 1)
User memilih Menu 1, lalu input ID I001, data ikan, lokasi, hasil tangkapan, dan stok. Data tersimpan dan muncul konfirmasi berhasil.

<img width="237" height="344" alt="menu 1" src="https://github.com/user-attachments/assets/7e6636f7-f6f0-4c0b-88f0-ceba64505a1d" />

### 3. Tampilkan Data Perikanan (Menu 2)
User memilih Menu 2, program menampilkan seluruh data yang tersimpan, digabungkan berdasarkan ID.

<img width="333" height="391" alt="menu 2" src="https://github.com/user-attachments/assets/22d32132-87f1-44be-9716-1f14cbc6bdb9" />

### 4. Ubah Data Perikanan (Menu 3)
User memilih Menu 3, input ID data yang mau diubah, lalu mengisi data baru untuk menggantikan data lama.

<img width="247" height="175" alt="menu 3" src="https://github.com/user-attachments/assets/62f3a59a-6d4c-4b23-95fb-1c765c9d5d3a" />

### 5. Hapus Data Perikanan (Menu 4)
User memilih Menu 4, input ID data yang mau dihapus, data terkait terhapus dari seluruh ArrayList.

<img width="244" height="322" alt="MENU 4" src="https://github.com/user-attachments/assets/af1caf9d-a36b-46fa-a9e7-4a6812c717ac" />

### 6. Keluar (Menu 5)
User memilih Menu 5, program menampilkan pesan penutup dan berhenti.

<img width="418" height="232" alt="MENU 5" src="https://github.com/user-attachments/assets/80b23179-0a9e-4811-9041-aac788fd612c" />
