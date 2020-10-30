public class Point{
  private double x,y;

 //construct a point given coordinates
  public Point(double X, double Y){
   x=X;
   y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
   x= p.x;  //private access in the same file is allowed!
   y= p.y;
  }

  public double getX(){
   return x;
  }

  public double getY(){
   return y;
  }

  public static double distanceTo(double x1, double y1, double x2, double y2){
    double d = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    return d;
    }



  // public boolean equals(x1, y1, x2, y2){
  //   return(x1 == x2 && y1 == y2);
  // }

}
