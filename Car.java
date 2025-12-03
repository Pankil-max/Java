public class Car {
    int no_ofwheels;
    String color;
    float current_fuel_level;
    float addFuel;
    int no_of_seats;
    float max_speed;

    public  void drive(){
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
        
    }
    public  void add_fuel(float addFuel){
        current_fuel_level+=addFuel;
    }
    

    public  float showFuel(){
        return current_fuel_level;
    }


    
}
