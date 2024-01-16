public class SwitchYield {
    public static void main(String[] args) {

        var nilai = "C";
        String ucapan = switch (nilai) {
            case "A" :
                yield "Selamat Anda mendapatkan nilai A";
            case "B":
            case "C":
                yield "Selamat Anda mendapatkan nilai B";
            case "D":
                yield "Maaf Anda mendapatkan nilai D";
            default :
                yield "Dongo";
        };

        System.out.println(ucapan);

    }

}
