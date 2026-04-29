package ClassObjectPrograms;

public class LapTopBrands 
{      
	public static void main(String[] args) {
       Laptop L1 = new Laptop("Victus", "HP", 512, 100, 62000);
        L1.TurnOn();
        L1.DisplaySpecs();
        L1.UpdateRam();
        L1.TurnOff();
    }

       static class Laptop
       {
        public String Brand;
        public String Model;
        public int StorageCapacity;
        public int Battery;
        public int Price;

        
        public Laptop(String Brand, String Model, int StorageCapacity, int Battery, int Price) {
            this.Brand = Brand;
            this.Model = Model;
            this.StorageCapacity = StorageCapacity;
            this.Battery = Battery;
            this.Price = Price;
        }

        public void TurnOn() {
            System.out.println(Brand + " " + Model + " is now ON.");
        }

        public void TurnOff() {
            System.out.println(Brand + " " + Model + " is now OFF.");
        }

        public void UpdateRam() {
            System.out.println("RAM updated successfully for " + Brand + " " + Model + ".");
        }

        public void DisplaySpecs() {
            System.out.println("Laptop Specifications:");
            System.out.println("Brand: " + Brand);
            System.out.println("Model: " + Model);
            System.out.println("Storage Capacity: " + StorageCapacity + " GB");
            System.out.println("Battery: " + Battery + "%");
            System.out.println("Price: ₹" + Price);
        }
    }
}
