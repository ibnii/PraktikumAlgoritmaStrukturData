import java.util.Scanner;

class PraktikumPemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas = score(input, "tugas");
        double kuis = score(input, "kuis");
        double uts = score(input, "UTS");
        double uas = score(input, "UAS");

        double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);

        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Huruf\t: " + konversiNilai(nilaiAkhir));
        System.out.println("");
        if (nilaiAkhir > 50) {
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }

        input.close();
    }

    static double score(Scanner sc, String type) {
        double nilai;
        do {
            System.out.print("Masukkan nilai " + type + "\t: ");
            nilai = sc.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai Tidak Valid");
            }

        } while (nilai < 0 || nilai > 100);

        return nilai;
    }

    static String konversiNilai(double n) {
        if (n > 80 && n <= 100) {
            return "A";
        } else if (n > 73) {
            return "B+";
        } else if (n > 65) {
            return "B";
        } else if (n > 60) {
            return "C+";
        } else if (n > 50) {
            return "C";
        } else if (n > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
