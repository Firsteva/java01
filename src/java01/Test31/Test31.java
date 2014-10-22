
package java01.Test31;

// 10 + 2 * 7 - 4 / 2 = ?
// 20 * 3 + 76 - 5 = ?

// 단계7 : result 변수를 개별적으로 유지(인스턴스 변수)

public class Test31 {
  public static void main(String[] args){
    // 10+2*7-4/2=?
    // 20*3+76-5=?
    
    // Calculator 클래스의 명령에 따라 준비된 메모리를 '인스턴스'라 한다.
    // 그 인스턴스 메모리의 주소를 저장하는 변수를 '레퍼런스'라 한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    c1.plus(10);
    c2.plus(20);
    
    c1.plus(2);
    c2.multiple(3);
    
    c1.multiple(7);
    c2.plus(76);
    
    c1.minus(4);
    c2.minus(5);
    
    c1.divide(2);
    
    System.out.println("c1의 결과는 = "+c1.getResult());
    System.out.println("c2의 결과는 = "+c2.getResult());
  }
}