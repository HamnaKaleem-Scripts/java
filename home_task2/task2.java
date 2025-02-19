import javax.swing.*;
class Shape{
	// public static void main (String[] args){}
	private double area;
	private double volume;

		
	public Shape() {
		area = 0.0;
		volume = 0.0;
	}
	public Shape(double area_1, double volume_1) {
        area = area_1;
        volume = volume_1;
    }

    public Shape(Shape shape) {
        area = shape.area;
        volume = shape.volume;
    }
	public void getinput(){
		String area_1 =JOptionPane.showInputDialog("Please Enter area ");
		area= Double.parseDouble(area_1);
		
		String  volume_1 =JOptionPane.showInputDialog("Please Enter volume ");
		volume= Double.parseDouble(volume_1);
	}
	public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }

    public void setarea(double area_1) {
        area = area_1;
    }

    public void setvolume(double volume_1) {
        volume = volume_1;
    }
	public String tostring(){
		return "area = "+area + "volume ="+volume ;
		
		
	}
	
}
class Square extends Shape{
	private double width;
    private double length;
    private double height;

    public Square() {
        super();
        width = 0.0;
        length = 0.0;
        height = 0.0;
    }
	public Square (double length_1,double width_1,double height_1){
		super(length_1*width_1,length_1*width_1*height_1);
		length=length_1;
		width=width_1;
		height=height_1;
	}
	public void getinput(){
		String width_1 =JOptionPane.showInputDialog("Please Enter width ");
		width= Double.parseDouble(width_1);
		
		String length_1 =JOptionPane.showInputDialog("Please Enter length ");
		length= Double.parseDouble(length_1);
		
		String height_1 =JOptionPane.showInputDialog("Please Enter height ");
		height= Double.parseDouble(height_1);
		
		setarea(width * length);
        setvolume(width * length * height);
	}
	@Override
	public String tostring(){
		
		return "Width: " + width + ", Length: " + length + ", Height: " + height+super.tostring() ;
		
	}
}
class Sphere extends Shape {
   
    private double radius;
    private double Pi = 3.14;

    public Sphere() {
        super();
        radius = 0.0;
    }

    public Sphere(double radius_1) {
        super(4 * 3.14 * radius_1 * radius_1, (4.0 / 3.0) * 3.14 * radius_1 * radius_1 * radius_1); 
        radius = radius_1;
    }
	public void getinput(){
		String radius_1=JOptionPane.showInputDialog("Please Enter radius ");
		radius= Double.parseDouble(radius_1);
		
		
	}
    public String tostring() {
        return "Radius: " + radius + super.tostring() ;
    }
}


	

public class task2 {
    public static void main(String[] args) {
        Square square1 = new Square();
        Sphere sphere1 = new Sphere();
        
        square1.getinput();
        JOptionPane.showMessageDialog(null, square1.tostring());

        sphere1.getinput();
        JOptionPane.showMessageDialog(null, sphere1.tostring());

        Square square2 = new Square(5.0, 6.0, 7.0);
        Sphere sphere2 = new Sphere(3.0);
        
        JOptionPane.showMessageDialog(null, "Predefined Square: " + square2.tostring());
        JOptionPane.showMessageDialog(null, "Predefined Sphere: " + sphere2.tostring());
    }
}
