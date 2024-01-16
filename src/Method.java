public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Komang", "Kysa");
        sayHello("Iruma", "Kun");
        sayHello("Artur", "Ram");
        var count = count(1000, 2000);
        System.out.println(count);
        var hitung = hitung(100, "-", 10);
        System.out.println(hitung);
    }

    static void sayHelloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("Hello World 4");
    }

    //method parameter
    static void sayHello(String nama1, String nama2){
        System.out.println("Hello " + nama1 + " " + nama2);
    }

    //method return value
    //yang awalnya void menjadi tipe data yang ingin di hasilkan
    static int count(int barang1, int barang2){
        var total = barang1 + barang2;
        return total;
    };

    static int hitung(int nilai1, String operasi, int nilai2){
        switch (operasi){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            default:
                return 0;
        }
    }

}
