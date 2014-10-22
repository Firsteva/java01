/* boxing and unboxing
 - boxing : 기본형 값으로 랩퍼객체를 만드는 것
 - unboxing : 랩퍼객체에서 기본형 값을 자동추출하는 것
 - 이 두가지가 자동으로 이루어지는 것 => autoboxing (JDK 1.5 이상)
 */
package java01.Test33;

public class Test33 {
  public static void main(String[] args){
    // boxing
    Integer i = 10; // new Integer(10)과 같다.
    
    // unboxing
    int j = 1; // i.intValue()와 같다.
  }
}