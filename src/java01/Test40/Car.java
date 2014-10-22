package java01.Test40;

public class Car {
    String model;
    String maker;
    int cc=800;
    boolean diesel; 
    java.util.Date releaseDate;
    int capacity=5; // 초기화 문장
    
    public Car(){
      this.maker="미정";
      this.model="미정";
    }
    
    public Car(String maker, String model, int cc){
      this.maker=maker;
      this.model=model;
      this.cc=cc;
    }
}