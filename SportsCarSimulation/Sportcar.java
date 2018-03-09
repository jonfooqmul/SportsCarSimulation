public class Sportcar extends Vehicle {
    private double topspeed;
    public Sportcar (double horsepower, double weight, double topspeed) {
        super(horsepower,0.5,weight);
        this.topspeed = topspeed;
    }
    
    public double getTopspeed() {
        return topspeed;
    }
}