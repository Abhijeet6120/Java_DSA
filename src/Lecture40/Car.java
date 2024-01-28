package Lecture40;

public class Car {      //implements Comparable<Car>
	
	int Price;
	int speed;
	String color;

	public Car() {
		
	}
	
	public Car(int Price, int speed, String color) {
		this.color = color;
		this.Price = Price;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return ("price : "+ this.Price + " Speed: "+ this.speed + " Color: "+ this.color);
	}
/*
	@Override
	public int compareTo(Car o) {						// Used to non primitive data type to compare(o=Other)
		// TODO Auto-generated method stub
//		return this.Price - o.Price;
//		return o.speed - this.speed;
		return this.color.compareTo(o.color);
	}
	
	*/

}
