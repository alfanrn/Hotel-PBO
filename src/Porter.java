import java.util.Scanner;
public class Porter extends Pegawai{
    public int jml_barang;
    protected int id_PKJNG;
    protected int no_kamar;
    public int getJml_barang() {
        return jml_barang;
    }
    public void setJml_barang(int jml_barang) {
        this.jml_barang = jml_barang;
    }
    public int getId_PKJNG() {
        return id_PKJNG;
    }
    public void setId_PKJNG(int id_PKJNG) {
        this.id_PKJNG = id_PKJNG;
    }
    public int getNo_kamar() {
        return no_kamar;
    }
    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }
    Scanner in = new Scanner(System.in);
    final public void order() {
        System.out.println("----------------------------------");
        System.out.print("  [-] Masukan Jumlah Barang -> ");jml_barang=in.nextInt();
        setJml_barang(jml_barang);
        System.out.println("   |  ");
        System.out.print("  [-] Masukan Id Pengunjung -> ");id_PKJNG=in.nextInt();
        System.out.println("   |  ");
        System.out.print("  [-] Masukan No.Kamar      -> ");no_kamar=in.nextInt();
        setNo_kamar(no_kamar);
        System.out.println("----------------------------------");
        System.out.println("   [|] Jumlah Barang     : "+getJml_barang());
        System.out.println("   [|] ID Pengunjung     : "+getId_PKJNG());
        System.out.println("   [|] Masukan No.Kamar  : "+getNo_kamar());
        System.out.println("   [|] ID Pegawai        : "+id_PGWI[0]);//memanggil anggota array id_PGWI ke 0
        System.out.println("   [|] Nama Pegawai      : "+NamaPGWI[0]);//memanggil anggota array NamaPGWI ke 0
        System.out.println("----------------------------------");
    }

}
