public class TugasMahasiswa {
    Mahasiswa[] stack;
    int top;
    int size;

    // Konstruktor
    public TugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    // Cek penuh
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Cek kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Pop
    public Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Peek
    public Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Peek bottom (tugas pertama yang dikumpulkan)
    public Mahasiswa peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Hitung jumlah tugas yang dikumpulkan
    public int countTugas() {
        return top + 1;
    }

    // Print semua data
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }

    // Konversi desimal ke biner
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi stack = new StackKonversi();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

class StackKonversi {
    int[] stack;
    int top;
    int size;

    StackKonversi() {
        this.size = 100;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int nilai) {
        if (!isFull()) {
            stack[++top] = nilai;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return -1;
    }
}