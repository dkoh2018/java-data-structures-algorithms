public class LinearSearchExample {
//
//
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == target)
                return i;
        }
        System.out.println("We didn't find a value");
        return -1;
    }

    
    public static int linearSearch(String[] array, String target) {   // only needed to change from int to string but not on the loop
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target))
                return i;
        }
        System.out.println("We didn't find the value");
        return -1;
    }


//
//

    public static void main(String[] arg) 
    {        
        String[] fancyCars = new String[8];
        fancyCars[0] = "Ferrari 488 GTB";
        fancyCars[1] = "Lamborghini Aventador";
        fancyCars[2] = "Porsche 911 Carrera";
        fancyCars[3] = "Aston Martin DB11";
        fancyCars[4] = "McLaren 720S";
        fancyCars[5] = "Bugatti Chiron";
        fancyCars[6] = "Rolls-Royce Phantom";
        fancyCars[7] = "Bentley Continental GT";
        
        String[] carNames = {"Tesla Model S", "Mercedes-Benz S-Class", "BMW M3", "Audi R8", "Chevrolet Corvette"};

        int fancyResults = linearSearch(fancyCars, "Rolls-Royce Phantom");
        int results = linearSearch(carNames, "Tesla Model S");

        System.out.println(String.format("%d: %s", fancyResults, fancyCars[fancyResults]));
        System.out.println(String.format("%d: %s", results, carNames[results]));

    }

}
