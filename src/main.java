public class main {
    public static void main(String[] args) {

        Exercicio1_Bola bolaDeFutebol = new Exercicio1_Bola(70, "branca", "nike", "rápida");
        Exercicio1_Bola bolaDeBasquete = new Exercicio1_Bola(75, "laranja", "spalding", "média");

        System.out.println(bolaDeFutebol.circunferencia);
        System.out.println(bolaDeBasquete.cor);
    }
}
