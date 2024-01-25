public class Main { 
    public int binarySearch(int arr[], int target) { 
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (arr[middle] == target)
            return middle;

            if (arr[middle] < target)
                low = middle + 1;
            else 
                high = middle - 1;
        }
        return -1;
    } 

// We will cover how to sort arrays later so I will provide a sorted array

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40, 35, 36, 23 };
        int target = 100;  // Target element to find

     Main variable = new Main();  // Create an instance of Main
        int result = variable.binarySearch(arr, target);  // Call binary search
        System.out.println("Element is present at index: arr["+result+"]");

    }
}