class Form
{
	String name;
	String email;
	String Location;
	Long Phnno;

	String blood;
	String height;
	String wt;

	Form()
	{
		System.out.println("Form generated");
	}
	Form(String name,String email,String Location,Long Phnno)
	{
		this.name=name;
		this.email=email;
		this.Location=Location;
		this.Phnno=Phnno;
	}

	Form(String name,String email,String Location,Long Phnno,String blood)
	{
		this.name=name;
		this.email=email;
		this.Location=Location;
		this.Phnno=Phnno;
	
		this.blood=blood;
	}
	
	Form(String name,String email,String Location,Long Phnno,String blood,String height)
	{
		this.name=name;
		this.email=email;
		this.Location=Location;
		this.Phnno=Phnno;
	
		this.blood=blood;
		this.height=height;
	}
	
	Form(String name,String email,String Location,Long Phnno,String blood,String height,String wt)
	{
		this.name=name;
		this.email=email;
		this.Location=Location;
		this.Phnno=Phnno;
	
		this.blood=blood;
		this.height=height;
		this.wt=wt;
	}
	
	public void displayForm()
	{
		System.out.println(name);
		System.out.println(email);
		System.out.println(Location);
		System.out.println(Phnno);
		System.out.println(blood);
		System.out.println(height);
		System.out.println(wt);
	}



	
}