public class Point {
  public int x;
  public int y;


  public Point(){
      x = 0;
      y = 0;
  }
  public Point(int newX, int newY){
      x = newX;
      y = newY;
  }

  public void translate(int dx, int dy){
      x += dx;
      y += dy;
  }

  public double distanceToOrigin(){
      return Math.sqrt(x * x + y * y);
  }
}