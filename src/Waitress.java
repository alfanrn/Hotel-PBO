import java.util.Scanner;
import java.lang.Math; 
public class Waitress extends Menu {
    public int id_order;
    protected int no_kamar;
    public int harga_menu;
    public int jumlah;
    public int Q;
    public int temp;
    private static int min = 25000;
    private static int max = 134000;
    public int[] temp1=new int[100];
    public int getId_order() {
        return id_order;
    }
    public void setId_order(int id_order) {
        this.id_order = id_order;
    }
    public int getNo_kamar() {
        return no_kamar;
    }
    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }
    public static int sum(int... list)//method list untuk menghitung jumlah dari anggota array
    {
       int totalQ = 0;
       for (int i = 0; i < list.length; i++)//perulangan sebanyak length array
       {
          totalQ += list[i];//menambahkan nilai array
       }
       return totalQ;//mengembalikan nilai yang telah dihitung
    }
    Scanner in = new Scanner(System.in);
    final public void order(int id) {
        menu();
        System.out.println("----------------------------------");
        setNo_kamar(id);
        System.out.println("    |  ");
        System.out.print("   [-] Masukan Jumlah Order -> ");Q=in.nextInt();
        for (int i = 0; i < Q; i++) {
            in.nextLine();
            System.out.println("    |  ");
            System.out.print("   [-] Masukan Nama Menu -> ");nama_menu = in.nextLine();
            setNama_menu(nama_menu);
            setId_order(id_order);
            System.out.println("    |  ");
            System.out.print("   [-] Masukan Jumlah -> ");jumlah = in.nextInt();
            System.out.println("    |  ");
            System.out.print("   [-] Masukan Harga -> ");harga_menu = in.nextInt();
            temp = jumlah*harga_menu;
            temp1[i]=temp;//memasukan nilai temp pada anggota array temp1
        }
        id_order=(int)(Math.random()*(max-min+1)+min); 
        setId_order(id_order);
        System.out.println("----------------------------------");
        System.out.println("  [|] ID Order    : "+getId_order());
        System.out.println("  [|] No.Kamar    : "+getNo_kamar());
        System.out.println("  [|] Total       : "+sum(temp1));//memanggil fungsi sum untuk menjumlahkan total harga
        System.out.println("----------------------------------");
        
    }
}
