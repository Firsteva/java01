/* 사용자 정의 데이터 타입 + 연산자 추가
 - 클래스의 속성 값을 다루는 연산자를 정의하는 방법. => 메서드
 */
package java01.Test38;

// Score : 학생의 이름과 국어, 영어, 수학, 합계, 평균을 저장하는
//          메모리의 데이터형이다.
public class Score {
  String name; // 용어 : 인스턴스 변수, 속성(Attribute)
  int kor;
  int eng;
  int mat;
  int sum;
  float avr;
  
  // 기본 생성자 : 파라미터가 없는 생성자
  // 생성자를 정의하지 않으면 컴파일러가 다음과 같이 자동으로 추가한다.
  // public Score(){}
  
  // 생성자 추가
  public Score(String name, int kor, int eng, int mat){
    this.name=name;
    this.kor=kor;
    this.eng=eng;
    this.mat=mat;
    sumScore();
  }
  
  // 메서드
  // 다음 연산자는 국어, 영어, 수학점수의 합계를 내는 기능을 수행한다.
  public void sumScore(){
    sum=kor+eng+mat;
    avr=sum/3.0f;
  }
}
