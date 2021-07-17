package keywordsInTestNG;

import org.testng.annotations.Test;

public class PriorityNewTest {
  @Test(priority=0)
  public void test1() {
	  System.out.println("Test 1");
  }
  @Test(priority=0)
  public void test2() {
	  System.out.println("Test 2");
  }
  @Test(priority=-1)
  public void test3() {
	  System.out.println("Test 3");
  }
  @Test
  public void test4() {
	  System.out.println("Test 4");
  }
  @Test(priority=8)
  public void test5() {
	  System.out.println("Test 5");
  }
}
