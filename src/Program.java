import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		 
		ArrayList<Company> companies = new ArrayList<>();
		ArrayList<Investor> investors = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 1; i < 101; i++) {
			int min = 500, max = 1000, minPrice = 10, maxPrice = 100; 
			Company company = new Company();
			company.setId(i);
			company.setShares(min + random.nextInt(max));
			company.setPrice(minPrice + random.nextInt(maxPrice));
			companies.add(company);
		}
		
		for (Company company : companies) {
			System.out.println("Company ID: " + company.getId() + " Shares: " + company.getShares() + " Price: " + company.getPrice());
		}
		
		for (int i = 1; i < 101; i++) {
			Investor investor = new Investor();
			investor.setId(i);
			investors.add(investor);
		}
		
		for (Investor investor : investors) {
			System.out.println("Investor ID: " + investor.getId());
		}
		
		
		System.out.println("RANDOM: " + random.nextInt(100));
	}

}

