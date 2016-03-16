

class Rectangle {
	int height, width, x, y;

	Rectangle() {
	}//important

	Rectangle(int _h, int _w, int _y, int _x) {
		this.height =_h;
		this.width =_w;
		this.x =_x;
		this.y =_y;
		//set value
	}

	int getWidth() {
		return this.width;
		//finish the method
	}

	int getheight() {
		return this.height;
		//finish the method
	}
    int getx() {
    	return this.x;
    }
    int gety() {
    	return this.y;
    }
	public String toString() {
		return"java.Rectangle[x = "+this.x+",y = "+this.y+",height = "+this.height+"width = "+this.width;
		//finish the method
	}
}

public class RectangleTester{
	public static void main(String[] args) {
		System.out.println("=========hello! program is running==========\n");
		Rectangle rectangle1 = new Rectangle (18, 57, 25, 15);
		//please new a object and get the properties.
		System.out.println(rectangle1);
		System.out.println("Area = " + 1.0 * 57 * 18);
		System.out.println("Perimeter = " + 2.0 * (57 + 18));

		System.out.println();//blank line
		
		//please new another object and get the properties.
		Rectangle rectangle2 = new Rectangle (47,60,12,0);
		System.out.println(rectangle2);
		System.out.println("Area = " + 1.0 * 60 * 47);
		System.out.println("Perimeter = " + 2.0 * (60 + 47));
		System.out.println("\n===============End of Output!===============");
	}
}

