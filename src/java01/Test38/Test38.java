/* 생성자
 - 인스턴스가 생성된 후 자동으로 호출되는 메서드
 - 인스턴스를 사용하기 전에, 제 역할을 할 수 있도록
   '유효한' 값으로 초기화하는 일을 한다.
 - 문법 :
    1) 리턴 타입이 없어야 한다. => 값을 리턴할 수 없다.
    2) 메서드 이름이 클래스 이름과 같아야 한다.
    3) 파라미터가 없는 생성자를 기본생성자(Default)라 한다.
    4) 생성자를 만들지 않으면 컴파일러가 자동으로 기본생성자를 만들어 */
package java01.Test38;

public class Test38 {
  public static void main(String[] args){
    // new Score();
    // 1) new Score : Score 클래스에 정의된 인스턴스 변수를 Heap에 준비.
    // 2) () : 생성자중 파라미터를 받지않는(기본생성자)를 호출하라.
    //         호출할 생성자를 선택하는 명령어
    // 생성자는 나중에 따로 호출할 수 없다.
    // 반드시 new 명령 다음에 즉시 호출해야 한다.
    Score s=new Score("홍길동",100,100,90);
    
    System.out.println("이름 : "+s.name);
    System.out.println("국어 : "+s.kor);
    System.out.println("영어 : "+s.eng);
    System.out.println("수학 : "+s.mat);
    System.out.println("합계 : "+s.sum);
    System.out.println("평균 : "+s.avr);
  }
}