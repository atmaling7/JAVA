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
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;

		this.ambientlight=ambientlight;
	}
	
	Car(String brand,String name,String Color,double price,String ambientlight,String airbag)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;

		this.ambientlight=ambientlight;
		this.airbag=airbag;
	}

	Car(String brand,String name,String Color,double price,String ambientlight,String airbag,String gps)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;

		this.ambientlight=ambientlight;
		this.airbag=airbag;
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