package restoran;

public class Restoran {
    private String namaRestoran;
    private static int totalMenu;

    // Constructor
    public Restoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }


    public String getNamaRestoran() {
        return namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public static int getTotalMenu() {
        return totalMenu;
    }

    public static void tambahMenu() {
        totalMenu++;
    }
}
