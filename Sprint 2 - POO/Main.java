public class Main {
     // EXERCÍCIO 1 - CLASSE PESSOA
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Sarah";
        pessoa1.idade = 1800;
        pessoa1.cidade = "São Luís";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Àgata";
        pessoa2.idade = 210;
        pessoa2.cidade = "Santa Inês";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Pedro";
        pessoa3.idade = 60;
        pessoa3.cidade = "Barreirinhas";

         System.out.println("EXERCÍCIO 1- PESSOAS");

        if (pessoa1.idade >= pessoa2.idade && pessoa1.idade >= pessoa3.idade) {

            System.out.println("A pessoa mais velha é " + pessoa1.nome);

        } else if (pessoa2.idade >= pessoa1.idade && pessoa2.idade >= pessoa3.idade) {

            System.out.println("A pessoa mais velha é " + pessoa2.nome);

        } else {

            System.out.println("A pessoa mais velha é " + pessoa3.nome);
        }
    


        Carro carro1 = new Carro();
        carro1.modelo = "Sedan";
        carro1.ano = 2020;
        carro1.cor = "Prata";

        Carro carro2 = new Carro();

        carro2.modelo = "Hatch";
        carro2.ano = 2019;
        carro2.cor = "Preto";

    // Alterando apenas o carro1
         carro1.cor = "Vermelho";

    // A alteração em carro1 não afetou carro2 porque cada objeto é uma instância independente da classe Carro e possui seus próprios atributos

       System.out.println("\nEXERCÍCIO 2 - CARROS");

       System.out.println("\nCarro 1:");
       System.out.println("Modelo: " + carro1.modelo);
       System.out.println("Ano: " + carro1.ano);
       System.out.println("Cor: " + carro1.cor);

       System.out.println("\nCarro 2:");
       System.out.println("Modelo: " + carro2.modelo);
       System.out.println("Ano: " + carro2.ano);
       System.out.println("Cor: " + carro2.cor);
    }
}

