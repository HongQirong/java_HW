
public class HW4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D c1 = new Circle2D(2, 2, 2.5);
		System.out.println("area:" + c1.getArea() + "\nperimeter" + c1.getPerimeter());
		System.out.println("c1.contains(3, 3) is " + c1.contains(3, 3) + "\nc1.contains(new Circle2D(4, 5, 8.5)) is " + c1.contains(new Circle2D(4, 5, 8.5)) + "\nc1.overlaps(new Circle2D(3, 5, 0.3)) is " + c1.overlaps(new Circle2D(3, 5, 0.3)));
	}

}
class Circle2D{
	private double x, y, radius;
	Circle2D(){
		x = 0;
		y = 0;
		radius = 3;
	}
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	double getY() {
		return y;
	}
	double getX() {
		return x;
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	double getPerimeter() {
		return 2 * radius * Math.PI;
 	}
	//兩點間的距離<=園的半徑才會在圓裡
	boolean contains(double x, double y) {
		if (distance(x, y) <= radius) {
			return true;
		}
		return false;
	}
	//兩點間的距離
	double distance(double x, double y) {
		return Math.pow((Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)), 0.5);
	}
	//兩點間的距離加上判斷的輸入圓的半徑<=一開始圓的半徑,才會是在一開始圓裡
	boolean contains(Circle2D circle) {
		if(distance(circle.getX(), circle.getY()) + circle.getRadius() <= radius) {
			return true;
		}
		return false;
	}
	//兩點間的距離>=兩圓半徑相加必定沒有重疊,相切和重疊不一樣
	boolean overlaps(Circle2D circle) {
		if (distance(circle.getX(), circle.getY()) >= circle.radius + radius) {
		return false;
		}
		return true;
	}
}
