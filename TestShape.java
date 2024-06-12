public class TestShape {
    public static void main(String[] args) {
		System.out.println();
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

		System.out.println();
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2.toString());

		System.out.println();
        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println(shape2.toString());
		System.out.println();
    }
}

