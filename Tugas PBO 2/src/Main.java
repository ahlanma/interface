import java.util.Scanner;

public class Main {


    public static void cetakMenu() {
        System.out.println(" << WOLCOME to OYO >>");
        System.out.println("Menu :");
        System.out.println("[1]. Input Pemesanan");
        System.out.println("[2]. Display Pemesanan");
        System.out.println("[3]. Exit");
    }

    public static boolean main(String[] args) {
        Login lgn = new Login();
        Pelanggan pelgn = new Pelanggan();
        Vip vip = new Vip();
        Pemesanan pesanan = new Pemesanan();
        Pembayaran pembayaran = new Pembayaran();
        Scanner input = new Scanner(System.in);

        int pilih;
        boolean pil = false;
        int i = 1;
        int salah = 3;
        while (i <= 3) {
            System.out.print("Username : ");
            String usernama = input.nextLine();
            lgn.setUserName(usernama);

            System.out.print("Password : ");
            String sandi = input.nextLine();
            lgn.setPassword(sandi);

            if (lgn.getUserName().equals("mhs") && lgn.getPassword().equals("mhs")) {
                System.out.println("Login succes");
                break;

            } else {
                System.out.println("Login gagal");
                salah++;
                i++;
                if (i == 3) {
                    System.out.println("Anda sudah 3x mencoba maaf anda keluar ");
                    System.exit(0);

                }
            }
        }

        while (true) {
            cetakMenu();
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:

                    //Standart standart = new Standart();

                    System.out.println("+------------------------------+");
                    System.out.println("| No | Jenis Kamar |  Harga    |");
                    System.out.println("+------------------------------+");
                    System.out.println("| 1  | VIP        | 1000k /mlm |");
                    System.out.println("| 2  | Standar    | 500k /mlm  |");
                    System.out.println("+------------------------------+");
                    System.out.println("");
                    System.out.print("Pilih kamar : ");
                    pilih = input.nextInt();

                    switch (pilih) {
                        case 1:
                            pelgn.inputData();
                            pesanan.inputData();
                            pembayaran.inputData();
                            vip.inputPemesanan();
                            //vip.display();
                            //pesanan.transaksi();

                            break;

//                    case 2:
//                        System.out.print("Jumlah pesanan : ");
//                        jumPsn = input.nextInt();
//                        standart.setJumPesanan(jumPsn);
//                        standart.display();
//                        break;
                        default:
                            System.out.println("Errorr!!");
                            break;

                    }


                    break;
                case 2:

                    pelgn.displayData();
                    pembayaran.displayData();
                    pesanan.displayData();
                    System.out.println("Apakah anda ingin lanjut :");
                    System.out.print("Jika yes klik [1] batal klik [2]: ");
                    pilih = input.nextInt();

//                    if (pil == true){
//                        cetakMenu();
//
//                    }else {
//                        System.exit(0);
//                    }
//                    try {
//                        return true;
//                    }catch (E)


                    break;
                case 3:

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Error!!!");
            }

        }
    }
}
