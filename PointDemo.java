public class PointDemo {
    public static void main(String[] args) {
		System.out.println();
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("Original point co-ordinates: " + mp);
        mp.move();
		System.out.println();
		
        System.out.println("Point co-ordinates after the move: " + mp);
		System.out.println();
		System.out.println("I don't know how to print the point after the move without also displaying the x & y speeds. Can you help with this?");
    }
}