package menu;

public class MenuMinuman {
    private String namaMinuman;
    private double hargaMinuman;
    private String ukuran;

    // Constructor
    public MenuMinuman(String namaMinuman, double hargaMinuman, String ukuran) {
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
        this.ukuran = ukuran;
    }


    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public double getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(double hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    // Fungsi untuk menampilkan informasi minuman
    public void tampilkanInfoMinuman() {
        System.out.println("Minuman: " + namaMinuman);
        System.out.println("Harga: " + hargaMinuman);
        System.out.println("Ukuran: " + ukuran);
    }
}
