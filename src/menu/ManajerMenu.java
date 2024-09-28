package menu;

import java.util.ArrayList;

// ArrayList makanan dan minuman
public class ManajerMenu {
    private ArrayList<MenuMakanan> daftarMenuMakanan = new ArrayList<>();
    private ArrayList<MenuMinuman> daftarMenuMinuman = new ArrayList<>();

    // Fungsi Menambahkan menu makanan
    public void tambahMenuMakanan(MenuMakanan menuMakanan) {
        daftarMenuMakanan.add(menuMakanan);
        System.out.println("Menu makanan berhasil ditambahkan.");
    }

    // Fungsi Menambahkan menu minuman
    public void tambahMenuMinuman(MenuMinuman menuMinuman) {
        daftarMenuMinuman.add(menuMinuman);
        System.out.println("Menu minuman berhasil ditambahkan.");
    }

    // Fungsi Menampilkan semua menu makanan
    public void lihatMenuMakanan() {
        if (daftarMenuMakanan.isEmpty()) {
            System.out.println("Tidak ada menu makanan yang tersedia saat ini.");
        } else {
            System.out.println("Daftar Menu Makanan:");
            for (int i = 0; i < daftarMenuMakanan.size(); i++) {
                MenuMakanan menuMakanan = daftarMenuMakanan.get(i);
                System.out.println("[" + i + "] " + menuMakanan.getNama() + " - " + menuMakanan.getHarga() + " - " + menuMakanan.getKategori());
            }
        }
    }

    // Fungsi Menampilkan semua menu minuman
    public void lihatMenuMinuman() {
        if (daftarMenuMinuman.isEmpty()) {
            System.out.println("Tidak ada menu minuman yang tersedia saat ini.");
        } else {
            System.out.println("Daftar Menu Minuman:");
            for (int i = 0; i < daftarMenuMinuman.size(); i++) {
                MenuMinuman menuMinuman = daftarMenuMinuman.get(i);
                System.out.println("[" + i + "] " + menuMinuman.getNamaMinuman() + " - " + menuMinuman.getHargaMinuman() + " - " + menuMinuman.getUkuran());
            }
        }
    }

    // Fungsi Mengedit menu makanan berdasarkan indeks
    public void editMenuMakanan(int indeks, String namaBaru, double hargaBaru, String kategoriBaru) {
        if (indeks >= 0 && indeks < daftarMenuMakanan.size()) {
            MenuMakanan menuMakanan = daftarMenuMakanan.get(indeks);
            menuMakanan.setNama(namaBaru);
            menuMakanan.setHarga(hargaBaru);
            menuMakanan.setKategori(kategoriBaru);
            System.out.println("Menu makanan berhasil diubah.");
        } else {
            System.out.println("Indeks menu makanan tidak valid.");
        }
    }

    // Fungsi Mengedit menu minuman berdasarkan indeks
    public void editMenuMinuman(int indeks, String namaBaru, double hargaBaru, String kategoriBaru) {
        if (indeks >= 0 && indeks < daftarMenuMinuman.size()) {
            MenuMinuman menuMinuman = daftarMenuMinuman.get(indeks);
            menuMinuman.setNamaMinuman(namaBaru);
            menuMinuman.setHargaMinuman(hargaBaru);
            menuMinuman.setUkuran(kategoriBaru);
            System.out.println("Menu minuman berhasil diubah.");
        } else {
            System.out.println("Indeks menu minuman tidak valid.");
        }
    }

    // Fungsi Menghapus menu makanan berdasarkan indeks
    public void hapusMenuMakanan(int indeks) {
        if (indeks >= 0 && indeks < daftarMenuMakanan.size()) {
            daftarMenuMakanan.remove(indeks);
            System.out.println("Menu makanan berhasil dihapus.");
        } else {
            System.out.println("Indeks menu makanan tidak valid.");
        }
    }

    // Fungsi Menghapus menu minuman berdasarkan indeks
    public void hapusMenuMinuman(int indeks) {
        if (indeks >= 0 && indeks < daftarMenuMinuman.size()) {
            daftarMenuMinuman.remove(indeks);
            System.out.println("Menu minuman berhasil dihapus.");
        } else {
            System.out.println("Indeks menu minuman tidak valid.");
        }
    }
}
