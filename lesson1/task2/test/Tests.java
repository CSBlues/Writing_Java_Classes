import org.junit.Assert;
import org.junit.Test;

public class Tests {


    @Test
    public void testArea() {
      // put your test here
      Circle myCircle = new Circle(5,4, 3.0);
      Assert.assertEquals(28.27, myCircle.getArea(),0.01 );
    }
    @Test
    public void testTranslate() {
      // put your test here
      Circle myCircle = new Circle();
      myCircle.translate(3, 5);
      Assert.assertEquals(3, myCircle.getX());
      Assert.assertEquals(5, myCircle.getY());
    }
    @Test
    public void testTripleRadius() {
        // put your test here
        Circle myCircle = new Circle();
        myCircle.tripleTheRadius();
        Assert.assertEquals(3.0, myCircle.getRadius(), 0.001);
    }
    @Test
    public void testIsInCircle() {
        // put your test here
        Circle myCircle = new Circle(1,1,4);
        Assert.assertFalse(myCircle.isInCircle(5,6));
        Assert.assertTrue(myCircle.isInCircle(1,5));
        Assert.assertTrue(myCircle.isInCircle(1,4));
    }


}