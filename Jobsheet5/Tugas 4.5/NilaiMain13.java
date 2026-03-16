import java.util.Locale;

public class NilaiMain13 {
    public static void main(String[] args) {
        Nilai13 nilai = new Nilai13();

        int maxUTS = nilai.maxUTS();
        int minUTS = nilai.minUTS();
        double avgUAS = nilai.averageUAS();

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.printf(Locale.US, "Rata-rata nilai UAS: %.3f%n", avgUAS);
    }
}
