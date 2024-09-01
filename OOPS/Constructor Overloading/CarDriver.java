class CarDriver 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("Toyota","Fortuner",4000000.00,"Diesel");
		c1.displayDetails();

		Car c2 = new Car(); // null values
		c2.displayDetails();

		Car c3 = new Car("Tata","Harrier",3000000.00,"Diesel","Yes","Yes");
		c3.displayDetails();

	}
}
