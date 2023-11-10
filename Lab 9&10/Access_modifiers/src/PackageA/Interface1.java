package PackageA;

public interface Interface1 {
	default void method1() {
    	System.out.println("Int the public method of parent");
    }
	void method2();
}
