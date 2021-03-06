/* 자바 주석 
   - 컴파일러가 무시하는 코드 => 바이트코드에 포함되지 않는다.
*/

package java01.Test;
/** 자바 문서 주석
   - javadoc 개발 도구를 통해서 HTML 문서를 만들 때  사용하는 주석
   - javadoc은 소스파일에서 자바문서 주석을 추출하여 HTML을 생성한다.
   - @키워드를 통해 HTML문서에 특별한 문장을 생성할 수 있다.
   - 바이트코드에는 포함되지 않는다.
   @author bit
 */
public class Test05 {
  /* 애노테이션
   - 컴파일러나 JVM이 사용하는 아주 특별한 주석
   - 문법 : @키워드(변수=값,변수=값...)
   - 주석 유지 범위 :
     1) SOURCE => 컴파일 후 버려짐. 클래스 파일에 포함되지 않는다.
     2) CLASS => 클래스 파일에 포함 됨. 단, JVM이 사용할 수 없다.
     3) RUNTIME => 클래스 파일에 포함 됨. JVM이 꺼낼 수 있다.
                      즉, 실행중에 클래스 파일에 있는 주석을 꺼내 볼 수 있다.
   */
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
  public static void main(String[] args){
    // 한줄 주석
    /* 여러줄 주석 */
  }
}
