public class Resepsionis implements Menu{
private String idPetugas;
private String nama;
private String email;
private String noHP;
private String jk;

    @Override
    public void inputData() {
        System.out.print("Masukkan nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        email = input.nextLine();
        System.out.print("Masukkan no HP  : ");
        noHP = input.nextLine();
        System.out.print("Jenis kelamin   : ");
        jk = input.nextLine();

    }

    @Override
    public void displayData() {
        System.out.println("nama   : " + this.nama);
        System.out.println("Jenis kelamin: " + this.jk);
        System.out.println("emaol : " + this.email);
        System.out.println("no HP  : " + this.noHP);


    }
}
