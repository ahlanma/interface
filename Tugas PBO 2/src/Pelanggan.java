
public class Pelanggan implements Menu{



    private String nama;
    private String alamat;
    private String noHp;
    private String Jk;

    public void inputData(){

        System.out.print("Masukkan nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan no HP  : ");
        noHp = input.nextLine();
        System.out.print("Jenis kelamin   : ");
        Jk = input.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("nama   : " + this.nama);
        System.out.println("alamat : " + this.alamat);
        System.out.println("no HP  : " + this.noHp);
        System.out.println("Jenis kelamin: " + this.Jk);
    }
}
