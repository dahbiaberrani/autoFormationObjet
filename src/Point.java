public class Point{
    //Attributes
    private float x;
    private float y;

    //Constructor
    public Point(float _x, float _y){
        this.x = _x;
        this.y = _y;
    }

    //Methods
    //Getters
    public float getX(){
        return  this.x;
    }
    public  float getY(){
        return  this.y;
    }

    //Setters
    public void setX(float _x){
        this.x = _x;
    }

    public void setY(float _y) {
        this.y = _y;
    }

   @Override
    public String toString(){
        return ("("+this.x+","+this.y+")");
    }


}