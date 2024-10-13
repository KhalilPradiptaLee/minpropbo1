package menu;

// Interface untuk CRUD yang nanti akan diterapkan di ManajerMenu
public interface CRUD {
    void tambahMenu(Menu menu);
    void lihatMenuMakanan();
    void lihatMenuMinuman();
    void editMenuMakanan(int indeks, String namaBaru, double hargaBaru, String kategoriBaru);
    void editMenuMinuman(int indeks, String namaBaru, double hargaBaru, String ukuranBaru);
    void hapusMenuMakanan(int indeks);
    void hapusMenuMinuman(int indeks);
}
