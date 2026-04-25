import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassStackSurat stack = new ClassStackSurat(5);

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    classSurat s = new classSurat(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    classSurat proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses: " + proses);
                    }
                    break;

                case 3:
                    classSurat lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir: " + lihat);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}