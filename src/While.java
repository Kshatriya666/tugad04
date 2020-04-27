public class While {
    public static void main(String[] args) {
        int bensin = 0;
        int full = 1000;

        System.out.println("Isi Tangki Sekarang : " + bensin + "ml");
        System.out.println("Target pengisian : " + full + "ml");

        for(bensin = 100 ; bensin != full ; bensin = bensin + 100){
            System.out.println("Sedang Mengisi... " + bensin + "ml");
        }

        System.out.println("Tangki bensin selesai terisi dengan total 1 liter / " + bensin + "ml");
        System.out.println("Total Bayar : Rp.8000");
    }
}
