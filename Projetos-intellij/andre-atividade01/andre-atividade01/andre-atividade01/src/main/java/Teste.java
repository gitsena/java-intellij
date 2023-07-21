import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Integer opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Apresentando os Personagem!");

        ListaObj<Personagem> personagem = new ListaObj(10);

        do{
            System.out.println("Escolha a opção desejada: (digite 1, 2 ou 3)");
            System.out.println("1 - Adicionar um Personagem");
            System.out.println("2 - Exibir Ficha do Personagem");
            System.out.println("3 - Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o identificador do personagem:");
                    int id = leitor.nextInt();

                    System.out.println("Digite o tipo de personagem (Herói ou Vilão):");
                    String tipo = leitorNl.nextLine();

                    System.out.println("Digite o codinome:");
                    String codNome = leitorNl.nextLine();

                    System.out.println("Digite o valor de ataque:");
                    Double ataque = leitor.nextDouble();

                    System.out.println("Digite o valor de defesa:");
                    Double defesa = leitor.nextDouble();

                    System.out.println("Digite o nivel:");
                    int nivelPoder = leitor.nextInt();

                    personagem.adiciona(new Personagem(id, tipo, codNome, ataque,defesa, nivelPoder));

                    System.out.println("Personagem adicionado!");
                    break;
                case 2:
                    System.out.println("");
                    System.out.printf("%-13s %-5s %-8s %12s %6s %5s \n", "Nº PERSONAGEM", "TIPO", "CODINOME", "ATAQUE", "DEFESA", "NIVEL");
                    for (int i = 0; i < personagem.getTamanho(); i++){
                        Personagem p = personagem.getElemento(i);
                        System.out.printf("%013d %-5s %-8s %12.2f %6.2f %5d \n", p.getId(), p.getTipo(), p.getCodNome(), p.getAtaque(), p.getDefesa(), p.getNivelPoder());
                    }
                    System.out.printf("");
                    break;
                case 3:
                    System.out.println("Obrigada por utilizar :)");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        } while (opcao != 3);
    }
}
