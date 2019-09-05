public class Circle {
    private double radius;
    private String color = "red";

    public double getRadius()
    {
        return this.radius;
    }
     public void setRadius( double radius)
     {
         this.radius = radius;
     }

     public String getColor()
     {
         return this.color;
     }

     public void setColor(String color)
     {
         this.color=color;
     }

     public Circle()
     {

     }

     public Circle(double radius, String color)
     {
          this.radius = radius;
          this.color = color;
     }

     public double getArea ()
     {
         return radius*radius*Math.PI;
     }

     public String toString ()
     {
          return "A Circle radius "+ getRadius() +"color"+getColor();
     }

}

  class Cylinder extends  Circle
 {
   private double height;

     public static void main(String[] args) {
         Cylinder cy = new Cylinder();
         System.out.println(cy);
         cy = new Cylinder(2.5,"red",2.5);
         System.out.println(cy);
     }
     public double getHeight()
     {
         return this.height;
     }
     public void setHeigt( double height)
     {
         this.height = height;
     }



     public Cylinder()
     {

     }

     public Cylinder(double radius, String color, double height)
     {
         super(radius,color);
         this.height = height;
     }

     public double getArea ()
     {
         return super.getRadius()*super.getRadius()*Math.PI*height;
     }

     public String toString ()
     {
         return "A Cylinder radius "+super.getRadius() +"color"+super.getColor()+"height"+getHeight();
     }

 }


