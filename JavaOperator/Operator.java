public class Operator{
    public static void main (String[] args){
        Integer value = 10+2;
        System.out.println("Jumlah 10 + 2 = " +value);

        Integer value1 = 100;
        Integer value2 = 20;
        System.out.println("Jumlah 100 + 20 = " +(value1+value2));

        Integer value3 = 10-2;
        System.out.println("Jumlah 10 - 2 = " +value3);

        Integer valueKurang1 = 100;
        Integer valueKurang2 = 20;
        System.out.println("Jumlah 100 - 20 = " +(valueKurang1+valueKurang2));
        System.out.println("Nilai " +valueKurang1+ " dikurang " +valueKurang2+ " = " +(valueKurang1-valueKurang2) );

        Integer perbandingan = 10-20;
        System.out.println("Apakah 10 - 20 hasilnya -10 ? " +(perbandingan == -10));
    }
}