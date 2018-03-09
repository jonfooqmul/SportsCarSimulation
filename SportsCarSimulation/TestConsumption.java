
public class TestConsumption {
    
    public static void main (String [] args) {
        Sportcar s1 = new Sportcar (200,1500,220);
        Sportcar s2 = new Sportcar(100,1000,170);
        Sportcar s3 = new Sportcar(135,110.2,173);
        Van v1 = new Van (100,0.9,3500,160.4);
        
        fuelConsumption(s1,s2,s3);
        printAcceleration(s1,s2,s3,v1);
        
    }
    
    public static void fuelConsumption(Sportcar s1, Sportcar s2, Sportcar s3) {
        System.out.println("s1 consumption: " + (1000+s1.getWeight()/5)*(s1.getTopspeed()/100)*(s1.getAerodynamics()*s1.getHorsepower())/10000);
        System.out.println("s2 consumption: " + (1000+s2.getWeight()/5)*(s2.getTopspeed()/100)*(s2.getAerodynamics()*s2.getHorsepower())/10000);
        System.out.println("s3 consumption: " + (1000+s3.getWeight()/5)*(s3.getTopspeed()/100)*(s3.getAerodynamics()*s3.getHorsepower())/10000);
       
    }
     public static double fuelConsumption(Sportcar s) {
        return ( (1000+s.getWeight()/5)*(s.getTopspeed()/100)*(s.getAerodynamics()*(s.getHorsepower()/10000) ));
      
    }
   
    public static void printAcceleration(Sportcar s1, Sportcar s2, Sportcar s3, Van v1) {
        System.out.println(s1.acceleration());
        System.out.println(s2.acceleration());
        System.out.println(s3.acceleration());
        System.out.println(v1.acceleration());
    }
}
