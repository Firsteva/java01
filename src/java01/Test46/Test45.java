/* 클래스 로딩
 - 1) new 연산자를 사용하여 인스턴스를 만들 떄
 - 2) Class.forName("클래스이름")을 호출하여 임의로 클래스 로딩.
 */
package java01.Test46;

public class Test45 {
  public static void main(String[] args) {
    ClassA obj1=new ClassA();
    ClassB obj2=new ClassB();
    System.out.println(obj1.i);
    System.out.println(obj2.i);
    System.out.println(obj2.j);
    System.out.println(obj2.x);
  }
}
