class Form 
{
	String name ;
	long phno ;
	String email ;
	String dob ;
	char gender ;
	String location ;
	String education ;
	String blood ;
	String status ;
	int tele ;
	String pan ;
	String aadhar ;

	Form(){
		System.out.println("Form no arguement constructor");
	}

	Form(String name,long phno,String email,String dob,char gender,String location,String edu)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.location = location;
		education = edu;

		System.out.println("Values are loaded");

	}

	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.location = location;
		education = edu;
		this.blood = blood;
		System.out.println("Values loaded");
	}


	public void displayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("phno: "+phno);
		System.out.println("email: "+email);
		System.out.println("dob: "+dob);
		System.out.println("gender: "+gender);
		System.out.println("location: "+location);
		System.out.println("education: "+education);
		System.out.println("Blood: "+blood);
		System.out.println("Status: "+status);
		System.out.println("*************************");
		

	}
}
