class Form
{
	String name;
	String email;
	String Location;
	String Phnno;
	
	String blood;
	String height;
	String wt;

	Form()
	{
	
	}

	Form(String name,String email,String Location,String Phnno)
	{
		this.name=name;
		this.email=email;
		this.Location=Location;
		this.Phnno=Phnno;
	}
	
	Form(String name,String email,String Location,String Phnno,String blood)
	{
		this(name,email,Location,Phnno);
		this.blood=blood;
	}
	
	Form(String name,String email,String Location,String Phnno,String blood,String height)
	{
		this(name,email,Location,Phnno,blood);
		this.height=height;
	}

	Form(String name,String email,String Location,String Phnno,String blood,String height,String wt)
	{
		this(name,email,Location,Phnno,blood,height);
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