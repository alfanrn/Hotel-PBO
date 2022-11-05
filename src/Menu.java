public class Menu {
    public String nama_menu;
    public int[] harga={20000,70000,50000,35000,7000,40000};//inisiasi variable array int
    public String getNama_menu() {
        return nama_menu;
    }
    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }
    public final void menu(){
        System.out.println("Nasi Goreng Udang\t  Kepiting Sambal Padang\t Cumi Goreng\t          Udang Goreng\t          Ice Tea\t  Udang Sambal Padang");
        for (int i = 0; i < harga.length; i++) {//mengeluarkan nilai pada array harga
            System.out.print("     "+harga[i]+" \t\t\t ");
        }
    }

}
