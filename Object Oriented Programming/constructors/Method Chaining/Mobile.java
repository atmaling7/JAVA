class Mobile
{
	String brand;
	String name;
	double price;

	String discount;

	Mobile()
	{
	
	}
	
	Mobile(String brand, String name, double price, String discount)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.discount=discount;
	}
	
	public Mobile showBrand()
	{
		System.out.println(brand);
		return this;
	}
	
	public Mobile showName()
	{
		System.out.println(name);
		return this;
	}

	public Mobile showPrice()
	{
		System.out.println(price);
		return this;
	}

	public Mobile showDiscount()
	{
		System.out.println(discount);
		return this;
	}

	
}