package src;

public class Cars {
    static String carBrand;
    int speed;
    float acclDynamics;
    float brkDynamics;


    public Cars(String carBrand, int speed, float acclDynamics, float brkDynamics) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.acclDynamics = acclDynamics;
        this.brkDynamics = brkDynamics;
    }
      public void displayInfoCars() {
        System.out.println("\nCars's brand - " + carBrand +"\nCars's speed - " + speed + "\nCars's acclDynamics - " + acclDynamics +"\nCars's brkDynamics - " + brkDynamics +"\nDifference between acceleration and bracking time's - " + (acclDynamics-brkDynamics) +"\nAre the acceleration and deceleration times equal? - " + (acclDynamics==brkDynamics));
    }
}
