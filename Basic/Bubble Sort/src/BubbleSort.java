public class BubbleSort {
    // Bubble Sort Algoritması
    public static void bubleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for (int i = 0 ; i< n - 1 ; i++ ){
            swapped = false;

            for (int j = 0; j < n -i - 1; j++  ){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1 ];
                    arr[j + 1] =temp;
                    swapped =true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr){
        //Diziyi Yazdırmak İçin Kullanılan Yardımcı Fonksyon
        for (int i : arr){
            System.out.println(i +"");
        }
    }

    public static void main(String[] args) {
        // Dizi
        int[] arr= {12,53,56,32,6,7,32,1,12};
        System.out.println("---sıralanmadan önceki dizi---");
        printArray(arr);
        //Bubble Sort Kullanarak Diziyi Sırala
        bubleSort(arr);

        System.out.println("---Sralandıktan sonraki dizi---");
        printArray(arr);


    }

}