### Nama : Khalil Pradipta Lee
### NIM : 2309116046

# MINI PROJECT 2 PBO

## Cara Kerja Program
##### 1. User melakukan login terlebih dahulu
##### 2. User memilih masuk sebagai admin/guest

##### 3. Jika memilih admin, user maka disuruh input username dan password
##### ps: disini, saya hanya membuat satu akun admin saja "Username = khalil" "Password = xixixi"
##### 4. Setelah login admin, admin memilih ingin mengelola menu makanan/minuman terlebih dahulu
##### 5. Pada pengelolaan menu makanan/minuman, admin dapat melakukan CRUD

##### 6. Jika memilih guest, user langsung masuk pada menu guest
##### 7. Pada menu guest, user hanya dapat melihat menu makanan/minuman saja

#### Tampilan Login
```
====> SELAMAT DATANG DI RESTORAN SHANHAIJING <====
1. Masuk sebagai Admin
2. Masuk sebagai Guest
3. Keluar
Pilih ingin masuk sebagai admin/guest (1-3):
```

```
====> SELAMAT DATANG DI RESTORAN SHANHAIJING <====
1. Masuk sebagai Admin
2. Masuk sebagai Guest
3. Keluar
Pilih ingin masuk sebagai admin/guest (1-3): 1
Masukkan username: khalil
Masukkan password: xixixi
Login sebagai Admin berhasil.
```

```
====> SELAMAT DATANG DI RESTORAN SHANHAIJING <====
1. Masuk sebagai Admin
2. Masuk sebagai Guest
3. Keluar
Pilih ingin masuk sebagai admin/guest (1-3): 2
Anda masuk sebagai guest.
```

#### 1. Tampilan menu untuk admin
```
====> MENU ADMIN <====
1. Kelola Menu Makanan
2. Kelola Menu Minuman
3. Logout
Pilih menu 1-3:
```
#### 2. Masuk Menu admin (makanan)
```
====> MENU ADMIN <====
1. Kelola Menu Makanan
2. Kelola Menu Minuman
3. Logout
Pilih menu 1-3: 1

> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu:
```
##### 3. Create admin (makanan)
```
> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu: 1
Masukkan nama makanan (ex:Bakpao): Bakpao
Masukkan harga makanan (ex:30000): 35000
Masukkan kategori makanan (ex:Cuisine): Cuisine
Bakpao berhasil ditambahkan ke menu makanan.
```

#### 4. Read admin (makanan)
```
> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu: 2
[0]
Nama Makanan : Bakpao
Harga        : 35000.0
Kategori     : Cuisine
-----------------------------
```

#### 5. Update admin (makanan)
```
> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu: 3
[0]
Nama Makanan : Bakpao
Harga        : 35000.0
Kategori     : Cuisine
-----------------------------
Masukkan indeks makanan yang ingin diubah (ex:0): 0
Masukkan nama makanan baru (ex:Siomay): Siomay
Masukkan harga makanan baru (ex:10000): 10000
Masukkan kategori makanan baru (ex:Seafood): Seafood
Menu makanan Siomay berhasil diubah.

> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu: 2
[0]
Nama Makanan : Siomay
Harga        : 10000.0
Kategori     : Seafood
-----------------------------
```

#### 6. Delete admin (makanan)
```
> Kelola Menu Makanan <
1. Tambah Menu Makanan
2. Lihat Semua Menu Makanan
3. Edit Menu Makanan
4. Hapus Menu Makanan
5. Kembali
=============================
Pilih menu: 4
[0]
Nama Makanan : Siomay
Harga        : 10000.0
Kategori     : Seafood
-----------------------------
Masukkan indeks makanan yang ingin dihapus (ex:0): 0
Siomay berhasil dihapus dari menu makanan.
```

#### 7. Masuk Menu Admin (minuman)
```
====> MENU ADMIN <====
1. Kelola Menu Makanan
2. Kelola Menu Minuman
3. Logout
Pilih menu 1-3: 2

> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu:
```

#### 8. Create admin (minuman)
```
> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu: 1
Masukkan nama minuman (ex:Es Teh): Es Teh
Masukkan harga (ex:6000): 6000
Masukkan ukuran minuman (ex:Medium): Medium
Es Teh berhasil ditambahkan ke menu minuman.
```

#### 9. Read admin (minuman)
```
> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu: 2
[0]
Nama Minuman : Es Teh
Harga        : 6000.0
Ukuran       : Medium
-----------------------------
```

#### 10. Update admin (minuman)
```
> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu: 3
[0]
Nama Minuman : Es Teh
Harga        : 6000.0
Ukuran       : Medium
-----------------------------
Masukkan indeks minuman yang ingin diubah (ex:0): 0
Masukkan nama baru (ex:Es Jeruk): Es Jeruk
Masukkan harga baru (ex:7000): 7000
Masukkan ukuran baru (ex:Small): Small
Menu minuman Es Jeruk berhasil diubah.

> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu: 2
[0]
Nama Minuman : Es Jeruk
Harga        : 7000.0
Ukuran       : Small
-----------------------------
```

#### 11. Delete admin (minuman)
```
> Kelola Menu Minuman <
1. Tambah Menu Minuman
2. Lihat Semua Menu Minuman
3. Edit Menu Minuman
4. Hapus Menu Minuman
5. Kembali
=============================
Pilih menu: 4
[0]
Nama Minuman : Es Jeruk
Harga        : 7000.0
Ukuran       : Small
-----------------------------
Masukkan indeks minuman yang ingin dihapus (ex:0): 0
Es Jeruk berhasil dihapus dari menu minuman.
```

#### 12. Menu Pelanggan/Guest
```
====> MENU PELANGGAN <====
1. Lihat Menu Makanan
2. Lihat Menu Minuman
3. Keluar
Pilih menu: 1
Tidak ada menu makanan yang tersedia saat ini.

====> MENU PELANGGAN <====
1. Lihat Menu Makanan
2. Lihat Menu Minuman
3. Keluar
Pilih menu: 2
Tidak ada menu minuman yang tersedia saat ini.

====> MENU PELANGGAN <====
1. Lihat Menu Makanan
2. Lihat Menu Minuman
3. Keluar
Pilih menu: 3
Keluar dari menu pelanggan. Kembali ke menu login.
```
