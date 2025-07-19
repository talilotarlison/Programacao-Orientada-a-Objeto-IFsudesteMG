 class Cao {
    public void latir() {
        System.out.println("Cão latindo");
    }
}

 class Pinscher extends Cao {
    @Override
    public void latir() {
        System.out.println("Pinscher latindo fininho");
    }
}



public class Main
{
	public static void main(String[] args) {
	    Cao meuCaoOriiginal = new Cao();
	    meuCaoOriiginal.latir();
	    // Polimorfismo:
        Cao meuCao = new Pinscher();
        meuCao.latir(); // Saída: "Pinscher latindo fininho"
		System.out.println("Fim do programa.");
	}
}
