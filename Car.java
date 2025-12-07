public class Car {
    int no_ofwheels;
    String color;
    float current_fuel_level;
    float addFuel;
    int no_of_seats;
    float max_speed;

    Car(String color){
        this.color=color;
        current_fuel_level=3;
        no_of_seats=5;
        no_ofwheels=44;
        max_speed=150;
    }
    // Constructor chaining if no color args is passed than color is set to black automatically
    
    Car(){
        this("Black");
    }

    public  Car drive(){
        if(current_fuel_level<=0){
            System.out.println("Car is out of fuel");

        }
        
        else if(current_fuel_level<5){
            System.out.println("Car is in reserved mode");
            current_fuel_level--;

        }
        
        else{
            System.out.println("Car is driving");
            current_fuel_level--;

        }
        return this;
        
    }
    public Car Start(){
        current_fuel_level--;
        System.out.println("Car is Started.....bruh........................");
        return this;

    }
    public  void add_fuel(float current_fuel_level){
        this.current_fuel_level+=current_fuel_level;
    }
    

    public  float showFuel(){
        return current_fuel_level;
    }


    
}
