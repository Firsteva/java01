package java01.Test44_1;

abstract public class Vehicle extends Mover {
  int spd;
  int capacity;
  @Override
  public void move(int direction) {
    System.out.println("윙윙");
  }
}
