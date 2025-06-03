public class Car implements Toy<Car> {
  @Override
  public Car makeToy() {
    return new Car();
  }

	@Override
	public void play() {
    System.err.println("Playing with the car");
  }  
}
