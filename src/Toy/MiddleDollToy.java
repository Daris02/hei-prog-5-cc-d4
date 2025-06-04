package Toy;
public class MiddleDollToy extends Doll {
  @Override
  public void play() {
    System.out.println("Playing with the middle doll");
  }

  @Override
  public MiddleDollToy makeToy() {
    return new MiddleDollToy();
  }
  
}
