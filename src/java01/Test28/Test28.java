/* 클래스?
 - 역할에 따라 메서드(함수)와 변수를 정의해 묶어놓은 것. 
 */
package java01.Test28;

import java.util.Scanner;

// 주제 : calculator 의 기능을 이용하여 다음 계산을 수행하라.
// 단, 계산은 순차적으로 실행하라.(즉, 연산자 우선순위를 적용하지 말라)
// 10 + 2 * 7 - 4 / 2 = ?

// 단계5 : 클래스 분리
// => calculator 클래스를 정의하고, 계산과 관련된 기능을 분리한다.

public class Test28 {
  public static void main(String[] args){
    // 10+2*7-4/2=?
    // 클래스 변수나 인스턴스 변수는 자동 초기화 된다.
    // 따라서 다음과 같이 별도로 초기화 할 필요는 없다.
    // calculator.result=0;
    
    calculator.plus(10);
    calculator.plus(2);
    calculator.multiple(7);
    calculator.minus(4);
    calculator.divide(2);
    
    System.out.println("결과는 = "+calculator.result);
  }
}