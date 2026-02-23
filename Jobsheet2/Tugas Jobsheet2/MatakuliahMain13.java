public class MatakuliahMain13 {
    public static void main(String[] args) {
        Matakuliah13 mt1 = new Matakuliah13();
        mt1.tampilinInformasi();
        mt1.ubahJam(25);
        mt1.tambahJam(5);
        mt1.kurangJam(50);
        mt1.kurangJam(7);

        System.out.println();
        
        Matakuliah13 mt2 = new Matakuliah13("ABCDE","Sains",7,10);
        mt2.tampilinInformasi();
        mt2.ubahJam(12);
        mt2.tambahJam(3);
        mt2.kurangJam(25);
        mt2.kurangJam(3);

    }
}
