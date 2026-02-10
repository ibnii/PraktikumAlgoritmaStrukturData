import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] Plat = {'A','B','C','D','E','F','G','H','L','N','T'};
        char[][] Kota = {
                { 'B', 'A', 'N', 'T', 'E', 'N'},
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                { 'B', 'O', 'G', 'O', 'R'},
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                { 'M', 'A', 'L', 'A', 'N', 'G'},
                { 'T', 'E', 'G', 'A', 'L'}
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Plat: ");
        char platInput = sc.next().charAt(0);
        int index = searchIndex(Plat, platInput);
        printKotabyIndex(index, Kota);
    }
    static int searchIndex(char[] plat, char platInput){
        int index = 0;
        for (int i = 0; i < plat.length; i++) {
            if (plat[i] == platInput) {
                index = i;
            }
        }
        return index;
    }
    static void printKotabyIndex(int index, char[][] kota){
        for (int i = 0; i < kota.length; i++) {
            for (int j = 0; j < kota[i].length; j++) {
                if (index != i) {
                    continue;
                }
                System.out.print(kota[i][j]);
            }
        }
    }
}
