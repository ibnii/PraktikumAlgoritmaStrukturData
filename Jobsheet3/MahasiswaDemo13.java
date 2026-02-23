public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Mahasiswa13[] arrayOfMahasiswa13 = new Mahasiswa13[3];
        arrayOfMahasiswa13[0] = new Mahasiswa13();
        arrayOfMahasiswa13[0].nim = "244107060033";
        arrayOfMahasiswa13[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa13[0].kelas = "SIB-1E";
        arrayOfMahasiswa13[0].ipk = (float) 3.75;

        arrayOfMahasiswa13[1] = new Mahasiswa13();
        arrayOfMahasiswa13[1].nim = "2341720172";
        arrayOfMahasiswa13[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa13[1].kelas = "TI-2A";
        arrayOfMahasiswa13[1].ipk = (float) 3.36;

        arrayOfMahasiswa13[2] = new Mahasiswa13();
        arrayOfMahasiswa13[2].nim = "244107023006";
        arrayOfMahasiswa13[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa13[2].kelas = "TI-2E";
        arrayOfMahasiswa13[2].ipk = (float) 3.80;

        System.out.println("NIM      : " + arrayOfMahasiswa13[0].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa13[0].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa13[0].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa13[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa13[1].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa13[1].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa13[1].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa13[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa13[2].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa13[2].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa13[2].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa13[2].ipk);
        System.out.println("----------------------------------------");

    }
}
