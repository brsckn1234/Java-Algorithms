//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public  class SelectionSort{
        public static void selectionSort(int[] arr){
             int n = arr.length;

             for (int i = 0; i < n - 1  ; i++){
                 int minIdx = i;


                 for (int j = i + 1; j < n; j++ ){
                     if (arr[j] < arr[minIdx]){
                         minIdx = j;
                     }
                 }
                 int temp = arr[minIdx];
                 arr[minIdx] = arr[i];
                 arr[i] = temp;

             }

        }
    }

    public static void printArray(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n;i++){
            System.out.println(arr[i]+ "");

        }

    }

    public static void main(String[] args) {

        int[] arr = {56,43,55,757,76,5,3,};
        System.out.println("Sıralanmamış dizi");
        printArray(arr);

        SelectionSort.selectionSort(arr);

        System.out.println( "sıralanmış dizi");
        printArray(arr);


    }
}
