package menu;

public class MenuMakanan {
    private String namaMakanan;
    private double hargaMakanan;
    private String kategori;

    // Constructor
    public MenuMakanan(String nama, double harga, String kategori) {
        this.namaMakanan = nama;
        this.hargaMakanan = harga;
        this.kategori = kategori;
    }


    public String getNama() {
        return namaMakanan;
    }

    public void setNama(String nama) {
        this.namaMakanan = nama;
    }

    public double getHarga() {
        return hargaMakanan;
    }

    public void setHarga(double harga) {
        this.hargaMakanan = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}
