/* 반복문
 - while (조건) 명령문;
 - while (조건) { ... }

 - do 명령문; while(조건);
 - do { ... } while(조건);

  - for (초기화명령문; 조건; 증가문) { ... }
  - for (변수 : 배열이나 Collection 타입 객체) { ... }
 */
package java01.Test;
import java.util.ArrayList;
public class Test25 {

  public static void main(String[] args) {
    int[] scores = new int[]{1, 2, 3, 4, 5};
    for (int value : scores) {
      System.out.println(value);
    }
  } 
}