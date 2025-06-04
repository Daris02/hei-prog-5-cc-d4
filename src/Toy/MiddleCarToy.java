package Toy;
public class MiddleCarToy extends Car {  
  @Override
  public void play() {
    System.out.println("Playing with the middle car");
  }

  @Override
  public MiddleCarToy makeToy() {
    return new MiddleCarToy();
  }
  
}
