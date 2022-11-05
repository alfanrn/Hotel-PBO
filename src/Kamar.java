public class Kamar extends Pengunjung{
    protected static boolean cek(int kamar) {//fungsi untuk memeriksa ketersidiaan hotel
        boolean kuota;
        if (kamar==1||kamar==4||kamar==8) {//kamar==1||kamar==4||kamar==8 adalah kamar yang tidak tersedia
            kuota = false;//inisiasi nilai boolean kuota
        } else {
            kuota = true;//inisiasi nilai boolean kuota
        }
        return kuota ;//mengembalikan nilai boolean kuota
    }
    public void cek(){
        System.out.println("----------------------------------");
        System.out.println("        Masukan Nomor Kamar");
        System.out.println("----------------------------------");
        System.out.println("  [1-5] Ekonomi --- [6-10] Bisnis");
        System.out.println("           ------------- ");
        no_kamar = in.nextInt();//input no_kamar
        System.out.println("----------------------------------");
        if (cek(no_kamar)==true) {//memanggil fungsi dan nilai boolean kuota dari fungsi akan dipakai disini yang dinyatakn sebagai no_kamar
            System.out.println("  [+] Kamar Tersedia");
        } else {
            System.out.println("  [x] Kamar Tidak Tersedia"); 
        }
        System.out.println("----------------------------------");
    }
}