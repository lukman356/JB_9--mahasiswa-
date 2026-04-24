import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Hitung Jumlah Tugas");
            System.out.println("7. Konversi Desimal ke Biner");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas " + nama + " berhasil dikumpulkan");
                    break;

                case 2:
                    Mahasiswa dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.println("Nilai tugas " + dinilai.nama + " = " + nilai);
                        String binerNilai = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai dalam biner: " + binerNilai);
                    }
                    break;

                case 3:
                    Mahasiswa lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa lihatBottom = stack.peekBottom();
                    if (lihatBottom != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + lihatBottom.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.countTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;

                case 7:
                    System.out.print("Masukkan angka desimal: ");
                    int desimal = scan.nextInt();
                    String biner = stack.konversiDesimalKeBiner(desimal);
                    System.out.println("Hasil konversi desimal " + desimal + " ke biner: " + biner);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih >= 0 && pilih <= 7 && pilih != 0);
    }
}