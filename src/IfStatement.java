public class IfStatement {
    public static void main(String[] args) {

        int nilai1 = 85;
        int nilai2 = 90;
        int nilai3 = 80;

        if(nilai1 > nilai2 && nilai1 < nilai3){
            System.out.println("B");
        }else if(nilai2 >= nilai1 && nilai2 >= nilai3){
            System.out.println("A");
        }else{
            System.out.println("C");
        }

    }
}
