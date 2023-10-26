import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//
//        Mahasiswa mahasiswa = new Mahasiswa("Narendra","Cilacap");
////        mahasiswa.setNim(18238);
//        System.out.println("Masukkan NIM :");
//        mahasiswa.setNim(input.nextInt());
//        mahasiswa.kelasApa();
        Persegi persegi = new Persegi(0,0);//Persegi
        System.out.println("Persegi :");
        System.out.println("Masukkan Sisi :");
        persegi.setP(input.nextDouble());
        System.out.println("Luas Persegi : "+persegi.Luas());
        System.out.println("Keliling Persegi : "+persegi.Keliling());

        lingkaran lingkaran = new lingkaran(0,0);//lingkaran
        System.out.println("Lingkaran :");
        System.out.println("Masukkan Jari-jari :");
        lingkaran.setL(input.nextDouble());
        System.out.println("Luas Lingkaran : "+lingkaran.Luas());
        System.out.println("Keliling Lingkaran : "+lingkaran.Keliling());
    }
}