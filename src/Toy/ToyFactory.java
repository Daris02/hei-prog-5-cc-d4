package Toy;
public interface ToyFactory<T> {
  Toy<T> makeToy();
  Toy<T> makeToyForKids();
  Toy<T> makeToyForChild();
}
