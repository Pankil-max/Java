public class Driver{
    
    


    public static void main(String[] args) {
        // Car myCar=new Car();
        // myCar.add_fuel(6);
        // myCar.drive();
        // System.out.println(myCar.showFuel());
        Car Swift=new Car("Red");
        Swift.add_fuel(6);
        // Swift.Start();
        // Swift.drive();
        Swift.Start().drive();
        System.out.println(Swift.color);


        
        
    }
}


