public class LittleDollToy extends Doll {
  @Override
  public void play() {
    System.out.println("Playing with the little doll");
  }

  @Override
  public LittleDollToy makeToy() {
    return new LittleDollToy();
  }
  
}
