public class DollFactory implements ToyFactory<Doll> {
  @Override
  public Toy<Doll> makeToyForKids() {
    return new LittleDollToy();
  };

  @Override
  public Toy<Doll> makeToyForChild() {
    return new MiddleDollToy();
  }

  @Override
  public Toy<Doll> makeToy() {
    return new Doll();
  };
}
