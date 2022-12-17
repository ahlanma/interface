import java.util.Scanner;

public class Pemesanan implements Menu{
    Scanner input = new Scanner(System.in);

    private int jkamar;
    private int tglMasuk;
    private int tglKeluar;
    private int jumPsn;
    private int lamaInap;
    public int hargaKamar = 1000;
    private int kembalian;





    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public int getLamaInap() {
        if (this.tglKeluar > this.tglMasuk){
            return this.tglKeluar - this.tglMasuk;
        }else {
            return this.tglMasuk - this.tglKeluar;
        }

    }

    public int getHargaKamar() {
        return hargaKamar * getLamaInap() * this.jumPsn;
    }

    public int getKembalian() {
        return kembalian - this.getHargaKamar();
    }

    public int pil;
    private String idPetugas;

    @Override
    public void inputData(){
//        System.out.print("Id petugas      : ");
//        idPetugas = input.nextLine();
        System.out.print("Tanggal chek in : ");
        tglMasuk = input.nextInt();
        System.out.print("Tanggal chek out: ");
        tglKeluar = input.nextInt();
        System.out.print("Jumlah kamar    : ");
        jumPsn = input.nextInt();
        System.out.println("Apakah anda ingin lanjut ke pembayaran");
        System.out.print("Jika yes klik [1] batal klik [2]: ");
        pil = input.nextInt();

        if (pil == 1)
        {
            System.out.print("Jumlah bayar   : ");
            kembalian = input.nextInt();
            //System.out.println("berhasil");
        } else if (pil == 2) {
            System.out.println("Tambah pesanan");
        }else {
            System.out.println("input salah");
        }

    }

    @Override
    public void displayData() {

        System.out.println("Tanggal chek in : " + this.tglMasuk);
        System.out.println("Tanggal chek out: " + this.tglKeluar);
        System.out.println("Harga kamar     : " + this.hargaKamar);
        System.out.println("Lama inap       : " + getLamaInap());
        System.out.println("Jumlah kamar    : " + this.jumPsn);
        System.out.println("Jumlah bayar    : "+ this.kembalian);
        System.out.println("Kembalian       : " + this.getKembalian());
        System.out.println("Total harga     : " + this.getHargaKamar());
        System.out.println("");
    }

}


