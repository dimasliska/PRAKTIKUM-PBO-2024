class DataSepedaGunung extends DataSepeda implements Parkir {
    private final int rodaDepan;
    private final int rodaBelakang;

    public DataSepedaGunung(String merek, String jenisSepeda, int harga, int stok, int rodaDepan, int rodaBelakang) {
        super(merek, jenisSepeda, harga, stok);
        this.rodaDepan = rodaDepan;
        this.rodaBelakang = rodaBelakang;
    }

    public int getRodaDepan() {
        return rodaDepan;
    }

    public int getRodaBelakang() {
        return rodaBelakang;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Roda Depan: " + rodaDepan);
        System.out.println("Roda Belakang: " + rodaBelakang);
    }

    @Override
    public void parkir() {
        System.out.println("Sepeda gunung diparkir.");
    }

    @Override
    public void kunci() {
        System.out.println("Sepeda gunung dikunci.");
    }
}