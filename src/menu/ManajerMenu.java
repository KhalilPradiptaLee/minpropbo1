package menu;

import java.util.ArrayList;

// Final keyword untuk class dan implements interface CRUD
public final class ManajerMenu implements CRUD {
    public final ArrayList<MenuMakanan> daftarMenuMakanan = new ArrayList<>();
    public final ArrayList<MenuMinuman> daftarMenuMinuman = new ArrayList<>();

    // Penerapan polymorphism overriding untuk method create
    @Override
    public void tambahMenu(Menu menu) {
        if (menu instanceof MenuMakanan) {
            daftarMenuMakanan.add((MenuMakanan) menu);
            System.out.println(menu.getNama() + " berhasil ditambahkan ke menu makanan.");
        } else if (menu instanceof MenuMinuman) {
            daftarMenuMinuman.add((MenuMinuman) menu);
            System.out.println(menu.getNama() + " berhasil ditambahkan ke menu minuman.");
        }
    }

    // Penerapan polymorphism overriding untuk method read makanan
    public void lihatMenuMakanan() {
        if (daftarMenuMakanan.isEmpty()) {
            System.out.println("Tidak ada menu makanan yang tersedia saat ini.");
        } else {
            for (int i = 0; i < daftarMenuMakanan.size(); i++) {
                MenuMakanan menu = daftarMenuMakanan.get(i);
                System.out.println("[" + i + "]");
                System.out.println("Nama Makanan : " + menu.getNama());
                System.out.println("Harga        : " + menu.getHarga());
                System.out.println("Kategori     : " + menu.getKategori());
                System.out.println("-----------------------------");
            }
        }
    }

    // Penerapan polymorphism overriding untuk method read minuman
    @Override
    public void lihatMenuMinuman() {
        if (daftarMenuMinuman.isEmpty()) {
            System.out.println("Tidak ada menu minuman yang tersedia saat ini.");
        } else {
            for (int i = 0; i < daftarMenuMinuman.size(); i++) {
                MenuMinuman menu = daftarMenuMinuman.get(i);
                System.out.println("[" + i + "]");
                System.out.println("Nama Minuman : " + menu.getNama());
                System.out.println("Harga        : " + menu.getHarga());
                System.out.println("Ukuran       : " + menu.getUkuran());
                System.out.println("-----------------------------");
            }
        }
    }

    // Penerapan polymorphism overriding untuk method edit makanan
    @Override
    public void editMenuMakanan(int indeks, String namaBaru, double hargaBaru, String kategoriBaru) {
        if (indeks >= 0 && indeks < daftarMenuMakanan.size()) {
            MenuMakanan menu = daftarMenuMakanan.get(indeks);
            menu.setNama(namaBaru);
            menu.setHarga(hargaBaru);
            menu.setKategori(kategoriBaru);
            System.out.println("Menu makanan " + namaBaru + " berhasil diubah.");
        } else {
            System.out.println("Indeks menu makanan tidak valid.");
        }
    }

    // Penerapan polymorphism overriding untuk method edit minuman
    @Override
    public void editMenuMinuman(int indeks, String namaBaru, double hargaBaru, String ukuranBaru) {
        if (indeks >= 0 && indeks < daftarMenuMinuman.size()) {
            MenuMinuman menu = daftarMenuMinuman.get(indeks);
            menu.setNama(namaBaru);
            menu.setHarga(hargaBaru);
            menu.setUkuran(ukuranBaru);
            System.out.println("Menu minuman " + namaBaru + " berhasil diubah.");
        } else {
            System.out.println("Indeks menu minuman tidak valid.");
        }
    }

    // Penerapan polymorphism overriding untuk method delete makanan
    @Override
    public void hapusMenuMakanan(int indeks) {
        if (indeks >= 0 && indeks < daftarMenuMakanan.size()) {
            MenuMakanan menu = daftarMenuMakanan.remove(indeks);
            System.out.println(menu.getNama() + " berhasil dihapus dari menu makanan.");
        } else {
            System.out.println("Indeks menu makanan tidak valid.");
        }
    }

    // Penerapan polymorphism overriding untuk method delete minuman
    @Override
    public void hapusMenuMinuman(int indeks) {
        if (indeks >= 0 && indeks < daftarMenuMinuman.size()) {
            MenuMinuman menu = daftarMenuMinuman.remove(indeks);
            System.out.println(menu.getNama() + " berhasil dihapus dari menu minuman.");
        } else {
            System.out.println("Indeks menu minuman tidak valid.");
        }
    }
}
