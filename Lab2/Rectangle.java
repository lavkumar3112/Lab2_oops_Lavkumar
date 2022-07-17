public class Rectangle implements IShape{
	int height,width;
	String color;
	
	
	public Rectangle(String color,int height,int width){
		this.color=color;
		this.height=height;
		this.width=width;
	}
	@Override
	public double calculateArea(){
		return (this.height*this.width);
	}
	@Override
	public double calculatePerimeter(){
		return (2*(this.height+this.width));
	}
	

}