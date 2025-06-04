package Toy;
public class Doll implements Toy<Doll> {
  @Override
  public Doll makeToy() {
    return new Doll();
  }

  @Override
  public void play() {
    System.err.println("Playing with the doll");
  }
}
