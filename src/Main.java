import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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

        // Level up - Lista com países

        Scanner leitor = new Scanner(System.in);

        List<String> continentes = new ArrayList<>();

        LevelUp_Pais brasil = new LevelUp_Pais("Brasil", 8516000.0, 200000000);
        LevelUp_Pais argentina = new LevelUp_Pais("Argentina", 2780000.0, 44940000);
        LevelUp_Pais bolivia = new LevelUp_Pais("bolivia", 1099000.0, 11510000);
        LevelUp_Pais chile = new LevelUp_Pais("chile", 1099000.0, 11510000);

        continentes.add(bolivia.nome);
        continentes.add(brasil.nome);
        continentes.add(argentina.nome);
        continentes.add(chile.nome);

        System.out.println("Digite 1 para ver a lista de países da América do Sul");
        System.out.println("Digite 2 para sair");
        int escolha = leitor.nextInt();

        if (escolha == 1){
            System.out.println(continentes.get(0) + "\n" + continentes.get(1) + "\n" + continentes.get(2) + "\n" + continentes.get(3));
        }
        else if (escolha ==2){
            System.out.println("xau");
        }




    }
}
