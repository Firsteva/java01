package java01.Test49;

public class Student {
  String name;
  int age;
  @Override
  public String toString() {
    return name+","+age;
  }
  public Student(String name, int age){
    this.name=name;
    this.age=age;
  }
}
