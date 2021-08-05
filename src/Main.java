public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World with java");
        Point p1 = new Point(5, 8);
        Point p2 = new Point(5, 8);
        System.out.println(p1);
        System.out.println(p2);
        p2.setY(78);
        System.out.println(p2);
        System.out.println(p1);
        p1.setY(100);
        System.out.println(p1);
        p1.setX(52);
        System.out.println(p1);


        Circle circle1 = new Circle(5, new Point(5,8));
        System.out.println(circle1);
        Point z = circle1.getCenter();
        z.setX(15);
        System.out.println(circle1);
        System.out.println(z);
        System.out.println("la surface du cercle1 est de :"+ circle1.getArea());
    }
}
