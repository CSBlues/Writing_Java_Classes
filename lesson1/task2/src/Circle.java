

public class Circle {
  private int x;
  private int y;
  private double radius;

  public Circle(){
      this.x = 0;
      this.y = 0;
      this.radius = 1.0;
  }
  public Circle(int newX, int newY, double r){
      this.x = newX;
      this.y = newY;
      this.radius = r;
  }
  public double getArea(){
      return Math.PI * this.radius*this.radius;
  }
  public boolean isInCircle(int a, int b){
      Point testPoint = new Point(a, b);
      Point circleCenter = new Point(this.x, this.y);
      return Math.abs(testPoint.distanceToOrigin() - circleCenter.distanceToOrigin()) <= this.radius;
  }
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    void tripleTheRadius(){
      this.radius *= 3.0;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public double getRadius() {
        return this.radius;
    }
}