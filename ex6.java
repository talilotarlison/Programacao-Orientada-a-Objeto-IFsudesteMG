class Cao{
    public String nome;
    public String porte;
    public int idade;
    
    public Cao(String nome,String porte, int idade) {
        this.nome = nome;
        this.porte = porte;
        this.idade = idade;
    }
    
    void latir(){
        	System.out.println("au, au, au");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}

class Pitbull extends Cao { // herança
     public Pitbull(String nome,String porte, int idade) {
            super(nome,porte,idade) ;
        }
    public void latir(){
        	System.out.println("huuu,huuu,huuuu"); // polimofismo 
    }
}
class Pinscher extends Cao {// herança
     public Pinscher(String nome,String porte, int idade) {
            super(nome,porte,idade) ;
        }
        void latir(){
        	System.out.println("ai,ai,ai");// polimofismo 
    }
}

public class Main
{
	public static void main(String[] args) {
	   Pitbull cao1;
	   cao1 =  new Pitbull("Alfa","Grande",24);
		System.out.println(cao1.getNome());
		cao1.latir();
		
		Pinscher cao2;
	   cao2 =  new Pinscher("Mega","Grande",4);
		System.out.println(cao2.getNome());
		cao2.latir();
	}
}
