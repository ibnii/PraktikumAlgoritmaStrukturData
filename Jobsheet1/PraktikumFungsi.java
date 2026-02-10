import java.lang.reflect.Array;
import java.util.Arrays;

public class PraktikumFungsi {
    public static void main(String[] args) {
        int[][] RoyalGarden = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] pendapatan = pendapatan(RoyalGarden);
        for (int i = 0; i < pendapatan.length; i++) {
            String keterangan = (pendapatan[i] > 1_500_000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("Pendaptan Cabang " + (i+1) + "\t: " + pendapatan[i] + "\t: " + keterangan);
        }
    }

    static int[] pendapatan(int[][] RoyalGarden){
        int[] totalPerCabang = new int[RoyalGarden.length];
        for (int i = 0; i < RoyalGarden.length; i++) {
            int totalTemp = 0;
            for (int j = 0; j < RoyalGarden[i].length; j++) {
                if (j == 0) {
                    totalTemp += (RoyalGarden[i][0] * 75_000);
                }else if (j == 1) {
                    totalTemp += (RoyalGarden[i][1] * 50_000);
                }else if (j == 2) {
                    totalTemp += (RoyalGarden[i][2] * 60_000);
                }else if (j == 3) {
                    totalTemp += (RoyalGarden[i][3] * 10_000);
                }
            }
            totalPerCabang[i] += totalTemp;
        }
        return totalPerCabang;
    }
}
