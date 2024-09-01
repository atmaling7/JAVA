class Car 
{
	String company;
	String carName;
	double price;
	String type;
	String sunRoof;
	String airBags;


	Car()
	{
		//No rguement constructor
	}

	Car(String company,String carName, double price, String type)
	{
		this.company = company;
		this.carName = carName;
		this.price = price;
		this.type = type;
		System.out.println("values loaded");
	}

	Car(String company,String carName, double price, String type,String sunRoof,String airBags)
	{
		this.company = company;
		this.carName = carName;
		this.price = price;
		this.type = type;
		this.sunRoof = sunRoof;
		this.airBags = airBags;
	}

	public void displayDetails()
	{
		System.out.println("Company : "+company);
		System.out.println("Car Name : "+carName);
		System.out.println("Price : "+price);
		System.out.println("Type : "+type);
		System.out.println("SunRoof : "+sunRoof);
		System.out.println("AirBags: "+airBags);
		System.out.println("*************************");
	}


}

