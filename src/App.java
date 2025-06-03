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
    }
}
