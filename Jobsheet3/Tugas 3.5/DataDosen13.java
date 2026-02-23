public class DataDosen13 {
    void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        int no = 1;
        for (Dosen13 dosen : arrayOfDosen) {
            System.out.println("Dosen ke-" + no);
            dosen.cetakInfo();
            System.out.println();
            no++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataPria = jumlahPria == 0 ? 0 : (double) totalUsiaPria / jumlahPria;
        double rerataWanita = jumlahWanita == 0 ? 0 : (double) totalUsiaWanita / jumlahWanita;

        System.out.println("=== Rerata Usia Dosen Per Jenis Kelamin ===");
        System.out.printf("Pria   : %.2f tahun%n", rerataPria);
        System.out.printf("Wanita : %.2f tahun%n", rerataWanita);
    }

    void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen kosong.");
            return;
        }

        Dosen13 dosenPalingTua = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen;
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        dosenPalingTua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen kosong.");
            return;
        }

        Dosen13 dosenPalingMuda = arrayOfDosen[0];
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen;
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        dosenPalingMuda.cetakInfo();
    }
}
