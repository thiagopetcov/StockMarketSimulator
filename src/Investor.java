 import java.util.ArrayList;
import java.util.HashSet;


public class Investor {

	// Declare the attributes the Investor will have
	private int id;
	private double budget;
	private String Investor;
	

    String[] shares = new String[]{"ARM", "IBM", "Google", "Facebook", "Twitter", "Samsung", "Lenovo", "Intel"};

    ArrayList list = (ArrayList) Arrays.asList(shares);

    System.out.println("String array converted to List");

    for(int i=0; i < list.size(); i++)
    {
        System.out.println(list.get(i));
    }

	// Define a private investor constructor
	private Investor(int id, double budget) {
		this.id = id;
		this.budget = budget;
		
	}

	// provide getters and setters
	// to be able to access or modify the values
	public int getIid() {
		return id;
	}

	public void setIid(int i_id) {
		this.id = i_id;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	// Provide a toString method in order to print all the values of the objects
	@Override
	public String toString() {
		return "Ivestor ID: " + id + " Budget: " + budget;
	}

	// Create a nested static Investor builder class
	public static class InvestorBuilder {

		private int id;
		private double budget;

		// Create a constructor for the inner class
		public InvestorBuilder(int id, double budget) {
			this.id = id;
			this.budget = budget;

		}

		// This is the actual method that creates the object
		// passing the values to the outer class
		public Investor build() {
			return new Investor(id, budget);
		}

	}

}
