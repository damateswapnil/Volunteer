package keywordsInTestNG;

import org.testng.annotations.Test;

public class EnableFalseNewTest {
  @Test
  public void test1() {
	  int a=5;
	  System.out.println(a);
  }
  @Test(enabled=false)
  public void test2() {
	  int b=6;
	  System.out.println(b);
  }
  @Test
  public void test3() {
	  int k=3;
	  System.out.println(k);
  }
}
