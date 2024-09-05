class Fruit
{
	String name;
	String color;
	String taste;
	double price;
	String origin;

	Fruit()
	{
	
	}
	
	Fruit(String name, String color, String taste, double price, String origin)
	{
			this.name=name;
			this.color=color;
			this.taste=taste;
			this.price=price;
			this.origin=origin;

	}
	
	public Fruit showName()
	{
		System.out.println(name);
		return this;
	}

	public Fruit showColor()
	{
		System.out.println(color);
		return this;
	}


	public Fruit showTaste()
	{
		System.out.println(taste);
		return this;
	}


	public Fruit showPrice()
	{
		System.out.println(price);
		return this;
	}


	public Fruit showOrigin()
	{
		System.out.println(origin);
		return this;
	}
}