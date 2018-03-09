public class Vehicle {
    double horsepower;
    double aerodynamics;
    double weight;
    public Vehicle (double horsepower, double aerodynamics, double weight) {
        this.horsepower = horsepower;
        this.aerodynamics = aerodynamics;
        this.weight = weight;
    }
    
    public double getHorsepower () {
        return horsepower;
    }
    
    public double getAerodynamics () {
        return aerodynamics;
    }
    
    public double getWeight () {
        return weight;
    }
    
    public double acceleration() {
        return (100/horsepower) * (aerodynamics) * (weight/100);
    }
    
}