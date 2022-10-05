package Java111Q1;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.Cal_area(10);
		c.Cal_area(4,5,6);
	}
}
class circle{
	double pi = 3.14159;
	double radius;
	int length;
	int width;
	int height;
	double x; //體積
	int area;
	void Cal_area(int r) {
		radius = r;
		x = (4.0/3.0*pi*Math.pow(radius, 3));
		System.out.println("半徑= "+ radius);
		System.out.printf("球型體積= %.1f",x);
		System.out.println();
		System.out.println();
	}
	void Cal_area(int l,int w,int h) {
		length = l;
		width = w;
		height = h;
		area = length*width*2 + width*height*2 + length*height*2;
		System.out.println("長 = "+ length + ",寬 = "+width + ",高 = "+ height);
		System.out.println("立方表面積 = " + area);
	}
}
