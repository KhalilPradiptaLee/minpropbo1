package restoran;

import menu.ManajerMenu;
import menu.MenuMakanan;
import menu.MenuMinuman;
import java.util.Scanner;

class LoginAdmin {
    // Penerapan final keyword karena username dan password tidak dapat dirubah
    private static final String USERNAME = "khalil";
    private static final String PASSWORD = "xixixi";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajerMenu manajerMenu = new ManajerMenu();
        boolean siAdmin;


        while (true) {
            siAdmin = login(scanner);

            // Jika nanti login berhasil maka akan dipanggil method menuAdmin
            if (siAdmin) {
                menuAdmin(scanner, manajerMenu);
            // Jika tidak login admin maka akan dipanggil method menuGuest
            } else {
                menuGuest(scanner, manajerMenu);
            }
        }
    }

    public static boolean login(Scanner scanner) {
        while (true) {
            System.out.println("====> SELAMAT DATANG DI RESTORAN SHANHAIJING <====");
            System.out.println("1. Masuk sebagai Admin");
            System.out.println("2. Masuk sebagai Guest");
            System.out.println("3. Keluar");
            System.out.print("Pilih ingin masuk sebagai admin/guest (1-3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                // Login admin
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    System.out.println("Login sebagai Admin berhasil.");
                    return true; // Admin berhasil login
                } else {
                    System.out.println("Username atau password salah. Silahkan coba lagi.");
                }
            } else if (pilihan == 2) {
                System.out.println("Anda masuk sebagai guest.");
                return false; // Guest login
            } else if (pilihan == 3) {
                System.out.println("Program akan tertutup...");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid. Silahkan pilih 1, 2, atau 3.");
            }
        }
    }

    // Jika login berhasil, method boolean login = true
    public static void menuAdmin(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n====> MENU ADMIN <====");
            System.out.println("1. Kelola Menu Makanan");
            System.out.println("2. Kelola Menu Minuman");
            System.out.println("3. Logout");
            System.out.print("Pilih menu 1-3: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    kelolaMenuMakanan(scanner, manajerMenu);
                    break;
                case 2:
                    kelolaMenuMinuman(scanner, manajerMenu);
                    break;
                case 3:
                    System.out.println("Keluar dari menu admin. Kembali ke menu login.\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih antara 1-3.");
            }
        } while (pilihan != 3);
    }

    // Jika tidak melakukan login, method boolean login = false
    public static void menuGuest(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n====> MENU PELANGGAN <====");
            System.out.println("1. Lihat Menu Makanan");
            System.out.println("2. Lihat Menu Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manajerMenu.lihatMenuMakanan();
                    break;
                case 2:
                    manajerMenu.lihatMenuMinuman();
                    break;
                case 3:
                    System.out.println("Keluar dari menu pelanggan. Kembali ke menu login.\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih antara 1-3.");
            }
        } while (pilihan != 3);
    }


    public static void kelolaMenuMakanan(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n> Kelola Menu Makanan <");
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
                case 1:
                    System.out.print("Masukkan nama makanan (ex:Bakpao): ");
                    String namaMakanan = scanner.nextLine();
                    System.out.print("Masukkan harga makanan (ex:30000): ");
                    double hargaMakanan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan kategori makanan (ex:Cuisine): ");
                    String kategoriMakanan = scanner.nextLine();
                    MenuMakanan menuMakanan = new MenuMakanan(namaMakanan, hargaMakanan, kategoriMakanan) {
                        @Override
                        public String getUkuran() {
                            return "";
                        }
                    };
                    manajerMenu.tambahMenu(menuMakanan);
                    break;

                case 2:
                    manajerMenu.lihatMenuMakanan();
                    break;

                case 3:
                    manajerMenu.lihatMenuMakanan();

                    System.out.print("Masukkan indeks makanan yang ingin diubah (ex:0): ");
                    int indeksEditMakanan = scanner.nextInt();
                    scanner.nextLine();

                    if (indeksEditMakanan >= 0 && indeksEditMakanan < manajerMenu.daftarMenuMakanan.size()) {
                        // Jika indeks ada, lanjut dengan input perubahan
                        System.out.print("Masukkan nama makanan baru (ex:Siomay): ");
                        String namaBaruMakanan = scanner.nextLine();
                        System.out.print("Masukkan harga makanan baru (ex:10000): ");
                        double hargaBaruMakanan = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan kategori makanan baru (ex:Seafood): ");
                        String kategoriBaruMakanan = scanner.nextLine();

                        manajerMenu.editMenuMakanan(indeksEditMakanan, namaBaruMakanan, hargaBaruMakanan, kategoriBaruMakanan);
                    } else {
                        // Jika indeks tidak ada, langsung tampilkan error
                        System.out.println("Tolong Masukkan sesuai dengan indeks yang ditampilkan");
                    }
                    break;

                case 4:
                    manajerMenu.lihatMenuMakanan();
                    System.out.print("Masukkan indeks makanan yang ingin dihapus (ex:0): ");
                    int indeksHapusMakanan = scanner.nextInt();
                    manajerMenu.hapusMenuMakanan(indeksHapusMakanan);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih antara 1-5");
            }
        } while (pilihan != 5);
    }

    public static void kelolaMenuMinuman(Scanner scanner, ManajerMenu manajerMenu) {
        int pilihan;
        do {
            System.out.println("\n> Kelola Menu Minuman <");
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
                case 1:
                    System.out.print("Masukkan nama minuman (ex:Es Teh): ");
                    String namaMinuman = scanner.nextLine();
                    System.out.print("Masukkan harga (ex:6000): ");
                    double hargaMinuman = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan ukuran minuman (ex:Medium): ");
                    String ukuranMinuman = scanner.nextLine();
                    MenuMinuman menuMinuman = new MenuMinuman(namaMinuman, hargaMinuman, ukuranMinuman);
                    manajerMenu.tambahMenu(menuMinuman);
                    break;

                case 2:
                    manajerMenu.lihatMenuMinuman();
                    break;

                case 3:
                    // Menampilkan daftar minuman terlebih dahulu
                    manajerMenu.lihatMenuMinuman();

                    System.out.print("Masukkan indeks minuman yang ingin diubah (ex:0): ");
                    int indeksEditMinuman = scanner.nextInt();
                    scanner.nextLine();

                    if (indeksEditMinuman >= 0 && indeksEditMinuman < manajerMenu.daftarMenuMinuman.size()) {
                        // Jika indeks ada lanjut dengan input perubahan
                        System.out.print("Masukkan nama baru (ex:Es Jeruk): ");
                        String namaBaruMinuman = scanner.nextLine();
                        System.out.print("Masukkan harga baru (ex:7000): ");
                        double hargaBaruMinuman = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan ukuran baru (ex:Small): ");
                        String ukuranBaruMinuman = scanner.nextLine();

                        manajerMenu.editMenuMinuman(indeksEditMinuman, namaBaruMinuman, hargaBaruMinuman, ukuranBaruMinuman);
                    } else {
                        // Jika indeks tidak ada, langsung tampilkan error
                        System.out.println("Tolong Masukkan sesuai dengan indeks yang ditampilkan.");
                    }
                    break;

                case 4:
                    manajerMenu.lihatMenuMinuman();
                    System.out.print("Masukkan indeks minuman yang ingin dihapus (ex:0): ");
                    int indeksHapusMinuman = scanner.nextInt();
                    manajerMenu.hapusMenuMinuman(indeksHapusMinuman);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih antara 1-5");
            }
        } while (pilihan != 5);
    }
}
