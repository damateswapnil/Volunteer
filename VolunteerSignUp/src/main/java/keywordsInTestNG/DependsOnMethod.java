package keywordsInTestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	int a;
  @Test
  public void f1() {
	  a=4;
  }
  @Test
  public void f2() {
	  int b=4;
  }
  @Test(dependsOnMethods="f1")
  public void f3() { 
	 int c=a;
	 System.out.print(c);
  }
}
