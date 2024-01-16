public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Komang", "Kysa", "Tri", "Darma"
        };

        for(var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOREACH");
        //foreach
        for(var name: names){
            System.out.println(name);
        }
    }
}
