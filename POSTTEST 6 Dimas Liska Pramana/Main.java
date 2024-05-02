    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        private static ArrayList<DataSepeda> daftarSepeda = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int pilihan;

            do {
                System.out.println("Menu: ");
                System.out.println("1. Tambah Sepeda");
                System.out.println("2. Lihat Daftar Sepeda Gunung");
                System.out.println("3. Lihat Daftar Sepeda Roda Rantai");
                System.out.println("4. Lihat Semua Sepeda");
                System.out.println("5. Keluar");
                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        tambahSepeda(scanner);
                        break;
                    case 2:
                        lihatDaftarSepedaGunung();
                        break;
                    case 3:
                        lihatDaftarSepedaRodarantai();
                        break;
                    case 4:
                        lihatDaftarSepeda();
                        break;
                    case 5:
                        System.out.println("Keluar");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 5);
        }

        private static void tambahSepeda(Scanner scanner) {
    try {
        System.out.print("Masukkan merek: ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan jenis sepeda (sepeda/sepeda gunung/sepeda roda rantai): ");
        String jenisSepeda = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
    
        if (jenisSepeda.equalsIgnoreCase("sepeda gunung")) {
            System.out.print("Masukkan roda depan: ");
            int rodaDepan = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan roda belakang: ");
            int rodaBelakang = scanner.nextInt();
            scanner.nextLine();
    
            DataSepedaGunung sepedaGunung = new DataSepedaGunung(merek, jenisSepeda, harga, stok, rodaDepan, rodaBelakang);
            sepedaGunung.parkir(); 
            sepedaGunung.kunci();
            daftarSepeda.add(sepedaGunung);
            System.out.println("Sepeda baru telah ditambahkan!");
        } else if (jenisSepeda.equalsIgnoreCase("sepeda roda rantai")) {
            System.out.print("Masukkan ukuran ban: ");
            String ukuranBan = scanner.nextLine();
    
            DataSepedaRodaRantai sepedaRodaRantai = new DataSepedaRodaRantai(merek, jenisSepeda, harga, stok, ukuranBan);
                sepedaRodaRantai.parkir(); // Panggil metode parkir untuk sepeda roda rantai
                sepedaRodaRantai.kunci(); // Panggil metode kunci untuk sepeda roda rantai
                daftarSepeda.add(sepedaRodaRantai);
            System.out.println("Sepeda baru telah ditambahkan!");
        } 
    } catch (Exception e) {
        System.out.println("Input tidak valid! Pastikan Anda memasukkan data dengan benar.");
        scanner.nextLine(); // Membersihkan buffer input
    }
}

        
        

        private static void lihatDaftarSepeda() {
            if (daftarSepeda.isEmpty()) {
                System.out.println("Daftar sepeda masih kosong!");
            } else {
                for (DataSepeda sepeda : daftarSepeda) {
                    System.out.println("--------------------");
                    sepeda.displayInfo(); // Polymorphic call
                    System.out.println("--------------------");
                }
            }
        }

        private static void lihatDaftarSepedaGunung() {
            if (daftarSepeda.isEmpty()) {
                System.out.println("Daftar sepeda masih kosong!");
            } else {
                for (DataSepeda sepeda : daftarSepeda) {
                    if (sepeda instanceof DataSepedaGunung) {
                        System.out.println("--------------------");
                        sepeda.displayInfo(); // Polymorphic call
                        System.out.println("--------------------");
                    }
                }
            }
        }

        private static void lihatDaftarSepedaRodarantai() {
            if (daftarSepeda.isEmpty()) {
                System.out.println("Daftar sepeda masih kosong!");
            } else {
                for (DataSepeda sepeda : daftarSepeda) {
                    if (sepeda instanceof DataSepedaRodaRantai) {
                        System.out.println("--------------------");
                        sepeda.displayInfo(); // Polymorphic call
                        System.out.println("--------------------");
                    }
                }
            }
        }
    }
