
public class Main {
	
	public static void main(String[] args) {
			Facade facade = new Facade();
			
			System.out.println(facade.cadastrarCenario("flamengo campeao"));
			System.out.println(facade.cadastrarCenario("palmeiras campeao"));
			System.out.println(facade.cadastrarCenario("inter campeao"));
			System.out.println(facade.cadastrarCenario("lalalaooo"));
			
			System.out.println(facade.exibirCenarios());
			
			
			
		
		
	}

}
