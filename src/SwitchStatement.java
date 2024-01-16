public class SwitchStatement {
    public static void main(String[] args) {

        String nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Selamat Anda mendapatkan nilai A");
                break;
            case "B":
            case "C":
                System.out.println("Selamat Anda mendapatkan nilai B");
                break;
            case "D":
                System.out.println("Maaf Anda mendaptkan nilai D");
                break;
            default:
                System.out.println("Dongo");

        }

    }
}
