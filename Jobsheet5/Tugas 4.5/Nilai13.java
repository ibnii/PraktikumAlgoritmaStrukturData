public class Nilai13 {
    private static class Mahasiswa {
        String nama;
        String nim;
        int tahunMasuk;
        int uts;
        int uas;

        Mahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas) {
            this.nama = nama;
            this.nim = nim;
            this.tahunMasuk = tahunMasuk;
            this.uts = uts;
            this.uas = uas;
        }
    }

    private final Mahasiswa[] data;

    public Nilai13() {
        data = new Mahasiswa[] {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };
    }
    public int maxUTS() {
        return maxUTS(0, data.length - 1);
    }

    private int maxUTS(int left, int right) {
        if (left == right) {
            return data[left].uts;
        }
        int mid = (left + right) / 2;
        int leftMax = maxUTS(left, mid);
        int rightMax = maxUTS(mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public int minUTS() {
        return minUTS(0, data.length - 1);
    }

    private int minUTS(int left, int right) {
        if (left == right) {
            return data[left].uts;
        }
        int mid = (left + right) / 2;
        int leftMin = minUTS(left, mid);
        int rightMin = minUTS(mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public double averageUAS() {
        int sum = 0;
        for (Mahasiswa m : data) {
            sum += m.uas;
        }
        return (double) sum / data.length;
    }
}
