/* 암시적 형변환(Implicit type conversion)
 - 연산을 수행할 때 JVM의 규칙에 따라 자동으로 형변환 되는 것.
 - 규칙
    byte, short, char => int => long => float => double
    * 연산의 기본은 int이다.
 - 왜 형변환을 하는지?
 => 연산을 수행하려면 두개의 값이 같은 데이터형이어야 한다.
 
 */
package java01.Test35;

public class Test35 {
  public static void main(String[] args){
    byte b=10;
    byte b2=10;
    short s=10;
    char c=10;
    int i=10;
    long l=10L;
    float f=10.0f;
    double d=10.0;
    
    // byte sum1=b+s+c+i+l+f+d; // r-value가 double이라서
    // byte sum3=b+b2; // r-value가 int라서
    // Why? byte, short, char 값들을 연산할 때
    // int로 변환한 후 연산한다. 따라서 결과는 int타입이다.
    
    // int와 int의 연산결과는 int이다.
    int x=5;
    int y=2;
    System.out.print(x/y);// = 2
    System.out.print((float)x/(float)y);// = 2.5
    System.out.print(x/(float)y);//= 2.5
  }
}