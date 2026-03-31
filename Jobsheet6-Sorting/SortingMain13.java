public class SortingMain13 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 7, 2, 12 };
        Sorting13 dataUrut1 = new Sorting13(a, a.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan bubblesort (asc) ");
        dataUrut1.tampil();

        int b[] = { 30, 20, 2, 8, 14 };
        Sorting13 dataUrut2 = new Sorting13(b, b.length);

        System.out.println("\nData awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan selection sort (asc) ");
        dataUrut2.tampil();

        int c[] = { 40, 10, 4, 9, 3 };
        Sorting13 dataUrut3 = new Sorting13(c, c.length);

        System.out.println("\nData awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan selection sort (asc) ");
        dataUrut3.tampil();

    }
}
