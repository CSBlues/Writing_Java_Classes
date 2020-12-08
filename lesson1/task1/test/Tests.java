import org.junit.Assert;
import org.junit.Test;


public class Tests {
  @Test
  public void testPointDefaultConstructor() {
    // put your test here
    Point myPoint = new Point();
    Assert.assertEquals(0, myPoint.x );
    Assert.assertEquals(0, myPoint.y );
  }
  @Test
  public void testPointSecondConstructor() {
    // put your test here
    Point myPoint = new Point(5,4);
    Assert.assertEquals(5, myPoint.x );
    Assert.assertEquals(4, myPoint.y );
  }
  @Test
  public void testTranslate() {
    // put your test here
    Point myPoint = new Point();
    myPoint.translate(3, 5);
    Assert.assertEquals(3, myPoint.x );
    Assert.assertEquals(5, myPoint.y );
  }
  @Test
  public void testDistance() {
    // put your test here
    Point myPoint = new Point(3,4);
    double dist = myPoint.distanceToOrigin();
    Assert.assertEquals(5.0, dist ,0.0);

  }
}