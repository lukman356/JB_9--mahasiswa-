class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.kelas = "";
        this.nilai = -1;
    }

    Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    Mahasiswa(String nama, String nim, String kelas, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = nilai;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return nama + "\t" + nim + "\t" + kelas + "\t" + nilai;
    }
}

class StackTugasMahasiswa {
    Mahasiswa[] stack;
    int size;
    int top;

    StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Stack penuh. Tidak dapat menambahkan mahasiswa.");
        } else {
            stack[++top] = mhs;
        }
    }

    Mahasiswa pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak ada mahasiswa untuk di-pop.");
            return null;
        }
        Mahasiswa hasil = stack[top];
        stack[top--] = null;
        return hasil;
    }

    Mahasiswa peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak ada mahasiswa di atas.");
            return null;
        }
        return stack[top];
    }

    Mahasiswa peekBottom() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak ada mahasiswa di bawah.");
            return null;
        }
        return stack[0];
    }

    int countTugas() {
        return top + 1;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
