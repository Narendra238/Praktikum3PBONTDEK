public class Mahasiswa extends Manusia{
        private int nim;
        public Mahasiswa(String nama, String alamat) {
            super(nama, alamat);
        }

        public void kelasApa(){
            System.out.println("Saya :"+ super.getNama()+ " " + nim);
        }
        public int getNim() {
            return nim;
        }

        public void setNim(int nim) {
            this.nim = nim;
        }
    }

