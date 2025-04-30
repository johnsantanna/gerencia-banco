package com.johnsolucoes.gerenciaBanco;

public class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo = 0.0;

    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    /**
     * @return true se saque bem-sucedido, false se saldo insuficiente
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // getters para nome, sobrenome, cpf (opcional)
}
