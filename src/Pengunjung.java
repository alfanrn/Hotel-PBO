
import java.util.Scanner;
import java.lang.Math;//paket dalam java yang dalam kasus ini digunakan untuk mengeluarkan nilai int random
public class Pengunjung extends Hotel{
    public static String Nama_PKJNG;
    protected int id_PKJNG;
    private int no_hp;
    protected int no_kamar;
    protected String tipe_kamar;
    public static int harga;
    protected static String tgl_checkIn;
    protected static String tgl_checkout;
    private static int min = 25000;//batas maksimal int random
    private static int max = 134000; //batas minimal int random
    private static int id_Bill;
    private int lama;
    public int getLama() {
        return lama;
    }
    public void setLama(int lama) {
        this.lama = lama;
    }
    public String getNama_PKJNG() {
        return Nama_PKJNG;
    }
    public void setNama_PKJNG(String nama_PKJNG) {
        Nama_PKJNG = nama_PKJNG;
    }
    public int getId_PKJNG() {
        return id_PKJNG;
    }
    public void setId_PKJNG(int id_PKJNG) {
        this.id_PKJNG = id_PKJNG;
    }
    public int getNo_hp() {
        return no_hp;
    }
    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }
    public int getNo_kamar() {
        return no_kamar;
    }
    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }
    public String getTipe_kamar() {
        return tipe_kamar;
    }
    public void setTipe_kamar(String tipe_kamar) {
        this.tipe_kamar = tipe_kamar;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        Pengunjung.harga = harga;
    }
    public String getTgl_checkIn() {
        return tgl_checkIn;
    }
    public void setTgl_checkIn(String tgl_checkIn) {
        Pengunjung.tgl_checkIn = tgl_checkIn;
    }
    public String getTgl_checkout() {
        return tgl_checkout;
    }
    public void setTgl_checkout(String tgl_checkout) {
        Pengunjung.tgl_checkout = tgl_checkout;
    }
    public int getId_Bill() {
        return id_Bill;
    }
    public void setId_Bill(int id_Bill) {
        Pengunjung.id_Bill = id_Bill;
    }
    final void hotel(String nama) {   //inisiasi method final hotel yang tidak akan berubah
        System.out.println("  Terima Kasih "+nama+" Telah Berkunjung!!");
    }
    Scanner in = new Scanner(System.in);
    void Booking(){//method Booking
        System.out.println("----------------------------------");
        System.out.println("------------- Booking ------------");
        System.out.println("----------------------------------");
        System.out.print("  [-] Nama -> ");Nama_PKJNG = in.nextLine();
        setNama_PKJNG(Nama_PKJNG);
        System.out.println("   | ");
        System.out.print("  [-] No.Hp -> ");no_hp = in.nextInt();
        setNo_hp(no_hp);
        in.nextLine();
        System.out.println("   | ");
        System.out.println("  [-] Tipe Kamar : ");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("  [1-5] Ekonomi -> 2 Orang, Charge Food     |   [6-10] Bisnis -> 2 Orang, Free Food + Free Swimming Pool");
        System.out.println("    Rp 300K/Malam                          |     Rp 800K/Malam");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.print("  [-] Ekonomi/Bisnis -> ");tipe_kamar = in.nextLine();
        setTipe_kamar(tipe_kamar.toUpperCase());//mengubah variabel tipe_kamar menjadi huruf kapital
        System.out.println("   | ");
        if (tipe_kamar.equals("EKONOMI")){//perbandingan kondisi variabel tipe kamar untuk menentukan proses mana yang akan dijalankan
            System.out.print("  [-] No.Kamar 1-5 -> ");
        }else{
            System.out.print("  [-] No.Kamar 6-10 -> ");
        }
        if (tipe_kamar.equals("EKONOMI")) {
            setHarga(300000);
        } else {
            setHarga(800000);
        }
        no_kamar = in.nextInt();
        setNo_kamar(no_kamar);
        in.nextLine();
        System.out.println("   | ");
        System.out.println("  [-] Tanggal Check In Tersedia");
        System.out.println("---------------------------------------");
        System.out.println("    21 Oktober 2022-22 Desember 2022");
        System.out.println("---------------------------------------");
        System.out.print("    Masukan Tanggal Check-In -> ");tgl_checkIn = in.nextLine();
        setTgl_checkIn(tgl_checkIn);
        System.out.println("   | ");
        System.out.print("  [-] Lama Menginap -> ");lama = in.nextInt();
        setLama(lama);
        harga=harga*lama;//mengalikan variable harga dengan lama
        in.nextLine();
        bill();//memanggil method bill
    }
    static void Check(String tglI,String nama) {//overloading
        System.out.println("----------------------------------");
        System.out.println("   Terima Kasih "+nama);
        System.out.println("   Anda Telah Check In Pada "+tglI);
        System.out.println("----------------------------------");
    }
    static void Check(String tglO) {//overloading
        System.out.println("----------------------------------");
        System.out.println("       Terima Kasih\n  Anda Berhasil Check Out Pada "+tglO);
        System.out.println("----------------------------------");
      }
      public int bill() {//method bill
        id_Bill=(int)(Math.random()*(max-min+1)+min);//set variable untuk mengeluarkan nilai random
        System.out.println("      "+Nama_hotel);
        System.out.println("----------------------------------");
        System.out.println(" [|] ID Bill        : "+getId_Bill());
        System.out.println(" [|] Nama           : "+getNama_PKJNG());
        System.out.println(" [|] No.HP          : "+getNo_hp());
        System.out.println(" [|] No.Kamar       : "+getNo_kamar());
        System.out.println(" [|] Tipe Kamar     : "+getTipe_kamar());
        System.out.println(" [|] Check In       : "+getTgl_checkIn());
        System.out.println(" [|] Lama Menginap  : "+getLama());
        System.out.println(" [|] Total          : "+getHarga());
        System.out.println("-----------------------------------");
        return id_Bill;
      }
}
