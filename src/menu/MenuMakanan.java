package menu;

    public abstract class MenuMakanan extends Menu {
        private String kategori;

        // Constructor dan inheritence yang mewarisi dari constructor menu
        public MenuMakanan(String nama, double harga, String kategori) {
            super(nama, harga);
            this.kategori = kategori;
        }

        // Penerapan polymorphism overriding pada method
        @Override
        public String getKategori() {
            return kategori;
        }

        // Penerapan polymorphism overriding pada method
        @Override
        public void setKategori(String kategori) {
            this.kategori = kategori;
        }

        // Penerapan polymorphism overriding pada method
        @Override
        public void setUkuran(String ukuran) {
        }
    }
