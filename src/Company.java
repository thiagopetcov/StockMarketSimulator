public class Company {

	// Declare the attributes the company will have
	private int id;
	private int shares;
	private double price;

	// Define a private company constructor
	private Company(int id, int shares, double price) {
		this.id = id;
		this.shares = shares;
		this.price = price;

	}

	// provide getters and setters
	// to be able to access or modify the values
	public int getCid() {
		return id;
	}

	public void seid(int id) {
		this.id = id;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	// Provide a toString method in order to print all the values of the objects
	@Override
	public String toString() {
		return "Company ID: " + id + " No of Shares: " + shares + " Share Price: " + price;
	}

	// Create a nested static Company builder class
	public static class CompanyBuilder {

		private int id;
		private int shares;
		private double price;

		// Create a constructor for the inner class
		public CompanyBuilder(int id, int shares, double price) {
			this.id = id;
			this.shares = shares;
			this.price = price;
		}
	

		// This is the actual method that creates the object
		// passing the values to the outer class
		public Company build() {
			return new Company(id, shares, price);
		}

	}

}

