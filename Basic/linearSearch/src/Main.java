//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class linearSearch{

        public static int LinearSearch(int[] arr, int aranan){
            for (int i = 0 ;i< arr.length; i++){
                if(arr[i] == aranan){
                    return i;
                }
            }
            return -1;
        }

    }
    public static void main(String[] args) {

        int arr[] = {1,2,42,34,54,2,54,76,87};

        int aranan = 2;

        int sonuc = linearSearch.LinearSearch(arr, aranan);

        if (sonuc == -1) {
            System.out.println("Eleman dizide bulunamadı.");
        } else {
            System.out.println("Eleman şu indekste bulundu: " + sonuc);
        }




    }
}