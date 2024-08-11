//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class insertionSort {

        void sort (int arr[]){
            int n = arr.length;
            for(int i = 1 ; i < n ; ++i){
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr [j+1] = key;


            }
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 23, 444, 43, 23};

        insertionSort ob = new insertionSort();
        ob.sort(arr);

        System.out.println("Sıralanmış dizi:");
        printArray(arr);

    }
}