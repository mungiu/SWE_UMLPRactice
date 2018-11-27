package View;

public abstract class Shape
{
	//class lvl
	private COLOR color = COLOR.BLUE;
	//package level and subclass level from other packages as well
	protected int xPos;
	protected int yPos;

	//package level and subclass level from same package only
	boolean isVisible = true;
	private static int noOfShapes = 0;

	public Shape(int xPos, int yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;

		noOfShapes++;
	}

	public abstract void draw();

	public abstract void erase();

	public void show()
	{

	}

	public void hide()
	{

	}

	public COLOR getColor()
	{
		return color;
	}

	public static int getNoOfShapes()
	{
		return noOfShapes;
	}


}
