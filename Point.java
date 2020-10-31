public class Point{
  private double x,y;

 //construct a point given coordinates
  public Point(double _x, double _y){
   this.x= _x;
   this.y= _y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point _p){
   this.x= _p.x;  //private access in the same file is allowed!
   this.y= _p.y;
  }

  public double getX(){
   return x;
  }

  public double getY(){
   return y;
  }

  // part 2.3
  public double distanceTo(Point _other){
    double d = Math.sqrt( Math.pow((_other.x-this.x), 2) + Math.pow((_other.y-this.y), 2));
    return d;
    }

  public boolean equals(Point _other){
    return(this.x == _other.x && this.y == _other.y);
  }

  public String toString(){
    return("(" + String.valueOf(this.x) + ", " + String.valueOf(this.y) + ")");
  }

}
