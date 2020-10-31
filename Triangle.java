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

   public double getArea(){
     double a = Math.abs((v1.getX() * (v2.getY()-v3.getY()) + v2.getX() * (v3.getY()-v1.getY()) + v3.getX() * (v1.getY()-v2.getX())) / 2) ;
     return a;
   }

   public String classify(){
     double d12= v1.distanceTo(v2);
     double d13= v1.distanceTo(v3);
     double d23= v2.distanceTo(v3);
     //debugging
     //System.out.println(d12+" "+d13+" "+d23);
     if( (Math.abs(d12 - d13) < 0.001) && (Math.abs(d23 - d13) < 0.001))
       return "equilateral";
       if(d12 == d13 || d23 == d13 || d12 == d23)
         return "isosceles";
     return "scalene";
   }

}
