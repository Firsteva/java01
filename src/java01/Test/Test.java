/* 주제 : 클래스와 바이트코드
   - 바이트코드는 클래스 별로 파일을 생성한다.
   - 유지보수를 좋게 하기 위해 가능한 각 클래스는 별도의 소스파일로 만들어라.
 */ 


package java01.Test;

public class Test {
  public static void main(String[] args){
    byte[] a=new byte[5];
    byte[] a2=new byte[3];
    byte[] a3=a;
    a3[2]=100;
    a2=a;
    System.out.println(a[2]);
  }
}
