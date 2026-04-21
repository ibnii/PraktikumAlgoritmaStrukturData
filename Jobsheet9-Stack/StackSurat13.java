public class StackSurat13 {
    int size, top;
    Surat13[] stack;

    public StackSurat13(int size) {
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat13 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat13 pop() {
        if (!isEmpty()) {
            Surat13 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + stack[i].idSurat + " | Jenis: " + stack[i].jenisIzin + " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}