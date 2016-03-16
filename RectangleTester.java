/*
 * [C]68
 * [TA's advise]
 * 1.Good job!
 * 2.沒有使用到自訂method, 這部分扣2分.
 * 3.我必須依照規定將你的分數從等第C開始作為計算, 若以後對於作業上有問題, 或許你可以和我約時間討論.
 * */

class Rectangle {
	int height, width, x, y;

	Rectangle() {
		//this(-1,-1,-1,-1);//加上這行實踐物件初始化會讓程式更好
	}// important

	Rectangle(int _h, int _w, int _y, int _x) {
		this.height = _h;
		this.width = _w;
		this.x = _x;
		this.y = _y;
		// set value
	}

	int getWidth() {
		return this.width;
		// finish the method
	}

	int getheight() {
		return this.height;
		// finish the method
	}

	int getx() {
		return this.x;
	}

	int gety() {
		return this.y;
	}

	public String toString() {
		return "java.Rectangle[x = " + this.x + ",y = " + this.y + ",height = " + this.height + "width = " + this.width;
		// finish the method
	}
}

public class RectangleTester {
	public static void main(String[] args) {
		System.out.println("=========hello! program is running==========\n");
		Rectangle rectangle1 = new Rectangle(18, 57, 25, 15);
		// please new a object and get the properties.
		System.out.println(rectangle1);

		//你已經完成了method 何不用它呢?
		
		System.out.println("Area = " + 1.0 * 57 * 18);
		System.out.println("Perimeter = " + 2.0 * (57 + 18));

		System.out.println();// blank line

		// please new another object and get the properties.
		Rectangle rectangle2 = new Rectangle(47, 60, 12, 0);
		System.out.println(rectangle2);
		System.out.println("Area = " + 1.0 * 60 * 47);
		System.out.println("Perimeter = " + 2.0 * (60 + 47));
		System.out.println("\n===============End of Output!===============");
	}
}
