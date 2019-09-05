public class Point {
    private float x;
    private float y;
    public Point(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    public Point()
    {

    }

    public float getX()
    {
         return this.x;
    }

    public void setX(float x)
    {
        this.x=x;
    }
    public float getY()
    {
        return this.y;
    }

    public void setY(float y)
    {
        this.y=y;
    }
    public float[] getXY()
    {
        float[] xy = { this.getX(), this.getY() };
        return xy;
    }

    public void setXY(float x,float y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "A Point is"+getX()+" and "+getY();
    }
}


class MovablePoint extends Point
{
     private float xSpeed;
     private float ySpeed;

     public MovablePoint(float x,float y,float xSpeed, float ySpeed)
     {
         super.setXY(x,y);
         this.xSpeed= xSpeed;
         this.ySpeed = ySpeed;
     }
    public MovablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint()
    {

    }

    public float getXspeed()
    {
        return this.xSpeed;
    }
     public float getYspeed()
     {
         return this.ySpeed;
     }
    public void setXspeed(float xSpeed)
    {
         this.xSpeed= xSpeed;
    }
    public void setYspeed(float ySpeed)
    {
         this.ySpeed =ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed)
    {

        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }


    public float[] getSpeed()
    {

       float[] xy = {this.getXspeed(),this.getYspeed()};
       return xy;
    }
     public String toString()
     {

        return "a MovablePoint is "+super.toString()+" and "+this.getXspeed()+this.getYspeed();
     }
 public MovablePoint move()
{
    this.setX(this.getX()+this.xSpeed);
    this.setY(this.getY()+this.ySpeed);
    return this;
}

    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(1,2,3,3);
//         mv.getSpeed();
//         mv.toString();

        System.out.println(mv.move());
    }
}
