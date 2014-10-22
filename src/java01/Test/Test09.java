/* 부동소수점
 - 상수의 표현
    30f 또는 30F => 4바이트 부동소수점
    30.0 또는 40.0 <= 8바이트 부동소수점
 - 부동소수점이란, 소수점이 움직인다.
    3.14=31.4*10E-1=314*10E-2=0.314*10E1=...
 - 메모리 저장방식
   부동소수점을 정수부분과 지수부분을 분리하여 저장한다.
   예) 3.14 => 314(정수부) * 10E-2(지수부)

  float => 24(정수부) + 8(지수부) => 유효 자릿수 6자리, 단정도
  double => 53(정수부) + 11(지수부) => 유효 자릿수 15자리(2배 정밀하다), 배정도
  
 */
package java01.Test;

public class Test09 {
  public static void main(String[] args){
    // 부동소수점 표기 예
    float f=3.14f;
    float f2=3.14F;
    float f3=31.4E-1f;
    float f4=314E-2f;
    float f5=0.314E1f;
    float f6=Float.MAX_VALUE;
    float f7=Float.MIN_VALUE;
    System.out.print(f6);
    System.out.print("\n");
    System.out.print(f7);
    System.out.print("\n");
    
    // 다음 값은 저장할 수는 있지만, 정수부 메모리크기를 넘는 값은 0으로 취급한다.
    // 그래서 정확한 값이 저장되지 않는다.
    // 오류가 발생하지 않는다 하더라도 주의할 것.
    float f8=34028223432423423423423423423400f;
    System.out.print(f8);
    System.out.print("\n");
    
    // 부동소수점 변수에 값을 저장할 때는
    // float x=소수점을 뺀 6자리;
    // double y= 소수점을 뺀 15자리;
    
    // 주의해야할 예
    float i=3.14159f;
    float j=15654.7f;
    float result=i+j; // 조심! 두 값을 더한 결과는 유효 자릿수를 넘는다.
    // result=15657.84159
    System.out.print(result);
  }
}

