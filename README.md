# Mini Project 1 PBO

- Nama: Aji Rifqi Suryana

- NIM: 2509116054

- Kelas: B

- Praktikum: Pemrograman Berorientasi Objek

# SISTEM MANAJEMEN PENGELOLAAN PERIKANAN

## Latar Belakang

Pendataan sumber daya perikanan seperti jenis ikan, lokasi penangkapan, jumlah stok, dan kondisi hasil tangkapan sering kali masih dilakukan secara manual, sehingga rawan kesalahan dan menyulitkan pemantauan ketersediaan sumber daya secara akurat. Untuk mengatasi hal tersebut, dibuat program Sistem Manajemen Pengelolaan Perikanan menggunakan Java sebagai implementasi konsep Pemrograman Berorientasi Objek (PBO). Program ini menerapkan class, object, constructor, dan ArrayList untuk mengelola data perikanan melalui menu CRUD (tambah, tampilkan, ubah, hapus) berbasis console, sehingga proses pendataan menjadi lebih praktis dan terstruktur dibandingkan pencatatan manual.

## Deskripsi Program

Program ini adalah aplikasi console berbasis Java yang mengelola data perikanan, meliputi data jenis ikan, lokasi penangkapan, hasil tangkapan, dan stok. Program terdiri dari 5 class:

- Main - class entry point (main()), berisi seluruh logika menu

- Ikan - entitas data jenis ikan (ID, nama ikan, jenis ikan)

- LokasiPenangkapan - entitas data lokasi penangkapan (ID, nama lokasi, wilayah)

- HasilPenangkapan - entitas data hasil tangkapan (ID, tanggal, kondisi)

- Stok - entitas data stok ikan (ID, jumlah stok, satuan)

Program menyediakan 4 fungsi utama (CRUD): Tambah, Tampilkan, Ubah, dan Hapus data, yang seluruhnya diakses lewat satu menu utama.

## Penjelasan

#### 1. Tambah Data Perikanan (Menu 1)

- Pengguna memasukkan satu ID yang sama untuk satu transaksi data (contoh: P001).

- Pengguna memasukkan detail data ikan (nama, jenis), lokasi penangkapan (nama lokasi, wilayah), hasil tangkapan (tanggal, kondisi), dan stok (jumlah, satuan) secara berurutan.

- Dari input tersebut, sistem membuat satu objek baru dari masing-masing class (Ikan, LokasiPenangkapan, HasilPenangkapan, Stok) menggunakan constructor, lalu menambahkannya ke ArrayList masing-masing.

- Sistem menampilkan konfirmasi bahwa data berhasil ditambahkan.

#### 2. Tampilkan Data Perikanan (Menu 2)

- Sistem melakukan perulangan for terhadap daftar hasil tangkapan yang tersimpan.

- Untuk setiap data, sistem mencari data terkait (ikan, lokasi, stok) di ArrayList lain yang memiliki ID sama.

- Seluruh data ditampilkan sebagai satu kesatuan informasi: ID, nama & jenis ikan, lokasi & wilayah, tanggal, kondisi, serta jumlah stok.

#### 3. Ubah Data Perikanan (Menu 3)

- Pengguna diminta memasukkan ID data yang ingin diubah.

- Sistem mencari posisi (index) data tersebut di keempat ArrayList.

- Jika ditemukan, pengguna memasukkan data baru (nama ikan, jenis ikan, lokasi, wilayah, tanggal, kondisi, jumlah stok, satuan), lalu sistem menggantinya dengan objek baru berisi data terbaru.

- Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data tidak ada.

#### 4. Hapus Data Perikanan (Menu 4)

- Pengguna diminta memasukkan ID data yang ingin dihapus.

- Sistem mencari dan menghapus data dengan ID tersebut dari keempat ArrayList sekaligus.

- Sistem menampilkan konfirmasi keberhasilan atau pesan jika ID tidak ditemukan.

#### 5. Keluar (Menu 5)

- Mengubah kondisi perulangan while sehingga program berhenti.

- Sistem menampilkan pesan penutup sebelum program selesai.

## Alur Program

#### 1. Menu Utama

Tampilan awal aplikasi Sistem Manajemen Pengelolaan Perikanan, menampilkan 5 pilihan menu yang dapat dipilih pengguna.

<img width="236" height="153" alt="MENU AWAL" src="https://github.com/user-attachments/assets/c0ecd7e6-c680-488f-b3bb-8f1f93c22d02" />

#### 2. Tambah Data Perikanan (Menu 1)

Pengguna memilih Menu 1, lalu menginput ID, data ikan, lokasi, hasil tangkapan, dan stok secara berurutan. Setelah semua data diisi, sistem menyimpan data dan menampilkan konfirmasi keberhasilan.

<img width="237" height="344" alt="menu 1" src="https://github.com/user-attachments/assets/c6c8f1f1-ab7f-46a3-b3d4-361572724a1e" />

#### 3. Tampilkan Data Perikanan (Menu 2)

Pengguna memilih Menu 2, lalu sistem menampilkan seluruh data perikanan yang tersimpan, mencakup data ikan, lokasi, hasil tangkapan, dan stok yang sudah digabungkan berdasarkan ID.

<img width="333" height="391" alt="menu 2" src="https://github.com/user-attachments/assets/3dfe82ab-88e6-4f6d-bd9b-d116ec8a7094" />

#### 4. Ubah Data Perikanan (Menu 3)

Pengguna memilih Menu 3, lalu menginput ID data yang ingin diubah. Sistem menampilkan form input data baru, dan setelah diisi, data lama digantikan dengan data terbaru.

<img width="247" height="175" alt="menu 3" src="https://github.com/user-attachments/assets/cfb68360-9a56-4232-b2cf-f30c01128237" />

#### 5. Hapus Data Perikanan (Menu 4)

Pengguna memilih Menu 4, lalu menginput ID data yang ingin dihapus. Sistem menghapus data dengan ID tersebut dari seluruh ArrayList terkait dan menampilkan konfirmasi.

<img width="244" height="322" alt="MENU 4" src="https://github.com/user-attachments/assets/43d3554e-18a0-4f89-ae4d-538ebb114572" />

#### 6. Keluar (Menu 5)

Pengguna memilih Menu 5, sistem menampilkan pesan penutup dan program berhenti berjalan.

<img width="418" height="232" alt="MENU 5" src="https://github.com/user-attachments/assets/c3e54a70-688e-4841-9a10-618d53ddeb73" />
