/* 인스턴스 블럭
 - 인스턴스 생성 => 초기화 문장 수행 => (인스턴스 블럭 실행, 생성자 실행)
 */
package java01.Test47;

public class ClassA {
  static int value=10;
  static{
    System.out.println("ClassA: static 블럭 실행");
    ClassB.value=100;
    System.out.println("ClassA: ClassB.value = "+ClassB.value);
    System.out.println("ClassA: value = "+value);
  }
}
