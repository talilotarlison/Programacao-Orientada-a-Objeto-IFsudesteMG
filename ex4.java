/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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


public class Main
{
	public static void main(String[] args) {
	   Cao cao1;
	   cao1 =  new Cao("Mega","Grande",24);
		System.out.println(cao1.getNome());
	}
}
