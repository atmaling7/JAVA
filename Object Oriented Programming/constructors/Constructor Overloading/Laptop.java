class laptop
{
	String name;
	String ram;
	String rgb;
	double price;

	String Accesories;
	String Antivirus;
	String Pendrive;
	
	laptop()
	{
		System.out.println("Laptop generated");
		
	}
	
	laptop(String name,String ram,String rgb,double price)
	{
		this.name=name;
		this.ram=ram;
		this.rgb=rgb;
		this.price=price;
	}
	
	laptop(String name,String ram,String rgb,double price,String Accesories)
	{
		this.name=name;
		this.ram=ram;
		this.rgb=rgb;
		this.price=price;

		this.Accesories=Accesories;

		
	}

	laptop(String name,String ram,String rgb,double price,String Accesories,String Antivirus)
	{
		this.name=name;
		this.ram=ram;
		this.rgb=rgb;
		this.price=price;

		this.Accesories=Accesories;
		this.Antivirus=Antivirus;

		
	}

	laptop(String name,String ram,String rgb,double price,String Accesories,String Antivirus,String Pendrive)
	{
		this.name=name;
		this.ram=ram;
		this.rgb=rgb;
		this.price=price;

		this.Accesories=Accesories;
		this.Antivirus=Antivirus;
		this.Pendrive=Pendrive;

		
	}
	
	public void displaylaptop()
	{
		System.out.println(name);
		System.out.println(ram);
		System.out.println(rgb);
		System.out.println(price);
		System.out.println(Accesories);
		System.out.println(Antivirus);
		System.out.println(Pendrive);
	}



}