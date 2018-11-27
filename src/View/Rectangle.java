package View;

public class Rectangle extends Shape
{
	protected double height;
	protected double width;

	public Rectangle(int xPos, int yPos)
	{
		super(xPos, yPos);
	}

	@Override
	public void draw()
	{

	}

	@Override
	public void erase()
	{

	}

	public double getHeight()
	{
		return height;
	}

	public double getWidth()
	{
		return width;
	}
}
