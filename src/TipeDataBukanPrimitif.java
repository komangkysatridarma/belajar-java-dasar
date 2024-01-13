public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //primitif = mempunyai default value
        //bukan primitif = tidak mempunyai default value/null

        Integer iniInt = 100;
        Long iniLong = 10000L;

        Byte iniByte; //karena Byte ( B dengan kapital) adalah tipe data bukan primitf maka jika di print akan error karena akan null/tidak ada default value
        iniByte = 100;
        iniByte = null;


        System.out.println(iniByte);

        //merubah tipe data primitf ke bukan primitif
        int iniInt1 = 100;
        Integer iniInt2 = iniInt1;

        System.out.println(iniInt2);

        //merubah tipe data yang dari bukan primitif ke primitif, contohnya dari int ke short
        short iniShort = iniInt2.shortValue();
        long iniLong2 = iniInt2.longValue();
        float iniFloat = iniInt2.floatValue();

    }

}
