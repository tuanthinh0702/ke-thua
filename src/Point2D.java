public class Point2D {
    private float x ;
    private float y ;
     Point2D(float x , float y)
     {
          this.x = x;
          this.y = y;
     }

     Point2D()
     {

     }
     public float getX()
     {
          return this.x;
     }

      public void set(float X)
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

    public void setXY(float x, float y)
    {
         this.x= x;
         this.y = y;
    }
    public float[] getXY()
    {
       float[] xy = {this.getX(),this.getY()};
       return xy;
    }
     public String toString ()
     {
          return "Point x is:"+getX()+"AND"+getY();
     }

}

 class Point3D extends Point2D
{
 private float z;

    public static void main(String[] args) {
        Point3D d3 = new Point3D(1,2,3);
         d3.toString();
        System.out.print(d3);
    }

    public Point3D(float x , float y,float z)
    {
       super(x,y);
       this.z=z;
    }

   public Point3D()
    {

    }
    public float getZ()
    {
        return this.z;
    }

    public void setZ(float z)
    {
        this.z=z;
    }


    public void setXYZ(float x, float y,float z)
    {
     super.setXY( x, y);
      this.z=z;
    }
    public float[] getXYZ()
    {
       float[] xyz = {super.getX(),super.getY(),this.getZ()};
       return xyz;
    }

    public String toString ()
    {
        return "Point x is:"+super.getX()+" AND "+super.getY()+" AND "+getZ();
    }


}