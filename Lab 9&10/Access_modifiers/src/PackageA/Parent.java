package PackageA;

public class Parent {
    private void method1() {
    	System.out.println("In the private method of parent");
    }
    public void method2() {
    	System.out.println("Int the public method of parent");
    }
    protected void method3() {
    	System.out.println("Int the protected method of parent");
    }
    //default method only available in interface
//    default void method4() {
//    	System.out.println("In the public method of parent");
//    }
}
