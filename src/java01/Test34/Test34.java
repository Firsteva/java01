/* 형변환
 - 정의 : 다른 데이터형의 임시메모리를 만들고, 값을 복사하는 것.
 - 명시적 형변환 : 명령어를 사용하여 형변환을 지정하는 것.
   (Explicit type conversion)
    (임시메모리의 데이터형)값;
    예) int i=10; byte b=(byte)i;
 - 암시적 형변환 : JVM이 내부 규칙에 따라 자동으로 형변환 하는 것.
 */
package java01.Test34;

public class Test34 {
  public static void main(String[] args){
    int i=10;
    // l-value - 할당연산자를 기준으로 왼쪽의 메모리
    // r-value - 할당연산자를 기준으로 오른쪽의 상수값이나 변수
    // l-value는 반드시 메모리여야만 하고,
    // r-value는 메모리 또는 상수값이다.
    
    //비록 상수값이 4바이트 정수이지만, 메모리(l-value)에 넣을 수 있으면 허락한다.
    byte b=10;
    
    // 상수가 아닌 경우는 값을 l-value에 넣을 수 있다 하더라도 허락하지 않는다.
    // byte b2=i; 오류
    
    // 해결책
    // r-value를 강제로 l-value에 넣는 방법
    // l-value=(데이터형)r-value;
    // 단, r-value가 l-value에 온전히 저장될 수 있다는 확신이 있어야한다.
    byte b3=(byte)i;
    // i는 10이란 값이기 때문에 1바이트로 만들어 b3에 넣더라도 문제가 없다.
    // 그러나 다음의 경우를 조심해야 한다.
    int i2=256;
    byte b4=(byte)i2;
    // JVM은 i2의 값에서 상위 3바이트를 날리고 마지막 바이트를 b4에 넣는다.
    // 0000 0000 0000 0000 0000 0001 0000 0000
    
    System.out.print(b4);
  }
}