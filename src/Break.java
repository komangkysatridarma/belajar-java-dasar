public class Break {
    public static void main(String[] args) {

        var nilai = 1;

        while(true) {
            System.out.println("Perulangan " + nilai);
            nilai++;

            if (nilai > 10) {
                break;
            }
        }

    }
}
