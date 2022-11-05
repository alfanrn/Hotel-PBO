import java.util.Scanner;//paket dalam java yang memungkinkan input dinamis
public class Main {
    Main(){//sampai line 21 adalah konstruktor
        System.out.println("TERIMA KASIH TELAH BERKUNJUNG!!!\nKAMI TUNGGU KEDATNGAN ANDA KEMBALI");
    }
    Main(int a){
        System.out.println("----------------------------------");
        for (int i = 0; i < a; i++) {
            System.out.print("--------------- ");
            System.out.println("A ----------------");
        }
        System.out.println("----------------------------------");
    }
    Main(int a, String b){
        System.out.println("----------------------------------");
        for (int i = 0; i < a; i++) {
                System.out.println("| A | ---------------------- | A |");
        }
        System.out.println("----------- "+b+" -----------");
        System.out.println("----------------------------------");
    }
    protected static String tglCO;
    protected static int kamar;
    private static Hotel h = new Hotel();//sampai line 29 adalah membuat objek untuk class yang akan dipakai di main
    protected static Pengunjung p = new Pengunjung();
    protected static Kamar k = new Kamar();
    private static Porter pr = new Porter();
    private static Waitress w = new Waitress();
    private static Bill b = new Bill();
    public static void main(String[] args) {
        int key;//perulangan do...while agar ketika pilihan tidak keluar/99 program akan kembali ke menu
        do{
        Scanner in = new Scanner(System.in);//fungsi untuk input
        Main header = new Main(3);//inisiasi konstruktor
        h.hotel();//memanggil final void di class hotel
        System.out.println("----------------------------------");
        System.out.println("-------------- Menu --------------");
        System.out.println("----------------------------------");
        System.out.println("   [1]  Cek Kuota Kamar.");
        System.out.println("----------------------------------");
        System.out.println("   [2]  Booking Kamar.");
        System.out.println("----------------------------------");
        System.out.println("   [3]  Check In.");
        System.out.println("----------------------------------");
        System.out.println("   [4]  Order Porter.");
        System.out.println("----------------------------------");
        System.out.println("   [5]  Order Service Menu.");
        System.out.println("----------------------------------");
        System.out.println("   [6]  Check Out.");
        System.out.println("----------------------------------");
        System.out.println("   [7]  Bill.");
        System.out.println("----------------------------------");
        System.out.println("   [99] Keluar.");
        System.out.println("----------------------------------");
        System.out.println("  *Mohon cek ketersedian kamar\n   terlebih dahulu");
        System.out.println("----------------------------------");
        System.out.print("  Masukan Pilihan -> ");key = in.nextInt();//input key unutk switch case
        switch (key) {
                    case 1:
                        k.cek();//memanggil method di class kamar
                        break;
                    case 2:
                        p.Booking();//memanggil method di class pengunjung
                        break;
                    case 3:
                        Pengunjung.Check(Pengunjung.tgl_checkIn,Pengunjung.Nama_PKJNG);//memanggil method overloading
                        break;
                    case 4:
                        pr.order();//memanggil method di class porter
                        break;
                    case 5:
                    System.out.print("Masukan No.Kamar -> ");kamar=in.nextInt();
                        w.order(kamar);//memanggil method di class waitress
                        break;
                    case 6:
                        in.nextLine();//agar input string bisa dijalankan karena sebelumnya telah diinputkan int
                        System.out.print("Masukan Tanggal Check Out  -> ");tglCO=in.nextLine();
                        Pengunjung.Check(tglCO);//memanggil method overloading
                        p.setTgl_checkout(tglCO);//inisiasi variable Tgl_checkout di class pengunjung
                        break;
                    case 7:
                        b.bill();//memanggil method di class bill
                        break;
                    case 99:
                        Main footer = new Main(1);//inisiasi konstruktor
                        Main foot = new Main();//inisiasi konstruktor
                        Main footer2 = new Main(3,h.Nama_hotel);//inisiasi konstruktor
                        break;
                    default: //kondisi jika input tidak sesuai
                        System.out.println("Pilihan Tidak Tersedia!!!");
                        break;
            }
        }while (key != 99);//menghentiikan perulangan
    }
}