public class ClassStackSurat {
    classSurat[] stack;
    int top;
    int size;

    public ClassStackSurat(int size) {
        this.size = size;
        stack = new classSurat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Tambah surat
    public void push(classSurat s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh! Surat tidak bisa ditambahkan.");
        }
    }

    // Proses / verifikasi surat (pop)
    public classSurat pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Lihat surat terakhir
    public classSurat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat.");
            return null;
        }
    }

    // Cari berdasarkan nama
    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Ditemukan: " + stack[i]);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}