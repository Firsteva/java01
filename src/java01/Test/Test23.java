/* 반복문
 - while (조건) 명령문;
 - while (조건) { ... }

 - do 명령문; while(조건);
 - do { ... } while(조건);

 - for (초기화명령문; 조건; 증가문) { ... }
 - else { ... }
 */
package java01.Test;

public class Test23 {

  public static void main(String[] args) {
    // 퀴즈
    // - 1에서 100까지 출력하라. 단, 4의 배수만 출력하라.
    //   다음과 같이 출력하라.
    // 4, .......20
    // 24, 28, ....
    // - 단, 20의 배수일때마다 다음 라인으로 가라.
    // - 20의 배수이지만 60의 배수가 아닌 것은 새 라인 앞에만 @문자를 붙여라.
    // 4, 8, 12, 16, 20(엔터)
    // 24, 28, 32, 36, 
    // - do 문을 사용하라.
    int x=1;
    do {
      if (x % 4 == 0) {
        System.out.print(x+", ");
        if (x % 20 == 0) {
          System.out.println();
          if (x % 60 == 0) {
            System.out.print("@");
          }
        } 
      }
      x++;
    } while (x<100);
    System.out.println(x);
  }
}














