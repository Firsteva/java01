/* 사용자 정의 데이터 타입
 - 자바에서 제공하는 데이터형이 아니라,
   개발자가 프로젝트에 맞춰서 필요한 데이터형을 정의하는 것.

 * 배열 문법과의 차이점은?
 - 배열은 오직 같은 종류의 메모리를 여러개 정의할 수 있다.
 - 클래스는 다른 종류의 메모리(복합데이터)를 정의할 수 있다.
 */
package java01.Test36;

// Score : 학생의 이름과 국어, 영어, 수학, 합계, 평균을 저장하는
//          메모리의 데이터형이다.
public class Score {
  String name; // 용어 : 인스턴스 변수, 속성(Attribute)
  int kor;
  int eng;
  int mat;
  int sum;
  float avr;
}
