// Abstract class

interface Parkir {
    void parkir();
    void kunci();
}
public abstract class DataSepeda {
    private final String merek;
    private final String jenisSepeda;
    private final int harga;
    private final int stok;

    public DataSepeda(String merek, String jenisSepeda, int harga, int stok) {
        this.merek = merek;
        this.jenisSepeda = jenisSepeda;
        this.harga = harga;
        this.stok = stok;
    }

    public final String getMerek() {
        return merek;
    }

    public final String getJenis() {
        return jenisSepeda;
    }

    public final int getHarga() {
        return harga;
    }

    public final int getStok() {
        return stok;
    }

    // Abstract method
    public abstract void displayInfo();
}