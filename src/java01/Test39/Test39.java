/* 다형성(polymorphism) : overloading(오버로딩)
 - 파라미터 갯수나 파라미터의 타입이 다르더라도 결국 동일한 기능을 수행할 경우
   메서드의 이름을 같게 하는 것 => 프로그래밍의 일관성을 유지
 - 규칙 :
    1) 메서드 이름은 같아야 한다.
    2) 파라미터의 갯수가 다르거나, 데이터형이 달라야한다.
    3) 리턴타입이 다른것은 의미가 없다. => 호출할 때 메서드를 결정해야 하는데,
       리턴타입으로는 어떤 메서드를 호출할 지 결정할 수 없기 때문이다.
 */
package java01.Test39;

public class Test39 {
  public static void main(String[] args){
    // new Score();
    // 1) new Score : Score 클래스에 정의된 인스턴스 변수를 Heap에 준비.
    // 2) () : 생성자중 파라미터를 받지않는(기본생성자)를 호출하라.
    //         호출할 생성자를 선택하는 명령어
    // 생성자는 나중에 따로 호출할 수 없다.
    // 반드시 new 명령 다음에 즉시 호출해야 한다.
    Score s=new Score("홍길동",100,100,90);
    
    Score s2=new Score();
    s2.name="임꺽정";
    s2.kor=90;
    s2.eng=90;
    s2.mat=90;
    s2.sumScore();
    
    System.out.println("이름 : "+s.name);
    System.out.println("국어 : "+s.kor);
    System.out.println("영어 : "+s.eng);
    System.out.println("수학 : "+s.mat);
    System.out.println("합계 : "+s.sum);
    System.out.println("평균 : "+s.avr);
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("이름 : "+s2.name);
    System.out.println("국어 : "+s2.kor);
    System.out.println("영어 : "+s2.eng);
    System.out.println("수학 : "+s2.mat);
    System.out.println("합계 : "+s2.sum);
    System.out.println("평균 : "+s2.avr);

  }
}