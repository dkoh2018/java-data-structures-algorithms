public class Main {
    public void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    

    public static void main(String args[]) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        Main instance = new Main();
        instance.bubbleSort(arr);
        System.out.println(arr);
}
}