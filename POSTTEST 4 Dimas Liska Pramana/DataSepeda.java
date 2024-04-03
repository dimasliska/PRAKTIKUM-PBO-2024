public class DataSepeda {
    private String merek;
    private String jenisSepeda;
    private int harga;
    private int stok;

    public DataSepeda(String merek, String jenisSepeda, int harga, int stok) {
        this.merek = merek;
        this.jenisSepeda = jenisSepeda;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerek() {
        return merek;
    }

    public String getJenis() {
        return jenisSepeda;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method overloading
    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenisSepeda);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
