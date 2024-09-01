class FormDriver 
{
	public static void main(String[] args) 
	{	
		Form f1 = new Form("Amit",8660387175l,"amit@gmail.com","1/11/2002",'M',"Bidar","B.E");

		f1.displayForm();

		Form f2 = new Form();

		f2.displayForm();

		Form f3= new Form("Abhay",8660378175l,"abhay@gmail.com","1/11/2002",'M',"pune","B.E","B+");

		f3.displayForm();
	}
}
