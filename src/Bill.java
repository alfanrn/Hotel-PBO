 
public class Bill extends Pengunjung{ //pewarisan dari class pengunjung 
    protected float total;
    public String feedback;
    public float getTotal() {//sampai line 16 adalah setter getter
        return total;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    Pengunjung p = new Pengunjung();
    public int bill() {
        System.out.println("----------------------------------");
        System.out.print("   [-] Feedback -> ");feedback = in.nextLine();
        setFeedback(feedback);//inisiasi variable feedback
        System.out.println("    |");
        System.out.print("   [-] Masukan Tip -> ");total = in.nextFloat();
        setTotal(total);//inisiasi variable total
        p.hotel(Nama_PKJNG);//Nama_PKJNG didapat dari class pengunjung, untuk p.hotel didapat dari class hotel melalui chain dari class pengunjung
        System.out.println("----------------------------------");
        System.out.println("   [-] ID Bill   : "+getId_Bill());//didapat dari class pengunjung -> memanggil variable Id_bill
        System.out.println("   [-] Nama      : "+getNama_PKJNG());//didapat dari class pengunjung -> memanggil variable Nama_PKJNG
        System.out.println("   [-] Check Out : "+getTgl_checkout());//didapat dari class pengunjung -> memanggil variable Tgl_checkout
        System.out.println("   [-] Feedback  : "+getFeedback());//memanggil variable Feedback
        System.out.println("   [-] Tip       : "+getTotal());//memanggil variable Total
        System.out.println("   [-] Total     : "+getHarga());//didapat dari class pengunjung -> memanggil variable Id_bill
        System.out.println("----------------------------------");
        return 0;//mengembalikan nilai 0
      }
}
