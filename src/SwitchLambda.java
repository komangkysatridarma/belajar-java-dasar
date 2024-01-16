public class SwitchLambda {
    public static void main(String[] args) {

        var nilai = "D";

        switch (nilai) {
            case "A" -> System.out.println("Selamat Anda mendapatkan nilai A");
            case "B", "C" -> System.out.println("Selamat Anda mendapatkan nilai B");
            case "D" -> System.out.println("Maaf Anda mendapatkan nilai D");
            default -> {
                System.out.println("Dongo");
            }

        }

    }
}
