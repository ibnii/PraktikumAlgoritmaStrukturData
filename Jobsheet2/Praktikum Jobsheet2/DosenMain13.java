public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 d1 = new Dosen13();
        d1.setStatusAktif(false);
        System.out.println("Masa Kerja\t\t: " + d1.hitungMasaKerja(2026)+" tahun");
        d1.ubahKeahlian("Otomotif");
        d1.tampilinInformasi();

        System.out.println();

        Dosen13 d2 = new Dosen13("D02", "Ibennn", "Farmasi", false, 2006);
        d2.setStatusAktif(true);
        System.out.println("Masa Kerja\t\t: " + d2.hitungMasaKerja(2026)+" tahun");
        d2.ubahKeahlian("Kedokteran");
        d2.tampilinInformasi();
    }
}
