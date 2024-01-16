public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {
                70,80, 65, 75, 50
        };
        sayCongrats("Komang", values);

        //variabel argument
        sayCongratsArgument("Catur", 80,50,90,100);

    }

    //tanpa variabel argument
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for(var value: values){
            total += value;
        }

        var finalNilai = total / values.length;

        if(finalNilai >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        }else{
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }

    //variabel argument
    static void sayCongratsArgument(String name, int... values){
        var total = 0;
        for(var value: values){
            total += value;
        }

        var finalNilai = total / values.length;

        if(finalNilai >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        }else{
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
