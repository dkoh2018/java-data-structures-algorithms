public class structureExample {
    public class Car 
    {
        private String name;
        private int year;
        private float price;
    
        public Car(String name, int year, float price) {
            this.name = name;
            this.year = year;
            this.price = price;
        }
    
        // Getter for name
        public String getName() {
            return name;
        }
    
        // Setter for name
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter for year
        public int getYear() {
            return year;
        }
    
        // Setter for year
        public void setYear(int year) {
            this.year = year;
        }
    
        // Getter for price
        public float getPrice() {
            return price;
        }
    
        // Setter for price
        public void setPrice(float price) {
            this.price = price;
        }
    }
}
