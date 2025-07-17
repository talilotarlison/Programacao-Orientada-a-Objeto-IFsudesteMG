/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Cao {
    public String nome;
    public String porte;
    public int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeAgora) {
        this.nome = nomeAgora;
    }

    private String getPorte() {
        return porte;
    }

    private void setPorte(String porteAgora) {
        this.porte = porteAgora;
    }
    
    public void latir(){
         System.out.println("Cao: hi, hi!");
    }

    public void novoCao() {
        Cao c = new Cao();
        c.setPorte("Medio");
        System.out.println("Porte do cao: " + c.getPorte());
    }
}

 class Pinscher extends Cao {
    public void latir() {
        System.out.println("Pinscher: Ai, ai!");
    }
}

 class Pitbull extends Cao {
    public void latir() {
        System.out.println("Pitbull: Auu, auu!");
    }
}


public class Main
{
	public static void main(String[] args) {
	    Cao c = new Cao();
	    c.setNome("Mel");
		System.out.println(c.getNome());
	    c.latir();
	    Pinscher d = new Pinscher();
	    d.setNome("Bilu");
		System.out.println(d.getNome());
	    Pitbull e = new Pitbull();
	    d.latir();
	    e.setNome("Liao");
		System.out.println(e.getNome());
	    e.latir();
	}
}
