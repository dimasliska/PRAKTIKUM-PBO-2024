class DataSepedaRodaRantai extends DataSepeda implements Parkir {
    private final String ukuranBan;

    public DataSepedaRodaRantai(String merek, String jenisSepeda, int harga, int stok, String ukuranBan) {
        super(merek, jenisSepeda, harga, stok);
        this.ukuranBan = ukuranBan;
    }

    public String getUkuranBan() {
        return ukuranBan;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Ukuran Ban: " + ukuranBan);
    }


    @Override
    public void parkir() {
        System.out.println("Sepeda roda rantai diparkir.");
    }

    @Override
    public void kunci() {
        System.out.println("Sepeda roda rantai dikunci.");
    }
}