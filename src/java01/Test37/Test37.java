package java01.Test37;

public class Test37 {
  public static void main(String[] args){
    String name="홍길동";
    int kor=100;
    int eng=100;
    int mat=90;
    int sum=kor+eng+mat;
    float avr=sum/3.0f;
    System.out.println("이름 : "+name);
    System.out.println("국어 : "+kor);
    System.out.println("영어 : "+eng);
    System.out.println("수학 : "+mat);
    System.out.println("합계 : "+sum);
    System.out.println("평균 : "+avr);
    
    System.out.println(".:'':.:'':.:'':.:'':.:'':.:'':.");
    Score s=new Score();
    s.name="홍길동";
    s.kor=100;
    s.eng=100;
    s.mat=90;
    s.sumScore();
    System.out.println("이름 : "+s.name);
    System.out.println("국어 : "+s.kor);
    System.out.println("영어 : "+s.eng);
    System.out.println("수학 : "+s.mat);
    System.out.println("합계 : "+s.sum);
    System.out.println("평균 : "+s.avr);
  }
}