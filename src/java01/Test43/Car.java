/* 추상 클래스
 - 그 자체로 사용하지 않는 클래스
 - 단지 서브 클래스에게 공통 속성이나 메서드를 물려주기 위해 만든 클래스
 - 인스턴스를 생성할 수 없다.
 - 문법 : abstract class 클래스명{}
 
 용어 정리 :
 - 일반 클래스(concrete class)
  1) 패키지 멤버 클래스 : package member class
  2) 중첩 클래스(내부 클래스) : inner class
    ① top level inner class
    ② member inner class
    ③ local inner class
    ④ anonymous inner class
 - 추상 클래스(abstract class)⑤ 
 */

package java01.Test43;

// public(access modifier)과 abstract 키워드는 순서에 상관없다.
abstract public class Car {
  String model;
  String maker;
  int cc;
  int capacity;
  java.util.Date releaseDate;
}