/* 인스턴스 블럭
 - 인스턴스 생성 => 초기화 문장 수행 => 인스턴스 블럭 실행 => 생성자 실행
 */
package java01.Test46;

public class ClassB extends ClassA {
  int x=10;
  {
    System.out.println("ClassB의 인스턴스 블럭");
  }
  public ClassB(){
    System.out.println("ClassB의 생성자 호출");
    x=20;
  }
}
