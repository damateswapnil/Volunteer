package keywordsInTestNG;

import org.testng.annotations.Test;

public class InvocationKeywordTest {
  @Test
  public void test1() {
	  int a=5;
	  System.out.println(a);
  }
  @Test
  public void test2() {
	  int b=6;
	  System.out.println(b);
  }
  @Test(invocationCount=4)
  public void test3() {
	  int k=3;
	  System.out.println(k);
  }
}
