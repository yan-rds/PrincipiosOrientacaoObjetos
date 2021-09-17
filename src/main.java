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

    }
}
