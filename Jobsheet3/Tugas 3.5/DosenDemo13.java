import java.util.Scanner;

public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen13[] daftarDosen = new Dosen13[jumlahDosen];

        for (int i = 0; i < daftarDosen.length; i++) {
            daftarDosen[i] = new Dosen13("", "", false, 0);
        }

        int nomorInput = 1;
        for (Dosen13 dosen : daftarDosen) {
            System.out.println("\nInput data dosen ke-" + nomorInput);
            dosen.inputData(sc);
            nomorInput++;
        }

        DataDosen13 dataDosen = new DataDosen13();
        dataDosen.dataSemuaDosen(daftarDosen);
        dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        dataDosen.infoDosenPalingTua(daftarDosen);
        dataDosen.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}
