/* 서브 클래스의 인스턴스 생성 과정
 - 수퍼 클래스의 명령어에따라 먼저 인스턴스 변수를 생성한 다음,
   서브 클래스의 명령어에따라 인스턴스 변수를 생성한다.
 */
package java01.Test43;

public class Test43 {
  public static void main(String[] args){
    Tico c1 = new Tico();
    Jeep c2 = new Jeep();
    Cabrio c3 = new Cabrio();
    
    // 추상클래스의 인스턴스는 만들 수 없다.
    // Car c4 = new Car(); 오류;
  }
}