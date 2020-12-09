import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testGetReal() {
    MyComplex c = new MyComplex();
    MyComplex d = new MyComplex(3.0, 4.0);
    Assert.assertEquals(0.0, c.getReal(), 0.0);
    Assert.assertEquals(3.0, d.getReal(), 0.0);
  }
  @Test
  public void testGetImg() {
    MyComplex c = new MyComplex();
    MyComplex d = new MyComplex(3.0, 4.0);
    Assert.assertEquals(0.0, c.getImg(), 0.0);
    Assert.assertEquals(4.0, d.getImg(), 0.0);
  }
  @Test
  public void testToString() {
    MyComplex c = new MyComplex();
    MyComplex d = new MyComplex(3.0, 4.0);
    MyComplex b = new MyComplex(3.0, -4.0);
    Assert.assertEquals("0.0", c.toString());
    Assert.assertEquals("3.0 + 4.0i", d.toString());
    Assert.assertEquals("3.0 - 4.0i", b.toString());
  }
  @Test
  public void testIsReal() {
    MyComplex zero = new MyComplex();
    MyComplex real = new MyComplex(3.0, 0.0);
    MyComplex img = new MyComplex(0.0, 3.0);
    Assert.assertTrue(zero.isReal());
    Assert.assertTrue(real.isReal());
    Assert.assertFalse(img.isReal());
  }
  @Test
  public void testIsImaginary() {
    MyComplex zero = new MyComplex();
    MyComplex real = new MyComplex(3.0, 0.0);
    MyComplex img = new MyComplex(0.0, 3.0);
    Assert.assertTrue(zero.isImaginary());
    Assert.assertFalse(real.isImaginary());
    Assert.assertTrue(img.isImaginary());
  }
  @Test
  public void testAdd() {
    MyComplex a = new MyComplex();
    MyComplex b = new MyComplex(3.0, 2.0);
    a.add(b);
    Assert.assertEquals(3.0, a.getReal(), 0.0);
    Assert.assertEquals(2.0, a.getImg(), 0.0);
  }
  @Test
  public void testMultiply() {
    MyComplex a = new MyComplex(2.0, 3.0);
    MyComplex b = new MyComplex(4.0, 5.0);
    a.multiply(b);
    Assert.assertEquals(-7.0, a.getReal(), 0.0);
    Assert.assertEquals(22.0, a.getImg(), 0.0);
  }
  @Test
  public void testConjugate() {
    MyComplex a = new MyComplex(2.0, 3.0);
    MyComplex b = new MyComplex(4.0, -5.0);
    a.conjugate();
    b.conjugate();
    Assert.assertEquals(-3.0, a.getImg(), 0.0);
    Assert.assertEquals(5.0, b.getImg(), 0.0);
  }
  //test argument
  @Test
  public void testMagnitude() {
    MyComplex a = new MyComplex(3.0, 4.0);
    Assert.assertEquals(5.0, a.magnitude(), 0.0);
  }

  @Test
  public void testAddNew() {
    MyComplex a = new MyComplex(2.0, 3.0);
    MyComplex b = new MyComplex(4.0, 5.0);
    MyComplex c = MyComplex.addNew(a,b);
    Assert.assertEquals(6.0, c.getReal(), 0.0);
    Assert.assertEquals(8.0, c.getImg(), 0.0);
  }
  @Test
  public void testMultiplyNew() {
    MyComplex a = new MyComplex(2.0, 3.0);
    MyComplex b = new MyComplex(4.0, 5.0);
    MyComplex c = MyComplex.multiplyNew(a,b);
    Assert.assertEquals(-7.0, c.getReal(), 0.0);
    Assert.assertEquals(22.0, c.getImg(), 0.0);
  }
}