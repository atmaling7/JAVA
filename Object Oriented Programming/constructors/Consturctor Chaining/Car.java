class Car
{
	String brand;
	String name;
	String color;
	double price;

	String ambientlight;
	String airbag;
	String gps;

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

	Car(String brand,String name,String Color,double price,String ambientlight)
	{
		this(brand,name,Color,price);

		this.ambientlight=ambientlight;
	}
	
	Car(String brand,String name,String Color,double price,String ambientlight,String airbag)
	{
		this(brand,name,Color,price,ambientlight);
	
			
		this.airbag=airbag;
	}

	Car(String brand,String name,String Color,double price,String ambientlight,String airbag,String gps)
	{
		this(brand,name,Color,price,ambientlight,airbag);
	
			
		this.gps=gps;
	}

	public void displayCar()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(ambientlight);
		System.out.println(airbag);
		System.out.println(gps);
	}

}