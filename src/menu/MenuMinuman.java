package menu;

// Inheritence menuminuman yang mewarisi dari properti menu
public class MenuMinuman extends Menu {
    private String ukuran;

    // Constructor dan inheritence yang mewarisi dari constructor menu
    public MenuMinuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    // Penerapan polymorphism overriding pada method
    @Override
    public String getKategori() {
        return "Minuman";
    }

    // Penerapan polymorphism overriding pada method
    @Override
    public void setKategori(String kategori) {
    }

    // Penerapan polymorphism overriding pada method
    @Override
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    // Penerapan polymorphism overriding pada method
    @Override
    public String getUkuran() {
        return ukuran;
    }
}
