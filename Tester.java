public class Tester{
  public static void main(String[] args) {
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);

    // part 2.3
    Point point1 = new Point(x1, y1);
    Point point2 = new Point(x2, y2);

    System.out.println("The distance between points (x1,x2) and (y1,y2) is " + point1.distanceTo(point2));
    System.out.println("The points (x1,x2) and (y1,y2) are equal? " + point1.equals(point2));

    // part 2.4
    double x3 = Double.parseDouble(args[4]);
    double y3 = Double.parseDouble(args[5]);

    Point point3 = new Point(x3, y3);
    Triangle a = new Triangle(point1, point2, point3);
    System.out.println("The perimeter of this triangle is " + a.getPerimeter());

    System.out.println("The area of this triangle is " + a.getArea());
    }

}
