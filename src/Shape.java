import javax.crypto.Cipher;

public class Shape {

       private String color = "green";
       private boolean filled = true ;

       public Shape()
       {
          // contructor không tham số
       }
       public  Shape(String color ,boolean filled)
       {
           this.color = color;
           this.filled = filled;
       }

        public String getColor()
        {
            return this.color;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public  boolean isFilled()
        {
            return this.filled;
        }
        public void setFilled(boolean filled)
        {
            this.filled = filled;

        }

        public String  toString()
        {
            return "A Shape with color of"
                    + getColor()
                    + "and"
                    +(isFilled() ? "filled":"not filled");
        }


 public class Circle extends Shape
    {
        private double radius =1.0;
        public Circle()
        {

        }

        public Circle ( double radius, String color, boolean filled)
        {
            super(color,filled);
            this.radius = radius;
        }

        public double getRadius()
        {
            return this.radius;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public double getArea ()
        {
             return radius*radius*Math.PI;
        }

        public double getPerimeter()
        {
            return 2*radius*Math.PI;
        }

        public String toString()
        {
            return "A Circle with radius="+ getRadius() +", Which is a subclass of yyy"+super.toString();
        }


    }
   public class Rectangle extends Shape
    {
        private double width ;
        private double length;

        public Rectangle()
        {

        }
        public Rectangle(double width , double length,String color, boolean filled )
        {
            super(color, filled);
            this.width = width;
            this.length = length;

        }

        public double getWidth()
        {
            return this.width;
        }

        public double getLength()
        {
            return this.length;
        }

        public void setWidth(double width)
        {
            this.width = width;
        }

        public void setLength(double length)
        {
            this.length = length;
        }

        public double getArea ()
        {
            return width*length;
        }

        public double getPerimeter()
        {
            return (width+length)*2;
        }

        public String toString()
        {
             return "A Rectangle with width ="+getWidth()+"and "+getLength()+"which is a subclass of"+super.toString();
        }

    }
//     public class Square extends Rectangle
//     {
//         public  Square()
//         {
//
//         }
//         public Square(double width , double length)
//         {
//             super(width,length);
//         }
//
//
//     }
}
