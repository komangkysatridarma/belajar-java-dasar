public class SwitchTanpaYield {
    public static void main(String[] args) {

        var nilai = "C";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = ("Selamat Anda mendapatkan nilai A");
            case "B", "C" -> ucapan = ("Selamat Anda mendapatkan nilai B");
            case "D" -> ucapan = ("Maaf Anda mendapatkan nilai D");
            default ->  ucapan = ("Dongo");
        }
        System.out.println(ucapan);

    }
}
