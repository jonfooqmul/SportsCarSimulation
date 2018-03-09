public class Van extends Vehicle {
    private double carryweight;
    public Van (double horsepower, double aerodynamics, double weight, double carryweight){
        super(horsepower,aerodynamics,weight);
        this.carryweight=carryweight;
    }
    
    public double getCarryweight () {
        return carryweight;
    }
    
    public double acceleration () {
        return (100/horsepower)*(aerodynamics/2)*(weight/100);
    }
}