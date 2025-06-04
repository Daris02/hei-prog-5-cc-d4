import Builder.CarBuilder;
import Toy.AbstractFactory;
import Toy.CarFactory;
import Toy.DollFactory;
import Toy.Toy;
import Builder.*;

public class App {

  public static void main(String[] args) throws Exception {
    Toy car1 = AbstractFactory.makeToy(new CarFactory(), "child");
    car1.play();
    Toy car2 = AbstractFactory.makeToy(new CarFactory(), "");
    car2.play();
    Toy doll1 = AbstractFactory.makeToy(new DollFactory(), "kids");
    doll1.play();
    Toy doll2 = AbstractFactory.makeToy(new DollFactory(), "");
    doll2.play();

    Car cheapCar = CarBuilder.buildCheapCar();
    Car sportCar = CarBuilder.buildSportCar();
    Car car = CarBuilder.setEngine("engine 8cyl").setFuelType(FuelType.ELECTRIC).setSunRoof(false).setColor("grey").setSeat(6).setColor("red").build();
    
    System.out.println(car);
    System.out.println(cheapCar);
    System.out.println(sportCar);
  }
}
