public class Elevador {

    private int andarAtual;
    private double pesoMaximo;
    private double pesoAtual;

    public Elevador(int andarAtual, double pesoMaximo) {
        this.andarAtual = andarAtual;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public void adicionarPeso(double peso) {
        pesoAtual += peso;
    }

    public void subir() {
        if (pesoAtual > pesoMaximo) {
            System.out.println(
                "Excesso de peso! O elevador não vai sair do andar "
                + andarAtual + "."
            );
        } else {
            andarAtual++;

            System.out.println(
                "Elevador subiu e parou no andar "
                + andarAtual + "."
            );
        }
    }
}