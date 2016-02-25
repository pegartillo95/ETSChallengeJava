package ETS.Pruebas;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeAnalyzer analyzer = new PalindromeAnalyzer();
		String text[] = {"AZ", "ZZ", "A"};
		
		System.out.println(analyzer.SummaryLength(text));
		
		ConstructorMatriz cons = new ConstructorMatriz();
		cons.Construir(4, 5, 2, 1);
	}

}
