public class Countinue {
    public static void main(String[] args) {

        for(int nilai = 1; nilai <= 100; nilai++){
            if(nilai % 2 == 0){
                continue;
            }
            System.out.println("Perulangan " + nilai);
        }

    }
}
