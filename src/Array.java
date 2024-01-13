public class Array {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "Komang";
        arrayString[1] = "Kysa";
        arrayString[2] = "Tri";
        arrayString[3] = "Darma";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);

        //mempersingkat array

        String[] namaNama = {
                "Komang", "Kysa", "Tri", "Darma"
        };

        int[] iniInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayString.length);

        //di java tidak bisa menghapus isi dalam array, paliangan cuma merubah nya menjadi null atau 0
        iniInt[0] = 0;
        namaNama[3] = null;

        //membuat array di dalam array
        String[][] namaNama2 = {
                {"Komang", "Kysa"},
                {"Catur", "Putra"},
                {"Samsul", "Hidayat"},
        };

        System.out.println(namaNama2[1][0]);
        System.out.println(namaNama2[0][1]);

    }

}
