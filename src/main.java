public class main {
    public static void main(String[] args) {

        // Instanciando objetos Exercício 1

        Exercicio1_Bola bolaDeFutebol = new Exercicio1_Bola(70, "branca", "nike", "rápida");
        Exercicio1_Bola bolaDeBasquete = new Exercicio1_Bola(75, "laranja", "spalding", "média");

        System.out.println(bolaDeFutebol.circunferencia);
        System.out.println(bolaDeBasquete.cor);

        // Instanciando objetos Exercício 2

        Exercicio2_Pessoa maria = new Exercicio2_Pessoa("maria", 30, 165);
        Exercicio2_Pessoa joao = new Exercicio2_Pessoa("joao", 2, 80);
        joao.peso = 20;

        System.out.println(joao.nome);
        System.out.println(joao.peso);
        System.out.println(maria.idade);
        System.out.println(maria.peso);

        // Instanciando objetos Exercício 3

        Exercicio3_ContaCorrente contaJoao = new Exercicio3_ContaCorrente("446664", "joao");
        contaJoao.saldo = 353.99;
        Exercicio3_ContaCorrente contaMaria = new Exercicio3_ContaCorrente("999000", "maria");

        System.out.println(contaMaria.saldo);
        System.out.println(contaMaria.nome);
        System.out.println(contaJoao.numeroDaConta);
        System.out.println(contaJoao.saldo);

        // Instanciando objetos Exercício 4

        Exercicio4_Carro corsa2008Sedan = new Exercicio4_Carro(4, "Corsa 2008 Sedan", "chevrolet");
        corsa2008Sedan.potencia = 1.4;

        System.out.println(corsa2008Sedan.potencia);
        System.out.println(corsa2008Sedan.marca);

    }
}
