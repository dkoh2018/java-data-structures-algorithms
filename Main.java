public class Main { 
    // Linear search method (int arr[] -> input array, int x -> target value)
    public static int linearSearch(int arr[], int x) { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == x) 
                return i; 
        } 
        return -1; // Return -1 if nothing
    } 

    // Driver code 
    public static void main(String args[]) { 
        int arr[] = { 2, 3, 4, 10, 40 }; 

        int x = 10; // Let's look for 10
    
        // Ask your linearSearch function and fill in the correct arguments to find the target
        int result = linearSearch(arr, x); 
        System.out.println("Product found at array["+result+"]"); 
    }
}
