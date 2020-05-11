public class Company {

	// Declare the attributes the company will have
	private int c_id;
	private int shares;
	private double price;
	private double capital;
	private int sharesSold;

	// Define a private company constructor
	private Company(int c_id, int shares, double price, double capital, int sharesSold) {
		this.c_id = c_id;
		this.shares = shares;
		this.price = price;
		this.capital = capital;

	}

	// provide getters and setters
	// to be able to access or modify the values
	public int getCid() {
		return c_id;
	}

	public void setCid(int c_id) {
		this.c_id = c_id;
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

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getSharesSold() {
		return sharesSold;
	}

	public void setSharesSold(int SharesSold) {
		this.sharesSold = sharesSold;
	}

	// Provide a toString method in order to print all the values of the objects
	@Override
	public String toString() {
		return "Company ID: " + c_id + " No of Shares: " + shares + " Share Price: " + price + " Capital: " + capital
				+ " Shares Sold: " + sharesSold;
	}

	// Create a nested static Company builder class
	public static class CompanyBuilder {

		private int c_id;
		private int shares;
		private double price;
		private double capital;
		private int sharesSold;

		// Create a constructor for the inner class
		public CompanyBuilder(int c_id, int shares, double price, double capital, int sharesSold) {
			this.c_id = c_id;
			this.shares = shares;
			this.price = price;
			this.capital = capital;
			this.sharesSold = sharesSold;
		}

		// This is the actual method that creates the object
		// passing the values to the outer class
		public Company build() {
			return new Company(c_id, shares, price, capital, sharesSold);
		}

	}

}

