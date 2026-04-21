public class StackTugasMahasiswa13 {
    int size, top;
    Mahasiswa13[] stack;

    StackTugasMahasiswa13(int size) {
        this.size = size;
        stack = new Mahasiswa13[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa13 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa13 pop() {
        if (!isEmpty()) {
            Mahasiswa13 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        int p = top;
        for (int a = 0; p >= a; p--) {
            System.out.println(this.stack[p].nama + "\t" + stack[p].nim + "\t" + stack[p].kelas);
        }
        System.out.println("");
    }

    Mahasiswa13 lihatAwal() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    void lihatSize(){
        System.out.println("Total Data\t: " + (top+1));
    }
}
