package java01.Test44_1;

public class Tank extends Vehicle {
  int range;
  boolean siegeMode;
  @Override
  public void move(int direction) {
    if(siegeMode)
      return;
    int distance=3;
    switch(direction){
    case NORTH:y+=distance;break; // 북쪽
    case EAST:x+=distance;break; // 동쪽
    case SOUTH:y-=distance;break; // 남쪽
    case WEST:x-=distance;break; // 서쪽
    }
    System.out.println("+2만큼 추가이동, 방향 : "+x+","+y);
  }
}
