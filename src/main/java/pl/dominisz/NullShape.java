package pl.dominisz;

public class NullShape implements Shape {

  private static final NullShape INSTANCE = new NullShape();

  private NullShape() {}

  public static NullShape getInstance() {
    return INSTANCE;
  }

  @Override
  public void draw() {
    System.out.println("I'm null object");
  }
}
