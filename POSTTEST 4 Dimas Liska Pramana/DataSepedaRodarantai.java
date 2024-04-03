class DataSepedaRodarantai extends DataSepeda {
    private String ukuranBan;

    public DataSepedaRodarantai(String merek, String jenisSepeda, int harga, int stok, String ukuranBan) {
        super(merek, jenisSepeda, harga, stok);
        this.ukuranBan = ukuranBan;
    }

    public String getUkuranBan() {
        return ukuranBan;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Ban: " + ukuranBan);
    }
}
