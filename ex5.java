 class ClasseMinha {
    private String valor1;
    private int valor2;

    public ClasseMinha(String valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }
}

public class Main {
    public static void main(String[] args) {
        ClasseMinha minhaInstancia;
        minhaInstancia = new ClasseMinha("Olá, mundo!", 42);

        System.out.println(minhaInstancia.getValor1()); // Imprime "Olá, mundo!"
        System.out.println(minhaInstancia.getValor2()); // Imprime 42
    }
}