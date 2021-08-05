public class Circle {
    public static final float PI = 3.14f;
    //Attributes
    private float radius;
    private Point center;

    //Constructor

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    //Methods
    public float getArea(){
        return this.radius * this.radius * PI;
    }

    //getters
    public float getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return ("[radius:"+this.radius+",centre:"+this.center+"]");
    }
}
