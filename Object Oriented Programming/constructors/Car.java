class Car
{
	String brand;
	String name;
	String color;
	double price;

	Car()
	{
	
	}
	
	Car(String brand,String name,String Color,double price)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;

			}
	
	public Car showBrand()
	{
		System.out.println(brand);
		return this;
	}

	public Car showName()
	{
		System.out.println(name);
		return this;
	}


	public Car showColor()
	{
		System.out.println(color);
		return this;
	}


	public Car showPrice()
	{
		System.out.println(price);
		return this;
	}


	

}