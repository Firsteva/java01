/* 반복문
 - while (조건) 명령문;
 - while (조건) { ... }

 - do 명령문; while(조건);
 - do { ... } while(조건);

 - for (초기화명령문; 조건; 증가문) { ... }
 - else { ... }
 */
package java01.Test;

public class Test22 {

  public static void main(String[] args) {
    int x=4;
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














