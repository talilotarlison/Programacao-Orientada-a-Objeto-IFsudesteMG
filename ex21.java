import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe principal que contém o método main
public class BancoDigital {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("123456", "João Silva", TipoConta.CORRENTE);
        ContaBancaria conta2 = new ContaBancaria("654321", "Maria Souza", TipoConta.POUPANCA);

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(conta2, 300);

        conta1.exibirExtrato();
        conta2.exibirExtrato();
    }
}

// Enum para tipos de conta
enum TipoConta {
    CORRENTE, POUPANCA, SALARIO
}

// Enum para status da conta
enum StatusConta {
    ATIVA, BLOQUEADA, INATIVA
}

// Classe que representa uma transação
class Transacao {
    private final String tipo;
    private final double valor;
    private final LocalDate data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public String toString() {
        return data + " - " + tipo + ": R$ " + valor;
    }
}

// Classe que representa a conta bancária
class ContaBancaria {
    private final String numeroConta;
    private double saldo;
    private final String titular;
    private final TipoConta tipo;
    private final LocalDate dataAbertura;
    private StatusConta status;
    private final List<Transacao> historico;

    public ContaBancaria(String numeroConta, String titular, TipoConta tipo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipo = tipo;
        this.dataAbertura = LocalDate.now();
        this.status = StatusConta.ATIVA;
        this.historico = new ArrayList<>();
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (status != StatusConta.ATIVA) {
            System.out.println("Conta não está ativa para depósito.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        historico.add(new Transacao("Depósito", valor));
    }

    public void sacar(double valor) {
        if (status != StatusConta.ATIVA) {
            System.out.println("Conta não está ativa para saque.");
            return;
        }
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saque inválido. Verifique o valor.");
            return;
        }
        saldo -= valor;
        historico.add(new Transacao("Saque", valor));
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (this.status != StatusConta.ATIVA || destino.status != StatusConta.ATIVA) {
            System.out.println("Uma das contas não está ativa.");
            return;
        }
        if (valor <= 0 || valor > this.saldo) {
            System.out.println("Transferência inválida. Verifique o valor.");
            return;
        }
        this.saldo -= valor;
        destino.saldo += valor;
        this.historico.add(new Transacao("Transferência enviada", valor));
        destino.historico.add(new Transacao("Transferência recebida", valor));
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void bloquear() {
        this.status = StatusConta.BLOQUEADA;
    }

    public void desbloquear() {
        this.status = StatusConta.ATIVA;
    }

    public void exibirExtrato() {
        System.out.println("\nExtrato da conta " + numeroConta + " - " + titular);
        for (Transacao t : historico) {
            System.out.println(t);
        }
        consultarSaldo();
    }

    // Getters opcionais, se precisar acessar propriedades externamente
    public String getNumeroConta() {
        return numeroConta;
    }

    public StatusConta getStatus() {
        return status;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
}
