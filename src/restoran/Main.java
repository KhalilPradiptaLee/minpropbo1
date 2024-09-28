package restoran;

import menu.ManajerMenu;
import menu.MenuMakanan;
import menu.MenuMinuman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajerMenu manajerMenu = new ManajerMenu();
        int pilihan;

        do {
            System.out.println("\n==== RESTORAN SHANHAIJING ====");
            System.out.println("1. Kelola Menu Makanan");
            System.out.println("2. Kelola Menu Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Masuk Menu Makanan
                    kelolaMenuMakanan(scanner, manajerMenu);
                    break;

                case 2:
                    // Masuk Menu Minuman
                    kelolaMenuMinuman(scanner, manajerMenu);
                    break;

                case 3:
                    // Keluar dari aplikasi
                    System.out.println("Keluar dari aplikasi...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        scanner.close();
    }

    // CRUD Makanan
    public static void kelolaMenuMakanan(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n==== Kelola Menu Makanan ====");
            System.out.println("1. Tambah Menu Makanan");
            System.out.println("2. Lihat Semua Menu Makanan");
            System.out.println("3. Edit Menu Makanan");
            System.out.println("4. Hapus Menu Makanan");
            System.out.println("5. Kembali");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                // Create Makanan
                case 1:

                    System.out.print("Masukkan nama makanan (ex:Bakpao): ");
                    String namaMakanan = scanner.nextLine();
                    System.out.print("Masukkan harga (ex:20000): ");
                    double hargaMakanan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan kategori makanan (ex:Seafood): ");
                    String kategoriMakanan = scanner.nextLine();
                    MenuMakanan menuMakanan = new MenuMakanan(namaMakanan, hargaMakanan, kategoriMakanan);
                    manajerMenu.tambahMenuMakanan(menuMakanan);
                    break;

                // Read Makanan
                case 2:
                    // Lihat Semua Menu Makanan
                    manajerMenu.lihatMenuMakanan();
                    break;

                // Edit Makanan
                case 3:
                    // Edit Menu Makanan
                    manajerMenu.lihatMenuMakanan();
                    System.out.print("Masukkan indeks makanan yang ingin diubah (ex:0): ");
                    int indeksEditMakanan = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama baru (ex: Bakpao): ");
                    String namaBaruMakanan = scanner.nextLine();
                    System.out.print("Masukkan harga baru (ex: 20000): ");
                    double hargaBaruMakanan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan kategori baru (ex: Seafood): ");
                    String kategoriBaruMakanan = scanner.nextLine();
                    manajerMenu.editMenuMakanan(indeksEditMakanan, namaBaruMakanan, hargaBaruMakanan, kategoriBaruMakanan);
                    break;

                // Delete Makanan
                case 4:
                    // Hapus Menu Makanan
                    manajerMenu.lihatMenuMakanan();
                    System.out.print("Masukkan indeks makanan yang ingin dihapus (ex:0) : ");
                    int indeksHapusMakanan = scanner.nextInt();
                    manajerMenu.hapusMenuMakanan(indeksHapusMakanan);
                    break;

                // Kembali
                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silahkan input yang sesuai.");
            }
        } while (pilihan != 5);
    }

    // CRUD Minuman
    public static void kelolaMenuMinuman(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n==== Kelola Menu Minuman ====");
            System.out.println("1. Tambah Menu Minuman");
            System.out.println("2. Lihat Semua Menu Minuman");
            System.out.println("3. Edit Menu Minuman");
            System.out.println("4. Hapus Menu Minuman");
            System.out.println("5. Kembali");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                // Create Minuman
                case 1:

                    System.out.print("Masukkan nama minuman (ex: Es Jeruk): ");
                    String namaMinuman = scanner.nextLine();
                    System.out.print("Masukkan harga (ex:5000): ");
                    double hargaMinuman = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan ukuran minuman (ex: Medium): ");
                    String UkuranMinuman = scanner.nextLine();
                    MenuMinuman menuMinuman = new MenuMinuman(namaMinuman, hargaMinuman, UkuranMinuman);
                    manajerMenu.tambahMenuMinuman(menuMinuman);
                    break;

                // Read Minuman
                case 2:
                    // Lihat Semua Menu Minuman
                    manajerMenu.lihatMenuMinuman();
                    break;

                // Edit Minuman
                case 3:
                    // Edit Menu Minuman
                    manajerMenu.lihatMenuMinuman();
                    System.out.print("Masukkan indeks minuman yang ingin diubah (ex: 0): ");
                    int indeksEditMinuman = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama baru (ex: Es Jeruk)");
                    String namaBaruMinuman = scanner.nextLine();
                    System.out.print("Masukkan harga baru (ex: 5000): ");
                    double hargaBaruMinuman = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan ukuran baru (ex: Medium) ");
                    String UkuranBaruMinuman = scanner.nextLine();
                    manajerMenu.editMenuMinuman(indeksEditMinuman, namaBaruMinuman, hargaBaruMinuman, UkuranBaruMinuman);
                    break;

                // Delete Minuman
                case 4:
                    // Hapus Menu Minuman
                    manajerMenu.lihatMenuMinuman();
                    System.out.print("Masukkan indeks minuman yang ingin dihapus (ex:0) ");
                    int indeksHapusMinuman = scanner.nextInt();
                    manajerMenu.hapusMenuMinuman(indeksHapusMinuman);
                    break;

                // Kembali
                case 5:
                    // Kembali ke menu utama
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silahkan input yang sesuai.");
            }
        } while (pilihan != 5);
    }
}
