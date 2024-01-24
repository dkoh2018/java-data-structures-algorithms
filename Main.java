class ArrayExample {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];

        int i = 0;
        while (i < Array.length) {
            Array[i] = (i+1) * 100;
            System.out.println("Element at index "+i+": "+Array[i]);
            i++;
}
    }
}