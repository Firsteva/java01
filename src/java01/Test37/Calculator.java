/* 인스턴스 메서드
 - 인스턴스 주소를 줘야지만 호출할 수 있는 메서드
 - 문법 : 인스턴스주소.메서드();
 - 해설 :
  인스턴스 메서드를 호출할 떄, 인스턴스의 주소를 앞에 준다.
  JVM은 인스턴스 변수가 어떤 클래스의 변수인지 알아낸다.
  알아낸 클래스의 메서드를 호출한다.
  이때, 메서드 앞에 준 인스턴스의 주소를 메서드에 넘긴다.
  메서드는 JVM이 호출할 때 넘겨준 인스턴스 주소를 내부 비밀변수에 저장한다.
  비밀변수의 이름은 this.
 */
package java01.Test37;

public class Calculator {
  // 인스턴스 변수 선언 => static 제거
  // => 인스턴스 변수는 클래스 로딩할 때 준비되지 않는다.
  // => 별도의 명령을 내려야만 준비한다.
  // => 명령 내리는 법? new Calculator();
  //    해석 : JVM 듣거라. Calculator 클래스에 선언된 인스턴스 변수를
  //         Heap 메모리에 준비하라. 그리고 그 시작 주소를 리턴하라.
  private int result;
  
  // 인스턴스 변수를 사용하려면 그 인스턴스의 시작 주소를 알아야 한다.
  // 따라서, 메서드의 파라미터에 인스턴스 주소를 넘겨줘라.
  int getResult(){
    return result;
  }
  
  void plus(int value){
    /* Calculator this,
     this 변수는 내부에 숨겨진 변수이다.
      메서드를 호출할 때 사용한 인스턴스의 주소를 보관한다.
      만약, 인스턴스 변수에 this를 붙이지 않으면,
      컴파일러가 자동으로 있다고 가정하고 컴파일한다.
     */
    result += value; /*this를 생략해도 된다.*/
  }
  void minus(int value){
    result -= value;
  }
  void multiple(int value){
    result *= value;
  }
  void divide(int value){
    result /= value;
  }
}
