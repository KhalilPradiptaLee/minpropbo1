package menu;

// Penerapan abstraction pada class menu
abstract class Menu {
    private String nama;
    private double harga;

    // Constructor dan inheritence yang nanti mewariskan pada constructor menumakanan dan menuminuman
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter harga
    public double getHarga() {
        return harga;
    }

    // Setter harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

// Penerapan abstaction getter dan setter

    public abstract String getKategori();

    public abstract void setKategori(String kategori);

    public abstract void setUkuran(String ukuran);

    public abstract String getUkuran();
}
