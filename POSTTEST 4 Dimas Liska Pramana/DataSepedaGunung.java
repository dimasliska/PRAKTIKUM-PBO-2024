class DataSepedaGunung extends DataSepeda {
    private int rodaDepan;
    private int rodaBelakang;

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
        super.displayInfo();
        System.out.println("Roda Depan: " + rodaDepan);
        System.out.println("Roda Belakang: " + rodaBelakang);
    }
}
