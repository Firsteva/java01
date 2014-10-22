/* 인스턴스 블럭
 - 인스턴스 생성 => 초기화 문장 수행 => 인스턴스 블럭 실행 => 생성자 실행
 */
package java01.Test47;

public class ClassB {
  static int value=10;
  static{
    System.out.println("ClassB → static 블럭 실행");
    ClassA.value=100;
    System.out.println("ClassB → ClassA.value = "+ClassA.value);
    System.out.println("ClassB → value = "+value);
  }
}
