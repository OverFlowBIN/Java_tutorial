
public class AccountingIfUnder10000App {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenceRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply  + vat;
		double expence = valueOfSupply * expenceRate;
		// 만약 income이 10000이하면 1번이 모든 돈을 갖는다.
		double income = valueOfSupply - expence;
		double dividend1 = income * 1.0;
		double dividend2 = income * 0;
		double dividend3 = income * 0;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expence : " + expence);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);

	}

}
