public class Triangle{
  private Point v1,v2,v3;

   public Triangle(Point _a, Point _b, Point _c){
     this.v1 = _a;
     this.v2 = _b;
     this.v3 = _c;
   }

   public Triangle(double _x1, double _y1,double _x2, double _y2,double _x3, double _y3){
     this.v1 = new Point(_x1,_y1);
     this.v2 = new Point(_x2,_y2);
     this.v3 = new Point(_x3,_y3);
   }

   public double getPerimeter(){
     double d12= v1.distanceTo(v2);
     double d13= v1.distanceTo(v3);
     double d23= v2.distanceTo(v3);
     return d12 + d13 + d23;
   }


}
