class Matakuliah13 {
    String kodeMK = "K0D3MK", nama = "namaMatkul";
    int sks = 10, jumlahJam = 20;

    public Matakuliah13() {

    }

    public Matakuliah13(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilinInformasi() {
        System.out.println("kodeMK = " + kodeMK);
        System.out.println("Nama = " + nama);
        System.out.println("SKS = " + sks);
        System.out.println("Jumlah Jam = " + jumlahJam);
    }

    void ubahJam(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diperbarui '" + sks + "'");
    }

    void tambahJam(int tambahJam) {
        this.jumlahJam += tambahJam;
        System.out.println("Jumlah jam saat ini : " + jumlahJam);
    }

    void kurangJam(int kurangJam) {
        if (jumlahJam > kurangJam) {
            jumlahJam -= kurangJam;
            System.out.println("Jumlah jam saat ini : " + jumlahJam);
        } else {
            System.out.println("Maaf gagal melakukan pengurangan jam");
        }
    }
}
