package task1;

public class Triangle extends GeometricObject{
	
	private long Side1;
	private long Side2;
	private long Side3;
	
	
	public Triangle(long Side1, long Side2, long Side3,String color, Boolean filled) {
		super(color, filled);
		
		this.Side1=Side1;
		this.Side2=Side2;
		this.Side3=Side3;
		
	}
	
	
	public long getSide1() {return this.Side1;}
	public long getSide2() {return this.Side2;}
	public long getSide3() {return this.Side3;}
	
	
	
	public long Perimeter() {
		
		return getSide1()+getSide2()+getSide3();
		
		
	}
	
	public double Area() {
		
		double semiper=0.5*(getSide1()+getSide2()+getSide3());
		
		double root=semiper*(semiper-getSide1())*(semiper-getSide2())*(semiper-getSide3());

		return Math.sqrt(root);
	}
	
	public String toString() {
		return "Its colour is " +  super.getColor()+ ", and its filled property is " + super.isFilled() + " .";
	}

}
