public class Dosen13 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen13(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia         : " + usia);
    }
}
