package java01.Test44_1;

public class Soldier extends Mover {
  int atk;
  int lev;
  
  // Mover 로부터 상속받은 move() 메서드를 서브 클래스 역할에 맞게 재정의.
  // => 오버라이딩(Overriding)
  // 문법 : 재정의 하려는 클래스와 같은 시그니쳐를 갖는 메서드를 만들어라.
  // ※ 단, 공개 범위는 축소되어서는 안된다.
  // ※ 파라미터의 변수의 이름은 달라고 상관없다.
  // signature 란? 메서드의 이름과 리턴 타입, 파라미터 타입을 말함.
  // C 언어에서는 function prototype 이라 부른다.
  
   // 수퍼 클래스의 메서드를 재정의하는지 검사하라고 컴파일러에게 지시
  public void move(int dir){
    System.out.println("+1만큼 추가이동");
    
  }
}
