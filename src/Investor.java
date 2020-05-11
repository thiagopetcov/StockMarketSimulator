import java.util.ArrayList;
import java.util.HashSet;


public class Investor {

	// Declare the attributes the Investor will have
	private int i_id;
	private double budget;
	private int i_shares;

	// Define a private investor constructor
	private Investor(int i_id, double budget, int i_shares) {
		this.i_id = i_id;
		this.budget = budget;
		this.i_shares = i_shares;

	}

	// provide getters and setters
	// to be able to access or modify the values
	public int getIid() {
		return i_id;
	}

	public void setIid(int i_id) {
		this.i_id = i_id;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getIShares() {
		return i_shares;
	}

	public void setIShares(int i_shares) {
		this.i_shares = i_shares;
	}

	// Provide a toString method in order to print all the values of the objects
	@Override
	public String toString() {
		return "Ivestor ID: " + i_id + " Budget: " + budget + " No of invested Shares: " + i_shares;
	}

	// Create a nested static Investor builder class
	public static class InvestorBuilder {

		private int i_id;
		private double budget;
		private int i_shares;

		// Create a constructor for the inner class
		public InvestorBuilder(int i_id, double budget, int i_shares) {
			this.i_id = i_id;
			this.budget = budget;
			this.i_shares = i_shares;

		}

		// This is the actual method that creates the object
		// passing the values to the outer class
		public Investor build() {
			return new Investor(i_id, budget, i_shares);
		}

	}

}
