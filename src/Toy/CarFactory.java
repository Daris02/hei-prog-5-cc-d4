package Toy;
public class CarFactory implements ToyFactory<Car> {
  @Override
  public Toy<Car> makeToyForKids() {
    return new LittleCarToy();
  };

  @Override
  public Toy<Car> makeToyForChild() {
    return new MiddleCarToy();
  }

  @Override
  public Toy<Car> makeToy() {
    return new Car();
  };
}
