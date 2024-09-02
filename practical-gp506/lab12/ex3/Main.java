package lab12.ex3;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Diario de um Banana", "Jeff Kinney", "2007", "123456789");
        Livro l2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "1997", "987654321");
        Livro l3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1954", "456789123");
        Livro l4 = new Livro("O Principezinho", "Antoine de Saint-Exupéry", "1943", "789123456");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.adicionarLivro(l4);

        while (true) {
            System.out.println("\n**** Biblioteca ****");
            int i = 1;
            for (Livro livro : biblioteca.getLivros()) {
                System.out.println(i + " - " + livro);
                i++;
            }
            System.out.println(">> [0]exit >> <livro>, <operação: (1)regista; (2)requisita; (3)devolve; (4)reserva; (5)cancela");
            System.out.printf(">> ");
            try{
                if (System.console().readLine().equals("0")) {
                    System.exit(0);
                    break;
                }
                String[] input = System.console().readLine().split(",");
                int livro = Integer.parseInt(input[0]);
                int operacao = Integer.parseInt(input[1]);
                switch (operacao) {
                    case 1:
                       biblioteca.registarLivro(biblioteca.getLivros().get(livro-1));
                        break;
                    case 2:
                        biblioteca.requisitarLivro(biblioteca.getLivros().get(livro-1));
                        break;
                    case 3:
                        biblioteca.devolverLivro(biblioteca.getLivros().get(livro-1));
                        break;
                    case 4:
                        biblioteca.reservarLivro(biblioteca.getLivros().get(livro-1));
                        break;
                    case 5:
                        biblioteca.cancelarReservaLivro(biblioteca.getLivros().get(livro-1));
                        break;
                    default:
                        System.out.println("Operação inválida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e);
                continue;
            }

            
        }
    }
}
