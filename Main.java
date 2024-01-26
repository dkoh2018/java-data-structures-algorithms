public class Main {
    
    // Sort method
    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    // Print method
    static void PrintArray(int arr[]) {
        System.out.print("[");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //Driver code
    public static void main(String args[]) {
        int[] arr = {47, 12, 85, 32, 79, 58, 91, 21, 43, 67, 13, 28, 56, 39, 74};

        Main instance = new Main();
        instance.sort(arr);
        PrintArray(arr);
    }
}