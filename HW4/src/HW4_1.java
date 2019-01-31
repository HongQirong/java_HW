
public class HW4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		System.out.println("width:" + rectangle1.getWidth() + "\t" + "height:" + rectangle1.getHeight() + "\t" + "area:" + rectangle1.getArea() + "\t" + "perimeter:" + rectangle1.getPerimeter() );
		System.out.println("width:" + rectangle2.getWidth() + "\t" + "height:" + rectangle2.getHeight() + "\t" + "area:" + rectangle2.getArea() + "\t" + "perimeter:" + rectangle2.getPerimeter() );

	}

}

class Rectangle{
	private double width = 1;
	private double height = 1;
	Rectangle(){
		
	}
	Rectangle(double width, double height){
		this.width = width;//物件的寬度=設定的寬度
		this.height = height;//物件的長度=設定的長度
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
}
