public class classSurat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    // Konstruktor kosong
    classSurat() {
    }

    // Konstruktor berparameter
    classSurat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        return "ID: " + idSurat +
        ", Nama: " + namaMahasiswa +
        ", Kelas: " + kelas +
        ", Jenis: " + jenisIzin +
        ", Durasi: " + durasi + " hari";
    }
}