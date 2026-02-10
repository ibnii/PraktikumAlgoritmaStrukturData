import java.util.Scanner;

public class PraktikumArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah MK: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        int[][] nilai = new int[jumlahMK][2];
        String[] namaMK = new String[jumlahMK];
        inputNilai(nilai, sc, namaMK);

        tampilkanNilai(nilai, namaMK);

    }

    static void inputNilai(int[][] nilai, Scanner sc, String[] namaMK) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan nama MK-" + (i + 1) + "\t\t: ");
            namaMK[i] = sc.nextLine();

            System.out.print("Masukkan nilai MK-" + (i + 1) + "\t\t: ");
            nilai[i][0] = sc.nextInt();

            System.out.print("Masukkan bobot SKS MK-" + (i + 1) + "\t\t: ");
            nilai[i][1] = sc.nextInt();

            System.out.println();
            sc.nextLine();
        }
    }

    static void tampilkanNilai(int[][] Nilai, String[] namaMK) {
        int tempBobot2 = 0, tempbobot = 0;
        System.out.println("\n===Nilai KULIAH ===");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-30s | %-15s | %-15s | %-15s | %-15s |\n", "Mata Kuliah", "Nilai", "Bobot SKS",
                "Nilai huruf", "Bobot Nilai");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < Nilai.length; i++) {
            System.out.printf("| %-30s | %-15s | %-15s | %-15s | %-15s |\n",
                    namaMK[i],  // Nama MK
                    Nilai[i][0], // Nilai
                    Nilai[i][1], // BOBOT SKS
                    konversiNilai(Nilai[i][0]), //Nilai Huruf
                    konversiNilai2(konversiNilai(Nilai[i][0])) //bobot nilai

            );
            tempbobot += Nilai[i][1];
            tempBobot2 += (Nilai[i][1] * konversiNilai2(konversiNilai(Nilai[i][0])));
        }
        System.out.println("---------------------------------------------------------------------");
        double ip = tempBobot2 / tempbobot;
        System.out.println("IP\t: " + ip);
    }
    static String konversiNilai(int n) {
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
    static double konversiNilai2(String n) {
        if (n.equals("A")) {
            return 4;
        }else if (n.equals("B+")) {
            return 3.5;
        }else if (n.equals("B")) {
            return 3;
        }else if (n.equals("C+")) {
            return 2.5;
        }else if (n.equals("C")) {
            return 2;
        }else if (n.equals("D")) {
            return 1.5;
        }else{
            return 1;
        }
    }

}