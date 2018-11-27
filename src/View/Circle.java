package View;

public class Circle extends Shape
{
	private int radius;

	public Circle(int xPos, int yPos, int radius)
	{
		super(xPos, yPos);
		this.radius = radius;
	}

	public void draw()
	{
		//TODO Implement
	}

	public void erase()
	{
		//TODO implement
	}

	public int getRadius()
	{
		return radius;
	}
}
