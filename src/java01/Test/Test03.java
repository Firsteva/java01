/* main() : JVM이 클래스를 실행할 때 호출하는 함수.
   - start entry
   - 다음 소스의 규칙에 따라 작성하라.
   
   자바 클래스 실행
     java -classpath [클래스 파일이 있는 경로] [클래스명]
   - 만약 클래스가 특정 패키지에 소속된 멤버라면,
     java -classpath [패키지가 있는 경로] [패키지명, 클래스명]
   - classpath 대신 -cp 라고 해도 된다.
   
   패키지명.클래스명 = Fully Qualified Name(Qname)
 */ 


package java01.Test;

// 하나의 소스파일에는 public 클래스가 오직 하나만 올 수 있다.
public class Test03 {
  public static void main(String[] args){
    // 콘솔 창으로 출력
    System.out.print("Hello, World\n");
  }
}

/* Quiz 1 : 
   1) Net.java63.test 패키지를 생성하라.
   2) 이 패키지에 HelloWorld 이름을 갖는 클래스를 생성하라.
   3) 클래스를 실행하면 다음과 같이 출력되게 작성하라.
      > 나의 첫번째 자바 프로그램.
   4) 터미널을 사용하여 HelloWorld 클래스를 실행하라.
   
   Quiz 2 :
   1) Net.java63.test2 패키지를 생성하라.
   2) 이 패키지에 Ohora 이름을 갖는 클래스를 생성하라.
   3) 클래스를 실행하면 다음과 같이 출력되게 작성하라.
      > 1 + 3 = 4 이다.
      조건 : 다음 코드를 삽입하고, 그 결과를 출력하라.
       int v1 = 1;
       int v2 = 3;
   4) 터미널을 사용하여 HelloWorld 클래스를 실행하라. 
*/