package task1;
import java.util.Date;

public abstract class GeometricObject {
	
	private String color;
	private Boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		
		this.color="white";
	}
	
	public GeometricObject(String color, Boolean filled) {
		
		setColor(color);
		setFilled(filled);
		
	}
	
	public String getColor() {
		
		return this.color;
		
	}
	
	public void setColor(String color) {
		
		this.color=color;
		
	}
	
	public Boolean isFilled() {
		
		return this.filled;
	}
	
	public void setFilled(Boolean filled) {
		
		this.filled=filled;
	}
	
	public Date getDateCreated() {
		
		return this.dateCreated;
	}
	
	public String toString() {
		return "this object was created on " + dateCreated + ". It is " +  color + ", and it's filled property is  " + filled + " .";
	}

}
