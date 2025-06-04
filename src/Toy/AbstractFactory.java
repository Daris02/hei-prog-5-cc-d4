package Toy;
public abstract class AbstractFactory {
  public static Toy makeToy(ToyFactory factory, String type) {
    if (type.equals("child"))
      return factory.makeToyForChild();
    if (type.equals("kids"))
      return factory.makeToyForKids();
    return factory.makeToy();
  }
}
