package Toy;
public class LittleCarToy extends Car {  @Override
  public void play() {
    System.out.println("Playing with the little car");
  }

  @Override
  public LittleCarToy makeToy() {
    return new LittleCarToy();
  }
  
}
