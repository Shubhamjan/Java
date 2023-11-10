import PackageA.Child;
import PackageA.Parent;
import PackageB.child2;
import PackageB.interfaceClass;

public class Main {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.method2();
		//c1.method3();//it is protected
		
		child2 c2=new child2();
		c2.method2();//public method 
		//c2.method3();//protected method
        interfaceClass i1=new interfaceClass();
        i1.method1();
        i1.method2();
	}

}
