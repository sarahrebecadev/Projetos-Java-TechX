public class Main {

    public static void main(String[] args) {

        Elevador elevador = new Elevador(0, 500);

        System.out.println("=== CONTROLE DO ELEVADOR ===");

        // Cenário 1: subida bem-sucedida
        System.out.println("\n--- Subida normal ---");

        elevador.adicionarPeso(300);
        elevador.subir();

        // Cenário 2: tentativa bloqueada por excesso de peso
        System.out.println("\n--- Excesso de peso ---");

        elevador.adicionarPeso(300);
        elevador.subir();
    }
}