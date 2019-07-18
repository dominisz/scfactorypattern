package pl.dominisz;

public class NullShape implements Shape {
  @Override
  public void draw() {
    System.out.println("I'm null object");
  }
}
