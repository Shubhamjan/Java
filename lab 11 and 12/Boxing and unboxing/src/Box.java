
public class Box {
	public static void main(String[] args) {
        //Boxing
        int counter = 30;
        Integer boxed = counter;
        System.out.println("Boxed Counter: " + boxed);
        //UnBoxing
        int unboxed = boxed;
        System.out.println("Unboxed Counter: " + unboxed);
    }
}
