public class Square extends Rectangle{
	
	public Square(String color,int side){
		super(color,side,side);
	}
	
@Override
	public double calculateArea(){
		System.out.println("Calculate area in square is called");
		return (this.height*this.width);
	}
}